
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao, numeroMesa, quantidadePessoas, codigo, quantidadeItens;
        do {
            System.out.println("Escolha uma das opções:");
            System.out.println("1. Cadastrar mesas;");
            System.out.println("2. Imprimir todas as mesas;");
            System.out.println("3. Efetuar Pedidos.");
            System.out.println("4. Calcular e imprimir o valor final da conta e por pessoa;");
            System.out.println("5. Sair.");
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Qual o número da mesa?");
                    numeroMesa = teclado.nextInt();
                    System.out.println("Qual a quantidade de pessoas?");
                    quantidadePessoas = teclado.nextInt();
                    Mesa m = new Mesa(numeroMesa, quantidadePessoas);
                    GerenciaMesas.cadastrarMesa(m);
                    break;
                case 2:
                    GerenciaMesas.exibirMesas();
                    break;
                case 3:
                    char opcao2;
                    do {
                        System.out.println("Qual o número da mesa?");
                        numeroMesa = teclado.nextInt();
                        System.out.println("Qual o código do produto?");
                        codigo = teclado.nextInt();
                        System.out.println("Qual a quantidade de itens?");
                        quantidadeItens = teclado.nextInt();
                        GerenciaMesas.efetuarPedido(numeroMesa, codigo, quantidadeItens);
                        
                        System.out.println("Deseja realizar mais algum pedido? s / n");
                        opcao2 = teclado.next().charAt(0);
                    } while (opcao2 == 's' || opcao2 == 'S');
                    break;
                case 4:
                    System.out.println("Qual o número da mesa?");
                    numeroMesa = teclado.nextInt();
                    Mesa mesa = GerenciaMesas.buscaMesa(numeroMesa);
                    System.out.println("Qual a forma de pagamento?");
                    int formaPagamento = teclado.nextInt();
                    mesa.fecharConta(formaPagamento);
                    System.out.println("O valor final da conta é R$" + mesa.getValorConta());
                    System.out.println("Por pessoa, a conta será R$" + mesa.valorPorPessoa());
                    break;
                case 5:
                    System.out.println("Finalizando o programa");
                    break;
                default:
                    System.out.println("Código inválido.");
            }
        } while (opcao != 5);
    }

}
