
package com.rafa.cursojava.exerciciosLista04;

import java.util.Scanner;

/**
 *
 * @author Raphaa JP
 */
public class Exer13 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        int vetA[] = new int [10];
        
        for(int i = 0; i < vetA.length; i++){
            System.out.println("Informe o valor da posição: " + i);
            vetA [i] = scan.nextInt();
        }
        
        int soma = 0;
        for (int i = 0; i < vetA.length; i++){
            if (vetA [i] % 5 == 0){
            soma += vetA[i];
            }
        }
          
        System.out.print("Vetor A = ");
        for (int i = 0; i < vetA.length; i++){
            System.out.print(vetA [i] + " ");
        }

        System.out.println();
        
        System.out.println("A soma é: " + soma);
        }
        
    }
