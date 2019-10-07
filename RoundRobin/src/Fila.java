
import java.util.NoSuchElementException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zx
 */
public class Fila implements TADFilaDin {
    private int quant = 0;
    private NodeProcesso start;
    private NodeProcesso end;
    public Fila(){
        start = end = null;
    }
    
    @Override
    public int size() {
        return quant;
    }
    
    @Override
    public boolean isEmpty() {
        return quant == 0;
    }

    @Override
    public void enqueue(int priority, int size, boolean es) {
        NodeProcesso novo = new NodeProcesso(priority, size, es);
        if(isEmpty()){
            start = novo;
        }else{
            end.next = novo;
        }
        end = novo;
        quant++;
    }

    @Override
    public NodeProcesso dequeue() throws NoSuchElementException {
        NodeProcesso inicio = start;
        if(!isEmpty()){
            if(quant == 1){
                start = end = null;
            }else{
                start = start.next;
                start.next = null;
            }
            quant--;
            return inicio;
        }
        throw new NoSuchElementException("Empty queue.");
    }


    @Override
    public NodeProcesso front() throws NoSuchElementException {
        if(!isEmpty()){
            return start;
        }
        throw new NoSuchElementException("Empty queue.");
    }

    
    
}
