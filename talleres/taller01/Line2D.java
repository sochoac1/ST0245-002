/**
 * Write a description of class Line2D here.
 * 
 * @author (Miguel Angel Zapata Jimenez y Santiago Ochoa Castaño) 
 * @version (1)
 */
public class Line2D
{
    private Puntos2D pInicial;
    private Puntos2D pFinal;
    private Puntos2D pIntermedios[];

 

 

 

    public Line2D(Puntos2D p1, Puntos2D p2){
        this.pInicial=p1;
        this.pFinal=p2;
        pIntermedios = new Puntos2D[pFinal.getX()-pInicial.getX()-1];
    }
   
    public Puntos2D[] puntosIntermedios(){
        double pendiente=(((double)pFinal.getY() - (double)pInicial.getY())/((double)pFinal.getX()-(double)pInicial.getX()));
        double x = pInicial.getX();
        double y = pInicial.getY();
        double cont = pendiente;
        for(int i=0; i < pIntermedios.length; i++){
            x+=1;
            y=y+cont;
            pIntermedios[i]=new Puntos2D((int)x,(int)y); 
             
        } 
        return pIntermedios;
    } 

    public void imprimir(){
        for(int i=0; i < pIntermedios.length; i++){
            Puntos2D p = pIntermedios[i];
            System.out.println("Punto "+ i + ": (" + p.getX() + "," + p.getY() + ") ");
        } 
    }
}
 