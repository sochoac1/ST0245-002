public class Solicitud {
    private int cant;
    private String empresa;

    public Solicitud(String empresa, int cant){
        this.cant = cant;
        this.empresa = empresa;
    }

    public int getCant(){
        return this.cant;
    }

    public String getEmpresa(){
        return this.empresa;
    }
}
