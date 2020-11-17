import java.util.*;
import javafx.util.Pair;
public class Node {
    //Atributos:
    public String[][] matriz;
    public Pair< Float, Pair<String,Integer>>  mejorPregunta;
    public int mejorCol;
    public String mejorVal;
    public boolean exito; 
    public Node trueBranch;
    public Node falseBranch;
    public String[][] trueMatrix;
    public String[][] falseMatrix;

    public Node(String[][] M){
        matriz = M;
        mejorPregunta = Arbol.encontrarMejorPregunta(matriz); 
        mejorVal = mejorPregunta.getValue().getKey();
        mejorCol = mejorPregunta.getValue().getValue();
        Pair<String[][],String[][]> parejaDeMatrices = Arbol.dividirUnaMatrizEnDosMatrices(M, mejorCol, mejorVal);
        trueMatrix = parejaDeMatrices.getKey();
        falseMatrix = parejaDeMatrices.getValue();
        exito = Arbol.contarEtiquetasDeUnaMatriz(matriz);
    }       
}



    /*
    public Node(String[][] M){
    matriz = M;
    mejorPregunta = Arbol.encontrarMejorPregunta(matriz);
    float gain = mejorPregunta.getKey();
    if(gain == 0){
    exito = Arbol.contarEtiquetasDeUnaMatriz(M);
    }else{
    mejorVal = mejorPregunta.getValue().getKey();
    mejorCol = mejorPregunta.getValue().getValue();
    Pair<String[][],String[][]> parejaDeMatrices = Arbol.dividirUnaMatrizEnDosMatrices(M, mejorCol, mejorVal);
    trueBranch = new Node(parejaDeMatrices.getKey());
    falseBranch = new Node(parejaDeMatrices.getValue());
    }
    }
     */
/*
Notas:
La altura del arbol esta dada por el numero de columnas que hay presente en los dato
Complejidad en memoria = O(N*M*2^M)
Complejidad en tiempo = O(I*N*2^M) 
f(N,M) lo que se demora creando un nodo: encontrar mejor variable y mejor valor, y la divison del nodo y sumarlo.
 */