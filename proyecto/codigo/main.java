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
        String fruta[][] = { { "Green", "3", "Apple"},
                {"Yellow", "3", "Apple"},
                {"Red",    "1", "Grape"},
                {"Red",    "1", "Grape"},
                {"Yellow", "3", "Lemon"}};
                
        BufferedReaderClass m = new BufferedReaderClass();
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
