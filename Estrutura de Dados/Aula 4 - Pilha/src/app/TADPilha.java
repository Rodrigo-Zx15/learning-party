
package app;

import java.util.EmptyStackException;

/**
 *
 * @author alunop2
 */
public interface TADPilha {
    public void push(int elemento) throws PilhaCheiaException;
    public int pop() throws EmptyStackException;
    public int peek() throws EmptyStackException;
    public boolean isEmpty();
    public boolean isFull();
    public int size();
}
