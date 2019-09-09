
public class Mesa {

    private int numeroMesa;
    private int quantPessoas;
    private double valorConta;

    public Mesa(int numero, int quantPessoas) {
        this.numeroMesa = numero;
        this.quantPessoas = quantPessoas;
        this.valorConta = 0;
    }

    public void efetuaPedido(int cod, int quant) {
        double valorProduto = 0;
        switch (cod) {
            case 1:
                valorProduto = 2;
                break;
            case 2:
                valorProduto = 5;
                break;
            case 3:
                valorProduto = 4;
                break;
        }
        valorConta = valorConta + quant * valorProduto;
    }

    public void fecharConta(int tipoPagamento) {
        int porcentagem = 0;
        if (tipoPagamento == 1) {
            porcentagem = 10;
        } else if (tipoPagamento == 3) {
            porcentagem = 5;
        }
        valorConta = valorConta - (valorConta * porcentagem / 100);
    }

    public double valorPorPessoa() {
        return valorConta / quantPessoas;
    }

    public String imprime() {
        return "Número da mesa: " + numeroMesa
                + "\nQuantidade de pessoas: " + quantPessoas
                + "\nTotal da conta: R$" + valorConta;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public int getQuantPessoas() {
        return quantPessoas;
    }

    public void setQuantPessoas(int quantPessoas) {
        this.quantPessoas = quantPessoas;
    }

    public double getValorConta() {
        return valorConta;
    }

    public void setValorConta(double valorConta) {
        this.valorConta = valorConta;
    }
}
