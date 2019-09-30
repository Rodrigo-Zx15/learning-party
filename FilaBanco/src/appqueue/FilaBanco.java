/*
        
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appqueue;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author alunop2
 */
public class FilaBanco {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args)  {
        //CirQueue cQ = new CirQueue(5);
        FilaCliente fn = new FilaCliente(5);
        FilaCliente fi = new FilaCliente(5);
        Cliente cliente;
        boolean filaVazia = false;
        boolean idoso = true;
        Scanner input = new Scanner(System.in);
        Scanner inputs = new Scanner(System.in);
        int op;
        
        
        //menu();
        //op = input.nextInt();
        do{
            
            
            menu();
            op = input.nextInt();
            switch(op){
                
                case 1:
                    int idade;
                    String nome;
                    System.out.println("Digite o nome do cliente:");
                    nome = inputs.next();
                    System.out.println("Digite a idade do cliente:");
                    idade = input.nextInt();                   
                    cliente = new Cliente(nome, idade);
                    if(cliente.getIdade() > 59){
                        try {
                            fi.enqueue(cliente);
                        }catch (fullFilaException ex) {
                            System.out.println(ex);
                        }
                    }else{    
                        try {
                            fn.enqueue(cliente);
                        } catch (fullFilaException ex) {
                            System.out.println(ex);
                        }
                    }
                    break;
                case 2:
                    try{
                        if(idoso && !fi.isEmpty()){
                            cliente = fi.front();
                            System.out.println("O prox cliente eh o Sr(a).: " + cliente.getNome() + " de " + cliente.getIdade() + " anos." );
                        }
                        else if(!fn.isEmpty()){
                            cliente = fn.front();
                            System.out.println("O prox cliente eh o(a): " + cliente.getNome() + " de " + cliente.getIdade() + " anos." );
                        } else if(!fi.isEmpty()){
                            cliente = fi.front();
                            System.out.println("O prox cliente eh o Sr(a).: " + cliente.getNome() + " de " + cliente.getIdade() + " anos." );
                            
                        }else{
                            System.out.println("Filas vazias.");
                        }
                    }catch(NoSuchElementException ex){
                        System.out.println(ex);
                    }
                    break;
                case 3:
                    try{
                        if(idoso && !fi.isEmpty()){
                            cliente = fi.dequeue();
                            System.out.println("Atendendo o Sr(a).: " + cliente.getNome() + " de " + cliente.getIdade() + " anos.");
                            idoso = false;
                        }
                        else if(!fn.isEmpty()){
                            cliente = fn.dequeue();
                            System.out.println("Atendendo o(a): " + cliente.getNome() + " de " + cliente.getIdade() + " anos." );
                            idoso = true;
                        }
                        else if(!fi.isEmpty()){
                            cliente = fi.dequeue();
                            System.out.println("Atendendo o Sr(a).: " + cliente.getNome() + " de " + cliente.getIdade() + " anos." );
                            idoso = true;
                        }else{
                            System.out.println("Filas vazias.");
                        }
                    }catch(NoSuchElementException | ArrayIndexOutOfBoundsException ex){
                        System.out.println("Fila vazia: " + ex);
                    }
                    break;
                case 4:
                    if(fi.isEmpty() && fn.isEmpty()){
                        filaVazia = true;
                        System.out.println("Finalizando...");
                    }else{
                        filaVazia = false;
                        System.out.println("não.");
                    }
                    break;
            }
            
            
            
        }while(filaVazia != true && op != 4);

        
    }

    static void menu(){
        System.out.println("=============BEM-VINDO!!!=============");
        System.out.println("Escolha uma das seguintes opções:\n"
                + "|1| - Cadastrar cliente;\n"
                + "|2| - Verificar prox cliente;\n"
                + "|3| - Atender um cliente;\n"
                + "|4| - fim");
    }    
}


/*
            f.enqueue(1);
            f.enqueue(2);
            f.enqueue(3);
            f.enqueue(4);
            System.out.println("a:" + f.dequeue());
            System.out.println("a:" + f.dequeue());
            System.out.println("a:" + f.dequeue());
            System.out.println("a:" + f.dequeue());
            for(int i = 0;i < 5;i++){
            try {
            f.enqueue(i);
            } catch (fullFilaException ex) {
            System.out.println(ex);
            }
            }
            for(int i = 0; i < 5;i++){
                cQ.enqueue(i);
                System.out.println("b: " +i);
                
            }
            cQ.enqueue(1);
            
            cQ.enqueue(2);
            
            cQ.enqueue(3);
           
            cQ.enqueue(4);
            //cQ.enqueue(5);
            
            */