/**
 * @author (Miguel Angel Zapata)
 * @version (1)
 */
public class Fecha {
    private final int dia;
    private final int mes;
    private final int anyo;

    public Fecha(int dia, int mes, int anyo){
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }

    public int getDia(){
        return this.dia;
    }

    public int getMes(){
        return this.mes;
    }

    public int getAnyo(){
        return this.anyo;
    }

    public int comparar(Fecha otra){
        if(this.anyo>otra.getAnyo()){
            return 1;
        }else
        if(this.anyo<otra.getAnyo()){
            return -1;
        }else
        if((this.anyo==otra.getAnyo()) && (this.mes<otra.getMes())){
            return -1;
        }else
        if((this.anyo==otra.getAnyo()) && (this.mes>otra.getMes())){
            return 1;
        }else
        if((this.anyo==otra.getAnyo()) && (this.mes==otra.getMes()) && (this.dia<otra.getDia())){
            return -1;
        }else
        if((this.anyo==otra.getAnyo()) && (this.mes==otra.getMes()) && (this.dia>otra.getDia())){
            return 1;
        }else{
            return 0;
        }
    }

    public String toString(){
        String fecha = "("+this.dia+"/"+this.mes+"/"+this.anyo+")";
        return fecha;
    }
}
