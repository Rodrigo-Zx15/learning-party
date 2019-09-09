
package revisao;


import java.util.ArrayList;
import java.util.Scanner;


public class Revisao {
    
   
    public static void main(String[] args) {
        int op = 0;
        Scanner input = new Scanner(System.in);
        int num, q, tipo;
        
        ArrayList <Mesa> listaMesa = new ArrayList <>();
        System.out.println("ae man escolhe as opções thank");
        do{
            menu();
            op = input.nextInt();
            switch(op){
                case 1:
                    System.out.println("Digite o nº da mesa: ");
                    num = input.nextInt();
                    System.out.println("Digite a qnt de pessoas na mesa: ");
                    q = input.nextInt();
                    Mesa m = new Mesa(num, q);
                    listaMesa.add(m);
                    break;
                case 2: 
                    break;
                case 3:
                    
                    break;
                case 4:
                    break;
                
                
                default: 
                    System.out.println("Digite novamente comedia");
            }
        }while(op != 0); 
    }
    
    
    
    
    
    
    
    
    
    
    static void menu(){
            System.out.println("====== MENU ======");
            System.out.println("Digite uma opção:\n1 Adicionar uma mesa - \n"
                + "2 - Comprar p/ mesa \n"
                + "3 - Exibir dados de uma mesa \n"
                + "4 - Remover mesa \n"
                + "5 - ?????\n"
                + "0 - Sair");
    
    }
}
