/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.EmptyStackException;

/**
 *
 * @author alunop2
 */
public class Pilha implements TADPilha {
    private int topo;
    private int [] pilha;
    public Pilha(int tamanho){
        topo = -1;
        if(tamanho >=1){
            pilha = new int[tamanho];
        }else{
            pilha = new int[1];
        }
    }
    

    @Override
    public int peek() throws EmptyStackException {
        if(!isEmpty()){
            return pilha[topo];
            
        }
        throw new EmptyStackException();
    }

    @Override
    public boolean isEmpty() {
        /*if(topo == -1){
            return true;
        }
        return false; */
        return topo == -1;
    }

    @Override
    public boolean isFull() {
        /*(if(topo == (pilha.length -1)){
            return true;
        }
        return false;*/
        return topo == (pilha.length-1);
    }

    @Override
    public int size() {
        
        return topo+1;
    }
    @Override
    public void push(int elemento) throws PilhaCheiaException {
        if(topo ==(pilha.length-1)){
            
            throw new PilhaCheiaException("Pilha cheia man...");
        }
        topo++;
        pilha[topo] = elemento;    
            
        
    }

    @Override
    public int pop() throws EmptyStackException {
        if(topo == -1){
            throw new EmptyStackException();
           
        }
            
        topo--;
        return pilha[topo+1];
    }
    
    
}
