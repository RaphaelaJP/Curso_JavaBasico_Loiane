package com.rafa.cursojava.exerciciosLista04;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Raphaa JP
 */
public class Exer10 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int vetorA [] = new int[10];
        int vetorB [] = new int[vetorA.length];
        
        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Informe o valor da posição: " + i);
            vetorA[i] = scan.nextInt();
            
            vetorB[i] = vetorA[i] % 2;
        }
    
        
        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA [i] + " ");
        }
        System.out.println();
        
        System.out.print("Vetor B = ");
        for(int i = 0; i < vetorB.length; i++){
            System.out.print(vetorB [i] + " ");
        }
    }
    
}
