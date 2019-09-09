
package app;

import java.util.EmptyStackException;

/**
 *
 * @author Zx
 */
public interface ADTStack {
    public void push(char elemento) throws PilhaCheiaException;
    public char pop() throws EmptyStackException;
    public char peek() throws EmptyStackException;
    public boolean isEmpty();
    public boolean isFull();
    public int size();
}
