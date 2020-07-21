package com.rafa.cursojava.exerciciosLista04;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Raphaa JP
 */
public class Exer04 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        double vetorA [] = new double [15];
        double vetorB [] = new double [vetorA.length];
        
        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Informe o valor da posição: " + i);
            vetorA [i] = scan.nextInt();
            
            vetorB [i] = Math.sqrt(vetorA [i]); // raiz quadrada do vetor A
        }
        
        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++ ){
            System.out.print(vetorA [i] + " "); 
        }
        
        System.out.println();
        
        DecimalFormat df = new DecimalFormat("###,###.###");
        
        System.out.print("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++){
            System.out.print(df.format(vetorB [i]) + " ");
        }
    }
}