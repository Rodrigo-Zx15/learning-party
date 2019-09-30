/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appqueue;

import java.util.NoSuchElementException;

public interface FilaBancoInterface {
    public void enqueue(Cliente element) throws fullFilaException;
    public Cliente dequeue() throws NoSuchElementException;
    public int size();
    public Cliente front() throws NoSuchElementException;
    public boolean isFull();
    public boolean isEmpty();
}
