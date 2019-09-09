
package app;
import java.util.*;


public class App {

    public static void main(String[] args) throws PilhaCheiaException {
       Scanner input = new Scanner(System.in);
       
       Pilha pilha = new Pilha(5);
       Stack stack = new Stack(8);
       Pilha pilha2 = new Pilha(5);
       int f;
       int i = 0;
       
       do{
           
           System.out.println("escolha opçao: 1 inserir site 2 voltar 3 avamsa");
           f = input.nextInt();
           switch(f){
               case 1:
                   try{
                       int o;
                       
                       System.out.println("digite numero");
                       o = input.nextInt();
                       pilha.push(o);
                       i++;
                   }catch(PilhaCheiaException ex){
                       System.out.println(ex);
                   }
                   break;
               
               case 2:
                   try{
                       pilha2.push(pilha.pop());
                       System.out.println("o num e: " + pilha.peek());
                   }catch(EmptyStackException ex){
                       System.out.println(ex);
                   }
                   break;
               case 3:
                   pilha.push(pilha2.pop());
                   System.out.println("Avançou pra: " + pilha.peek());
                   break;
               default:
                   System.out.println("Digite novament");
                   
                   
           
           }
       }
       while(f != -1 || i < 5);
        try {
       //     pilha.push(9);
            stack.push('t');
            stack.push('e');
            stack.push('s');
            stack.push('t');
            stack.push('a');
            stack.push('n');
            stack.push('d');
            stack.push('o');
        } catch (PilhaCheiaException ex) {
            System.out.println(ex);
        }
        /*for(int i = 1;i < 5;i++){
            try{
                pilha.push(i);
                System.out.println("Pushando o elemento: " + (i+1) + "\n");
            }catch(PilhaCheiaException ex){
                System.out.println(ex);
            }
        }
        for(int m = 0;i < 8;m++){
            try{
                System.out.println(stack.pop());
            }catch(EmptyStackException ex){
                System.out.println("Pilha vazia garai:\n" + ex);
            }
        }
        
        System.out.println("Tamanho da pilha: " + pilha.size());
        System.out.println("O elemento do topo é: " + pilha.peek());
        System.out.println("A pilha está cheia? " + pilha.isFull());
        System.out.println("A pilha está vazia? " + pilha.isEmpty());*/
    }
    
}
