
package ponto;


public class App {

    
    public static void main(String[] args) {
        Ponto p1 = new Ponto(1,2);
        Ponto p2 = new Ponto(3,0);
        double dist = p1.distancia(p2);
        System.out.println("Distância entre p1 e p2: " + dist);
        Ponto p3 = new Ponto(4,-1);
        boolean alin = p3.alinhamento(p1, p2);
        System.out.println("Alinhamento entre p1,p2,p3: " + alin);
    }
    
}
