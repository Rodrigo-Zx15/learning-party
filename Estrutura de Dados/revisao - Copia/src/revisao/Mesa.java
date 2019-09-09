package revisao;



public class Mesa {
    int num;
    int qntP;
    double totalConta = 0;
    
    

    public Mesa(int num, int qntP) {
        this.num = num;
        this.qntP = qntP;
        
    }

    public double compra(int prod, int qntProd){
        double resultado = 0;
            
            
            
            switch(prod){
                case 1:
                    resultado = resultado + 2.0 * qntProd;
                    break;        
                case 2:
                    resultado = resultado + 5.0 * qntProd;
                    break;
                case 3:
                    System.out.println("Digite");
                    resultado = resultado + 4.0 * qntProd;
                
            }    
            return resultado;
        
        }
        public double conta(int tipoPag){
            double valor = totalConta;
            if(tipoPag == 1){
                valor = valor * 1.10;
            }
            else if(tipoPag == 3){
                valor = valor * 1.05;
            }
            return valor;
        }
        
        

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public int getQntP() {
            return qntP;
        }

        public void setQntP(int qntP) {
            this.qntP = qntP;
        }

        public double getTotalConta() {
            return totalConta;
        }

        public void setTotalConta(double totalConta) {
            this.totalConta = totalConta;
        }

        
        void imprimirDados(){
            System.out.println("Nº: " + getNum());
            System.out.println("Pessoas na mesa: " + getQntP());
            System.out.println("Total bruto: " + getTotalConta());
            System.out.println("Total bruto/pessoa: " + totalConta/qntP);
        }
    
}
