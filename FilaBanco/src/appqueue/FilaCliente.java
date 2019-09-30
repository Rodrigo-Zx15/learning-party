/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appqueue;

import java.util.NoSuchElementException;

public class FilaCliente implements FilaBancoInterface {
    private Cliente[] queue;
    private int end, start;
    private int qnt;
    
    public FilaCliente(int tamanho){
        queue = new Cliente[tamanho];
        end = start = -1;
        qnt = 0;
    }
    @Override
    public void enqueue(Cliente element) throws fullFilaException {
        if(qnt < queue.length){
            end++;
            queue[end] = element;
            if(start == -1){
                start++;
            }
            qnt++;
        }else{
            throw new fullFilaException("fila cheia!");
        }
        
    }

    @Override
    public Cliente dequeue() throws NoSuchElementException {
        if(qnt > 0){
            Cliente first = queue[start];
            for(int i = 0;i < end;i++){
                queue[i] = queue[i+1];
            }
            end--;
            
            if(end == -1){
                start--;                
            }
            qnt--;
            return first;
        }
        throw new NoSuchElementException("fila vazia!");
    }

    @Override
    public int size() {
        return qnt;
    }
    @Override
    public boolean isEmpty() {
        return start == -1;
    }

    @Override
    public Cliente front() throws NoSuchElementException {
        if(!isEmpty()){
            Cliente front = queue[start];
            return front;
        }
        throw new NoSuchElementException("fila vazia!");
    }

    @Override
    public boolean isFull() {
        return end == queue.length-1;
    }

    
    
}
