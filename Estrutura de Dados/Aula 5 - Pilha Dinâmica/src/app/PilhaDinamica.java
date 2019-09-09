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
public class PilhaDinamica implements TADPilha {
    private Node topo;
    
    public PilhaDinamica(){
        topo = null;
    }
    @Override
    public void push(int elemento) throws PilhaCheiaException {
       Node novo = new Node(elemento);
       novo.proximo = topo;
       topo = novo;
       
    }

    @Override
    public int pop() throws EmptyStackException {
        if(topo != null){
        Node auxRetorno = topo;
        topo = topo.proximo;
        auxRetorno.proximo = null;
        return auxRetorno.elemento;
        }
        throw new EmptyStackException();
    }

    @Override
    public int peek() throws EmptyStackException {
        if(topo != null){
            return topo.elemento;
        }
        throw new EmptyStackException();
    }

    @Override
    public boolean isEmpty() {
        return topo == null;
    }

    @Override
    public int size() {
        int cont = 0;
        Node aux;
        aux = topo;
        while(aux != null){
            cont++;
            aux = aux.proximo;
            
        }
        return cont;
    }
}
