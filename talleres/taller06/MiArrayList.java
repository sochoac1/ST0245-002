
/**
 * Write a description of class MiArrayList here.
 * 
 * @author (Miguel Angel Zapata Jimenez & Santiago Ochoa Castaño) 
 * @version (1)
 */
public class MiArrayList {
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private Bees elements[]; 

    /**
     * El metodo constructor se utiliza para incializar
     * variables a valores neutros como 0 o null.
     * El contructor no lleva parámetros en este caso.
     */
    public MiArrayList() {
        //...
        size= 0;
        elements = new Bees[DEFAULT_CAPACITY];
    }     

    /**
     * Tiene la intención de retornar la longitud del objeto
     * @return longitud del objeto
     *
     * El size esta influenciado por las funciones add y del
     */
    public int size() {
        //...
        return this.size; //O(1)
    }   

    private void algoritmoDanielArango(){
        Bees[] array = new Bees[elements.length * 2]; //1 -> O(1)
        for (int i = 0; i < elements.length; i++)   // 2 -> O(n)
            array[i] = elements[i];                 // -> O(n)
        elements = array; // 3                      // ->  O(1)
    }                                           // T(n) es O(n)

    /**  
     * @param e el elemento a guardar
     * Agrega un elemento e a la última posición de la lista
     *
     */
    public void add(Bees e) throws Exception{
        add(size,e);     
    }    

    /** 
     * @param i es un íncide donde se encuentra el elemento posicionado
     * Retorna el elemento que se encuentra en la posición i de la lista.
     *
     */
    public Bees get(int i) throws Exception{
        if (i < elements.length && i >= 0) {
            return elements[i];
        }else {
            throw new IndexOutOfBoundsException("Index : " + i);
        }
    }

    /**
     * @param index es la posicion en la cual se va agregar el elemento
     * @param e el elemento a guardar
     * Agrega un elemento e en la posición index de la lista
     *
     */
    public void add(int index, Bees e) throws Exception {
        //...
        if(index <= elements.length-1 && index >= 0){ //C_1
            if(index==size){  //C_2  
                elements[index] = e;    
                size++; //C_3
            }else if(index < size){ //C_4
                for(int i = size-1; i >= index; i--){ //C_5 + C_6*n
                    elements[i+1] = elements[i]; //C_7*n
                }
                elements[index] = e;
                size++;//C_8
            }
        }else if(index >= elements.length){//C_9
            algoritmoDanielArango();
            add(e);//C_10
        }else{//C_11
            throw new IndexOutOfBoundsException("Index : " + index);//C_12
        }
    } 

    /**
     * @param index es la posicion en la cual se va eliminar el elemento
     *
     * ELimina el elemento  en la posición index de la lista
     *
     */
    public void del(int index){
        if(index <= elements.length-1 && index >= 0){
            if(index==size-1 && size!=0){
                elements[index]=null;
                size--;
            }else{
                elements[index] = null;
                for(int i = index; i < size; i++){
                    elements[i] = elements[i+1];
                }
                size--;
            }
        }else{
            throw new IndexOutOfBoundsException("Index : " + index);
        }
    }
}
