import java.util.ArrayList;
public class Point2
{

    public Node root;
    public void buildingTree (int [] preOrder) {        
        for(int i = 0; i < preOrder.length; i++){
            insertar(preOrder[i]);
        }
    }

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
        if (n > node.data) {
            if (node.right == null) {
                node.right = new Node(n);
            }else{
                insertarAux(node.right, n);
            }
        }
        if (n < node.data) {
            if (node.left == null) {
                node.left = new Node(n);
            }else{
                insertarAux(node.left, n);
            }
        }
    }

    public void preOrder(Node node) {
        if(node == null){
            return;
        }else{            
            System.out.println(node.data);     
            posOrder(node.left);
            posOrder(node.right);
        }  
    }

    public void posOrder(Node node) {
        if(node == null){
            return;
        }else{
            posOrder(node.left);
            posOrder(node.right);
            System.out.println(node.data);       
        }      
    }

    public void exercise21 (int [] input) {
        buildingTree(input);
        System.out.println("PosOrder");
        posOrder(root);
        System.out.println();
    }

    public static void main (String [] args) {
        int [] test = {50,30,24,5,28,45,98,52,60};
        Point2 testing = new Point2();
        testing.exercise21(test);
    }
}
