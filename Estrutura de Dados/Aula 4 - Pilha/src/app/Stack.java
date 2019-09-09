/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.EmptyStackException;

public class Stack implements ADTStack{
    private int topo;
    private char [] stack;
    public Stack(int tamanho){
        topo = -1;
        if(tamanho >=1){
            stack = new char[tamanho];
        }else{
            stack = new char[1];
        }
    }
    
    public void push(char elemento) throws PilhaCheiaException {
        if(topo == (stack.length-1)){
            throw new PilhaCheiaException("foda...pilha cheia");
        }
        topo++;
        stack[topo] = elemento;
    }

    @Override
    public char pop() throws EmptyStackException {
        if(topo == -1){
            throw new EmptyStackException();
        }
        topo--;
        return stack[topo+1];
    }

    @Override
    public char peek() throws EmptyStackException {
        return stack[topo];
    }

    @Override
    public boolean isEmpty() {
        return topo == -1;
    }

    @Override
    public boolean isFull() {
        return topo ==(stack.length-1);
    }

    @Override
    public int size() {
        return topo+1;
    }
    
}
