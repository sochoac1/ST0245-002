
/**
 * Write a description of class gfsdgsd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
/**
 * La clase BinaryTree intenta dar un conocimiento a los
 * estudiantes acerca del manejo de un arbol binario de enteros.  
 * Aquí se espera crear una estrcutura concreta del árbol binario,
 * cabe aclarar que esta estrucutra ya esta implementada.
 * @see <a href="https://docs.oracle.com/javase/9/docs/api/jdk/nashorn/api/tree/BinaryTree.html"> Árbol Binario</a>
 * @author Mauricio Toro, Andres Paez
 *
 */

public class BinaryTree {

    // Sirve como raíz del árbol
    public Node root;
    public BinaryTree(){
        root = null;
    }

    /**
     * @param n el dato del nodo que se busca buscar
     * Metodo auxiliar de insetarAux.
     *
     */
    public void insertar(int n) {
        if (root == null) {
            root = new Node(n);
        } else {
            insertarAux(root, n);
        }
    }

    //Meodo auxiliar para eliminar un elemento
     private void insertarAux(Node node, int n) {
        if (node == null) {
            node = new Node(n);
        }
        if (n > node.dato) {
            if (node.right == null) {
                node.right = new Node(n);
            }
            insertarAux(node.right, n);
        }
        if (n < node.dato){
            if (node.left == null) {
                node.left = new Node(n);
            }
            insertarAux(node.left, n);
        }
    }

    /**
     * @param n el dato del nodo que se busca.
     * Metodo auxiliar de buscarAux.
     * @return true si el metodo buscarAux es true
     */
    public boolean buscar(int n) {
        return buscarAux(root, n);
    }

    /**
     * @param node es la raíz del arbol
     * @param n el dato del nodo que se busca
     * nota: metodo recursivo.
     * Inserta un dato respetando claro las desigualdades en el árbol
     * @return true si se encuentra el elemento en el árbol, false de lo contrario
     */ 

    private boolean buscarAux(Node node, int n) {
        if(node == null){
            return false;
        }
        if(node.dato == n){
            return true;
        }
        if(n < node.dato){
            return buscarAux(node.left, n);
        }
        if( n > node.dato){
            return buscarAux(node.right, n);
        }
        return false;
    }

    /**
     * @param n el dato del nodo que se busca borrar.
     * Metodo auxiliar de buscarAux.
     * 
     */
    public void borrar(int n) {
        borrarAux(root, n);
    }

    //Metodo auxiliar para eliminar un elemento
    private Node borrarAux(Node node, int n) {
        if(node == null){
            return node;
        }
        if(node.dato == n){
            node.dato = elMayorDeLosMenores(node);
            n = node.dato;
            eliminarMayorDeLosMenores(node.left, n);
        }else if(node.dato < n){
            return borrarAux(node.left, n);
        }
        return borrarAux(node.right, n);
    }

    private int elMayorDeLosMenores(Node node){
        return elMayorYElNodoNoEsNull(node.left);
    }

    private int elMayorYElNodoNoEsNull(Node node) {
        if (node.left == null && node.right == null){
            return node.dato;
        }else{ 
            return elMayorYElNodoNoEsNull(node.right);
        }

    }

    private void eliminarMayorDeLosMenores(Node s, int n){
        if(s.dato == n){
            s = null;
        }else if(s.dato < n){
            eliminarMayorDeLosMenores(s.left, n);
        }else if(s.dato >= n){
            eliminarMayorDeLosMenores(s.right, n);
        }
    }
    /*

    Los metodos posteriores son para imprimir el arbol de manera
    que sirven para debuggeo
     */
    /**
     * @param node el nodo desde el cual se imprimirá
     * imprime el arbol desde el nodo node
     */
    private void recursivePrintAUX(Node node)
    {
        if (node != null)
        {
            recursivePrintAUX(node.left);
            recursivePrintAUX(node.right);
            System.out.println(node.dato);
        }

    }

    /**
     * Metodo auxiliar de recursivePrintAUX
     *
     */
    public void recursivePrint()
    {
        recursivePrintAUX(root);
    }   
}
