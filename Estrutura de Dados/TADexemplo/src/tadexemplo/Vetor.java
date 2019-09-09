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
public class Vetor implements TADvetor {
    private int[] vetor;
    Scanner input = new Scanner(System.in);
    public Vetor(int tamanho) {
        if(tamanho >= 1){
            vetor = new int[tamanho];
        }else{
            vetor = new int[1];
        }
    }
    
    @Override
    public void add(int valor, int posição) throws PosicaoInvalidaException {
        if(posição >=0 && posição < vetor.length){
            vetor[posição] = valor;
        }else{
            throw new PosicaoInvalidaException("Posição inválida: " + posição);
        }    
    }

    @Override
    public int search(int valor) throws ElementoNaoEncontrado {
        
        int resul = 0;
        for(int i = 0; i <= vetor.length;i++){
            if(valor == vetor[i]){
                resul = i;
                
                
            }
                //System.out.println("Não encontrado.");
            throw new ElementoNaoEncontrado("Elemento nao encontrado.");
                //resul = -1;
            
        }
        return resul;
        
    }

    @Override
    public int get(int posicao) {
        int result = 0;
        if(posicao >= 0 && posicao <= vetor.length)
            result = vetor[posicao];
        return result;
        
    }
    
}
