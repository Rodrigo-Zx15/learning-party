
import java.util.ArrayList;

public class GerenciaMesas {
    private static ArrayList<Mesa> listaMesas = new ArrayList<>();
    
    public static void cadastrarMesa(Mesa novaMesa) {
        listaMesas.add(novaMesa);
    }
    
    public static Mesa buscaMesa(int numeroMesa) {
        Mesa retorno = null;
        for (Mesa mesa : listaMesas) {
            if (mesa.getNumeroMesa() == numeroMesa) {
                retorno = mesa;
                break;
            }
        }
        return retorno;
    }
    
    public static void efetuarPedido(int numero, int cod, int quant) {
        Mesa mesa = buscaMesa(numero);
        if (mesa != null) {
            mesa.efetuaPedido(cod, quant);
        }
    }
    
    public static void exibirMesas() {
        for (Mesa mesa : listaMesas) {
            System.out.println(mesa.imprime());
            System.out.println();
        }
    }
}
