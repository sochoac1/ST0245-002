
/**
 * Write a description of class Punto here.
 * 
 * @author (Miguel Angel Zapata Jimenez y Santiago Ochoa Castaño) 
 * @version (1)
 */
public class Punto
{
    private double x,y;

    public Punto(double x, double y){
        this.x=x;
        this.y=y;
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public double radioPolar(){
        double radioPolar = Math.sqrt(Math.pow(this.x,2) + Math.pow(this.y,2));
        return radioPolar;
    }

    public double anguloPolar(){
        double anguloPolar = Math.atan(this.y/this.x);
        return anguloPolar;
    }
    
    public double distanciaEuclidiana(Punto otro){
        double distanciaEuclidana= Math.sqrt(Math.pow(this.x-otro.getX(),2)+Math.pow(this.y-otro.getY(),2));
        return distanciaEuclidana;
    }
}
