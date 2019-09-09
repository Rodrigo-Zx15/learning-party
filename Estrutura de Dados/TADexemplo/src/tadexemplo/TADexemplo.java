/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tadexemplo;

import java.util.Scanner;

/**
 *
 * @author alunop2
 */
public class TADexemplo {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
       int [] vetor = new int [n];
       Vetor tadVetor = new Vetor(n);
       try{
            vetor[-5] = 100;
            System.out.println(vetor[5]);
       }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Erro: " + ex.getMessage());
            ex.printStackTrace();
       }
    }
    
}
