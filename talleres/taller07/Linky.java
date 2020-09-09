
/**
 * Write a description of class linky here.
 * 
 * @author (Miguel Angel Zapata Jimenez & Santiago Ochoa Castaño) 
 * @version (a version number or a date)
 */
import java.lang.IndexOutOfBoundsException; // Usar esto cuando se salga el índice
// Una lista simplemente enlazada
public class Linky{
    private Node first; 
    private int size;
    public Linky()
    {
        size = 0;
        first = null;   
    }

    /**
     * Returns the node at the specified position in this list.
     * @param index - index of the node to return
     * @return the node at the specified position in this list
     * @throws IndexOutOfBoundsException
     */
    private Node getNode(int index) throws IndexOutOfBoundsException {
        if (index >= 0 && index < size) {
            Node temp = first;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    /**
     * Returns the element at the specified position in this list.
     * @param index - index of the element to return
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException
     */
    public Bees get(int index) throws IndexOutOfBoundsException {
        Node temp = getNode(index);
        return temp.data;
    }

    // Retorna el tamaño actual de la lista
    public int size()
    {
        return this.size;
    }

    // Inserta un dato en la posición index
    public void insert(Bees data, int index) throws Exception

    { // Y si la lista está vacía? Y si voy a insertar en la posición 0?
        Node nuevoNodo = new Node(data);
        Node temp = first;
        if(temp == null){
            first = nuevoNodo;
            size++;
        }else
        if(index > size||index<0){
            throw new IndexOutOfBoundsException("Index : " + index);
        }else
        if(index == 0){
            nuevoNodo.next = temp;
            first = nuevoNodo;
            size++;
        }else{
            for(int i = 1; i <= index - 1; i++){
                temp = temp.next;
            }
            nuevoNodo.next = temp.next;
            temp.next = nuevoNodo;
            size++;
        }

    }

    //Inserta un dato en la ultma posición
    public void insert(Bees data){
        if(first==null){
            first = new Node(data);
            size++;
            return;
        }
        Node newNode = new Node(data);
        Node temp = first;
        for(int i = 1; i < size;i++){
            temp = temp.next;
        }
        temp.next= newNode;
        size++;
    }
    
    // Borra el dato en la posición index
    public void remove(int index)
    { 
        Node temp = first;
        if(index > size||index<0){
            throw new IndexOutOfBoundsException("Index : " + index);
        }else
        if(index == 0){
            first = first.next;
            size--;
        }else{
            for(int i = 1; i <= index - 1; i++){
                temp = temp.next;
            }            
            temp.next = temp.next.next;
            size--;
        }
    }

    // Verifica si está un dato en la lista
    public boolean contains(Bees data)
    {        //Iterando hasta que lo encontremos
        Node unNodo = first;
        int cont = 0;
        while (unNodo != null){ //OJO con Null pointer exception           
            if (unNodo.data == data){
                System.out.print("Bee is in " + cont + " position");
                return true;
            }
            unNodo = unNodo.next;
            cont++;
        }
        System.out.print("Your bee is not available");
        return false;
        // OJO con Missing return statement
    }
}