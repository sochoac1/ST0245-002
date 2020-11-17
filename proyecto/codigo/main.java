import java.io.*;
import java.util.*;
import javafx.util.Pair;
/**
 * Write a description of class main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class main
{
    public static void main(String[] args) throws Exception{
        BufferedReaderClass br = new BufferedReaderClass("prueba135000.csv");
        BuildTree t = new BuildTree();
        long start = System.currentTimeMillis();
        Node y = t.decisionTree(br.matriz);
        long finalT = System.currentTimeMillis();
        System.out.println("It's takes " + (finalT -start));
        
        BufferedReaderClass br2 = new BufferedReaderClass("test135000.csv");
        double[] in = Test.information(br2.matriz, y);
        System.out.println("Precision: " + in[0]);
        System.out.println("Sensibilidad: " + in[1]);
        System.out.println("Exactitud: " + in[2]);
        //Node root = new Node(l1.Matriz);
        /*        
        //BufferedReaderClass m = new BufferedReaderClass();
        m.readData();
        TreeSet<String> peye = arbol.valoresSinRep(m.matriz, 0);
        int[] pruebaEtiquetas = arbol.contarEtiquetasDeUnaMatriz(m.matriz);
        Pair<String[][],String[][]> parejaDeMatrices = arbol.dividirUnaMatrizEnDosMatrices(m.matriz, 0, "6.98");
        float impuredadAsnjdssakd = arbol.giniNodo(m.matriz);
        Pair<Integer,Pair<String, Integer>> pejlo = arbol.encontrarMejorPregunta(m.matriz);
        /*
        Pair<String[][],String[][]> parejaDeMatrices = arbol.dividirUnaMatrizEnDosMatrices(fruta, 0, "Green");
        float ge = arbol.giniNodo(fruta);
        float in = arbol.infoGain(parejaDeMatrices.getKey(), parejaDeMatrices.getValue(), ge); 
        Pair<Integer,String> taclot = arbol.encontrarMejorPregunta(fruta);
        */
    }
}