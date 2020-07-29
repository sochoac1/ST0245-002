
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
        pIntermedios = new Puntos2D[pFinal.getX()];
    }

    public Puntos2D[] puntosIntermedios(){
        int pendiente=((pFinal.getY() - pInicial.getY())/(pFinal.getX()-pInicial.getX()));
        int cont=1;
        int x = pInicial.getX();
        int y = pInicial.getY();
        for(int i=0; i < pIntermedios.length-1; i++){
            x+=1;
            y+=pendiente;
            pIntermedios[i]=new Puntos2D(x,y);
        } 
        return pIntermedios;
    }

    public void imprimir(){
        for(int i=0; i < pIntermedios.length-1; i++){
            Puntos2D p = pIntermedios[i];
            System.out.print("Punto "+ i + ": (" + p.getX() + "," + p.getY() + ") ");
        } 
    }
}
