import java.util.*;
public class SolicitudNevera {
    public static void asignarSolicitud(Stack<Nevera> N, Queue<Solicitud> S){
        for(Solicitud temp: S){
            int k = temp.getCant();
            System.out.print(temp.getEmpresa() +" Pidio "+ k +" neveras: ");
            for(int i = 0; i < k; i++){
                if(!N.isEmpty()){
                    System.out.print(N.pop().toString()+ ", ");
                }else {
                    System.out.println("No quedan mas neveras");
                    break;
                }
            }
            System.out.println(" ");
        }

    }

    public static void main(String[] args){
        Stack<Nevera> N = new Stack<Nevera>();
        Queue<Solicitud> S = new LinkedList<Solicitud>();
        N.push(new Nevera("haceb", 2));
        N.push(new Nevera("lg", 3));
        N.push(new Nevera("ibm", 4));
        N.push(new Nevera("haceb", 2));
        N.push(new Nevera("lg", 3));
        N.push(new Nevera("ibm", 4));
        N.push(new Nevera("haceb", 5));
        N.push(new Nevera("lg", 6));
        N.push(new Nevera("ibm", 7));
        N.push(new Nevera("lg", 8));
        N.push(new Nevera("ibm", 9));

        S.offer(new Solicitud("Exito",1));
        S.offer(new Solicitud("Olimpica",4));
        S.offer(new Solicitud("la14",4));
        S.offer(new Solicitud("Eafit",4));

        asignarSolicitud(N, S);              
    }
}
