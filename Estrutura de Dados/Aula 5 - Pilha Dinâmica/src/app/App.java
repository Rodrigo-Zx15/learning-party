
package app;
import java.util.*;


public class App {

    public static void main(String[] args) {
       //Scanner input = new Scanner(System.in);
         PilhaDinamica pilha = new PilhaDinamica();
//       Pilha p = new Pilha();
//       
        try {
            pilha.push(9);
        } catch (PilhaCheiaException ex) {
            System.out.println(ex);
        }
        for(int i = 1;i < 5;i++){
            try{
                pilha.push(i);
                System.out.println("Pushando o elemento: " + (i+1) + "\n");
            }catch(PilhaCheiaException ex){
                System.out.println(ex);
            }
        }
        for(int i = 0;i < pilha.size();i++){
            try{
                System.out.println("Popando o elemento: "+ pilha.pop() + "\n");
            }catch(EmptyStackException ex){
                System.out.println("Pilha vazia garai:\n" + ex);
            }
        }
//        
        //System.out.println("Tamanho da pilha: " + pilha.size());
        //System.out.println("O elemento do topo é: " + pilha.peek());
//        System.out.println("A pilha está cheia? " + pilha.isFull());
       System.out.println("A pilha está vazia? " + pilha.isEmpty());
          
          
    }
    
}
