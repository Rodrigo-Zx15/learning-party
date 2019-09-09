
package ponto;


public interface TADPlano {
    public double getX();
    public double getY();
    public void changeX(double novoX);
    public void changeY(double novoY);
    public void changeBoth(int newX, int newY);
    public double distancia(Ponto p);
    public boolean alinhamento(Ponto p1, Ponto p2);
}
