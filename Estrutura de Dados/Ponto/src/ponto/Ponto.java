package ponto;


public class Ponto implements TADPlano {
    private double x;
    private double y;
    
    public Ponto(double x, double y){
        this.x = x;
        this.y = y;
    
    }

    
    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
         return y;
    }

    @Override
    public void changeX(double novoX) {
         x = novoX;
    }

    @Override
    public void changeY(double novoY) {
         y = novoY;
    }

    @Override
    public void changeBoth(int newX, int newY) {
         x = newX;
         y = newY;
    }

    @Override
    public double distancia(Ponto p) {
        double deltaX, deltaY;
        deltaX = p.getX() - this.x;
        deltaX = deltaX * deltaX;
        deltaY = p.getY() - this.y;
        deltaY = deltaY * deltaY;
        
        double distancia = Math.sqrt(deltaX + deltaY);
        return distancia;
         
    }

    @Override
    public boolean alinhamento(Ponto p1, Ponto p2) {
        double mAB;
        double mBC;
        mAB = (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
        mBC = (this.y - p2.getY()) / (this.x - p2.getX());
        if(mAB == mBC){
            return true;
        }else{
            return false;
        } 
    }

    
}
