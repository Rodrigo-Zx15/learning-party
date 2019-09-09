/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tadexemplo;

/**
 *
 * @author alunop2
 */
public interface TADvetor {
    public void add(int valor, int posição) throws PosicaoInvalidaException;
    public int search(int valor) throws ElementoNaoEncontrado;
    public int get(int valor);
}
