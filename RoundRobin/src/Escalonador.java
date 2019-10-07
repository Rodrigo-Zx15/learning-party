/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Zx
 */
public class Escalonador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NodeProcesso p;
        int quantum = 5;
        int size;
        boolean ass;
        Fila f = new Fila();
        Fila f2 = new Fila();
        f.enqueue(1,22,false);
        f.enqueue(0, 5,true);
        f.enqueue(3, 2, false);
        //f.enqueue(0, 5);
        //f.dequeue();
       
        
        int espera = 0;
        while(!(f.isEmpty())){
            p = f.dequeue();
            ass = p.getInputOutput();
            /*here's the problem: if I uncomment the code below (that should've placed 
            the i/o process in another queue, I'm blessed with a NoSuchElementException.
            
            */
            /*if(ass == true){
                size = p.getSize();
                size--;
                p.setSize(size);
                f2.enqueue(p.getPriority(), p.getSize(), p.getInputOutput());
                p = f.dequeue();
            }*/
            for(int tempo = quantum;tempo > 0;tempo--){
                size = p.getSize();
                espera++;
                size--;
                
                p.setSize(size);
                if(size <= 0){
                    size = 0;
                    //f.dequeue();
                    tempo = 0;
                }
   
            }
            if(!(f2.isEmpty())){
                NodeProcesso suporte;
                suporte = f2.dequeue();
                f.enqueue(suporte.getPriority(), suporte.getSize(), suporte.getInputOutput());
            }
            if(p.getSize() > 0){
                f.enqueue(p.getPriority(), p.getSize(), p.getInputOutput());
            }
            
            
        }
//        
        System.out.println("\n===Total Excecution Time====\n" + 
                espera);
//        while(!(f.isEmpty())){
//            p = f.dequeue();
//            System.out.println("Prio: " + p.getPriority() + "\n"
//                    + "Tam: " + p.getSize() + "\n");
//        }
        
    }
    
}
