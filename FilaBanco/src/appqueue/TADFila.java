
package appqueue;

import java.util.NoSuchElementException;


public interface TADFila {
    public void enqueue(int element) throws fullFilaException;
    public int dequeue() throws NoSuchElementException;
    public int size();
    public int front() throws NoSuchElementException;
    public boolean isFull();
    public boolean isEmpty();
}
