import java.util.*;
public class SolicitudNevera {
    public static void asignarSolicitud(Stack<Nevera> N, Queue<Solicitud> S){
        for(Solicitud temp: S){
            int k = temp.getCant();
            System.out.print(temp.getEmpresa() +": ");
            for(int i = 0; i < k; i++){
                if(!N.isEmpty()){
                    System.out.print(N.pop().toString()+ ", ");
                }else {
                    System.out.println("No quedan mas neveras");
                }
            }
            System.out.println(" ");
        }

    }

    public static void main(String[] args){
        Stack<Nevera> almacen = new Stack<Nevera>();
        Queue<Solicitud> solicitudes = new LinkedList<Solicitud>();
        Nevera N1 = new Nevera("haceb", 1);
        almacen.push(N1);
        Nevera N2 = new Nevera("lg", 2);
        almacen.push(N2);
        Nevera N3 = new Nevera("lg", 3);
        almacen.push(N3);

        Solicitud S1 = new Solicitud("eafit", 2);
        solicitudes.add(S1);
        Solicitud S2 = new Solicitud("casa", 2);
        solicitudes.add(S2);

        asignarSolicitud(almacen, solicitudes);              
    }
}
