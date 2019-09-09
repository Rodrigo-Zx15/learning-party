
package ExercícioPOO;
import java.util.Scanner;

public class App {
    //GerenciaMesas g = new GerenciaMesas();
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       Scanner inputS = new Scanner (System.in);
       int op;
       int numMesa, qntPessoas;
       do{
           menu();
           op = input.nextInt();
           switch(op){
               case 1:
                   System.out.println("Digite o número da mesa.");
                   numMesa = input.nextInt();
                   System.out.println("Digite a quantidade de pessoas na mesa.");
                   qntPessoas = input.nextInt();
                   Mesa m = new Mesa(numMesa, qntPessoas);
                   GerenciaMesas.cadastrarMesa(m);
                   break;
               case 2:
                   System.out.println("Digite o número da mesa para efetuar o pedido.");
                   numMesa = input.nextInt();
                   int continuar;
                   do{
                       int codProduto;
                       int qnt;
                       System.out.println("Escolha o produto:\n"
                               + "1 - Refrigerante: R$2,00\n"
                               + "2 - Cachorro Quente: R$5,00\n"
                               + "3 - Batata Frita: R$4,00");
                       codProduto = input.nextInt();
                       System.out.println("Digite a quantidade do produto.");
                       qnt = input.nextInt();
                       GerenciaMesas.efetuarPedido(numMesa, codProduto, qnt);
                       System.out.println("Deseja fazer outro pedido?(5 = Ss/6 = Nn)");
                       continuar = input.nextInt();
                       
                   }while(continuar != 6);
                   break;
               case 3:
                   GerenciaMesas.imprimeMesas();
                   break;
               case 4: 
                       System.out.println("Digite o número da mesa que deseja finalizar a conta.");
                       numMesa = input.nextInt();
                       
                       m = GerenciaMesas.buscarMesa(numMesa);
                       System.out.println("Digite o tipo de pagamento:\n1 - Dinheiro;\n"
                               + "2 - Cheque;\n"
                               + "3 - Cartão");
                       int tipoPag = input.nextInt();
                       m.fecharConta(tipoPag);
                       System.out.println("Total da conta da mesa:\nR$:" + m.getTotalConta());
                       
                       System.out.println("Valor por pessoa:\nR$:" + m.valorContaPessoa(tipoPag));
           }
       }while(op != 5);
    }
    
    public static void menu(){
        System.out.println("====== MENU ======");
        System.out.println("Digite uma opção:\n1 - Cadastrar mesa\n"
                + "2 - Efetuar pedido\n"
                + "3 - Visualizar mesas\n"
                + "4 - Fechar conta de uma mesa\n"
                + "5 - Sair\n");
                                
    }
}
