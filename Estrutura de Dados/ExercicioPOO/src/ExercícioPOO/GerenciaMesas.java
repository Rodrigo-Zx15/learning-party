package ExercícioPOO;
import java.util.ArrayList;

public class GerenciaMesas {
    static ArrayList<Mesa> listaMesas = new ArrayList<Mesa>();
    //professor cuck tnc
    public static void cadastrarMesa(Mesa newmesa) {
        //Mesa m = new Mesa(numMesa, quantPessoas);
        listaMesas.add(newmesa);
    }
    
    public static Mesa buscarMesa(int num) {
        //for (int i = 0; i < listaMesas.size(); i++) {
        for (Mesa m : listaMesas) {    
            if (m.getNumero() == num) {
                return m;
            }
        }
        return null;
    }
    
    public static void efetuarPedido(int num, int codProduto, int quant) {
        Mesa m = buscarMesa(num);
        if (m != null) {
            m.efetuarPedido(codProduto, quant);
        } else {
            System.out.println("Mesa não encontrada!");
        }
    }
    
    public static void imprimeMesas() {
        for (int i = 0; i < listaMesas.size(); i++) {
            Mesa m = listaMesas.get(i);
            System.out.println(m.imprime());
        }
    }
    
}
