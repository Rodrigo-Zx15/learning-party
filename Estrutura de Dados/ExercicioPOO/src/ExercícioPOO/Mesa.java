package ExercícioPOO;
public class Mesa {
    private int numero;
    private int quantPessoas;
    private double totalConta;

    public Mesa(int numMesa, int quantPessoas) {
        totalConta = 0;
        numero = numMesa;
        this.quantPessoas = quantPessoas;
    }
    
    public void efetuarPedido(int codProduto, int quant) {
        switch (codProduto) {
            case 1:
                totalConta = totalConta + quant * 2;
                break;
            case 2:
                totalConta = totalConta + quant * 5;
                break;
            case 3:
                totalConta = totalConta + quant * 4;
                break;
            default:
                break;
        }
    }
    
    public double fecharConta(int tipoPagamento) {
        double valorFinal = totalConta;
        if (tipoPagamento == 1) {
            valorFinal = valorFinal * 0.9;
        } else if (tipoPagamento == 3) {
            valorFinal = valorFinal * 0.95;
        }
        return valorFinal;
    }
    
    public double valorContaPessoa(int tipoPagamento) {
        double valor = fecharConta(tipoPagamento);
        return valor / quantPessoas;
    }
    
    public String imprime() {
        return "Mesa: " + numero + " - Pessoas: " + quantPessoas
                + " Total: " + totalConta +"\n";
    }

    public int getNumero() {
        return numero;
    }

    public int getQuantPessoas() {
        return quantPessoas;
    }

    public double getTotalConta() {
        return totalConta;
    }

    public void setQuantPessoas(int quantPessoas) {
        this.quantPessoas = quantPessoas;
    }
}
