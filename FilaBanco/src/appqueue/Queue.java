
package appqueue;

import java.util.NoSuchElementException;


public class Queue implements TADFila {
    private int start;
    private int end;
    private int queue[];
    
    public Queue(int tamanho){
        this.start = -1;
        this.end = -1;
        queue = new int [tamanho];
    }
    @Override
    public void enqueue(int element) throws fullFilaException {
        if(end == -1){
            start++;
        }
        else if(end == (queue.length+1)){
            throw new fullFilaException();
        }
        end++;
        queue[end] = element;
    }

    @Override
    public int dequeue() throws NoSuchElementException, ArrayIndexOutOfBoundsException {
        int first = queue[start];
        if(end == -1){
            throw new ArrayIndexOutOfBoundsException("nada aqui man");
        }
        
        for(int i = 0;i < end;i++){
            
            queue[i] = queue[i+1];
            
        }
        end--;
        if(end == -1){
            start = -1;
        }
        return first;
    }

    @Override
    public int size() {
        return end+1; 
    }

    @Override
    public int front() throws NoSuchElementException {
        if(end == -1){
            throw new NoSuchElementException("foda, sem elemento");
        }
        return queue[start];
    }

    @Override
    public boolean isFull() {
        return end == (queue.length+1);
    }

    @Override
    public boolean isEmpty() {
        return end == -1;
    }
    
}
