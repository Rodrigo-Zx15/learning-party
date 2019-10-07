


import java.util.NoSuchElementException;

public interface TADFilaDin {
    public void enqueue(int prioridade, int tamanho, boolean es);
    public NodeProcesso dequeue() throws NoSuchElementException;
    public int size();
    public NodeProcesso front() throws NoSuchElementException;
    //public boolean isFull();
    public boolean isEmpty();
}
