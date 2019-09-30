/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appqueue;

public class Cliente {
    private int idade;
    private String nome;

    public Cliente(String nome, int idade) {
        this.nome = nome;
        setIdade(idade);
        
    }

    public int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        if(idade <= 0){
            this.idade = 18;
        }else{
            this.idade = idade;
        }
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
