import java.util.*;
import javafx.util.Pair;
/**
 * Write a description of class arabol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class arbol
{
    public static TreeSet<String> valoresSinRep(String[][] m, int variable){
        TreeSet<String> respuesta = new TreeSet();
        for (int fila = 0; fila < m.length; fila++){
            respuesta.add(m[fila][variable]);
        }
        return respuesta; 
    }  

    public static int[] contarEtiquetasDeUnaMatriz(String[][] m){
        int contSi = 0;
        int contNo = 0;
        int[] etiquetas = new int[2];
        for(int i = 0; i < m.length; i++){
            if(m[i][6].equals("Si")){
                contSi++;
            }else{
                contNo++;
            }
        } 
        etiquetas[0] = contSi;
        etiquetas[1] = contNo;
        return etiquetas;
    }     
    
    public static Pair<String[][],String[][]> dividirUnaMatrizEnDosMatrices(String[][] m, int posVariable, String valor){
        int nodoVerdadIzq = 0;
        if(isNumeric(valor)){
            double val = Double.parseDouble(valor);
            for (int fila = 0; fila < m.length; fila++){
                if (Double.parseDouble(m[fila][posVariable]) >= val){ // por ejemplo, valor es 3, 10 SMLVM, Masculino
                    nodoVerdadIzq++;
                }
            }
        }else{
            for (int fila = 0; fila < m.length; fila++){
                if (m[fila][posVariable] == valor){ // por ejemplo, valor es 3, 10 SMLVM, Masculino
                    nodoVerdadIzq++;
                }
            }
        }
        int nodeFalsoDer = m.length - nodoVerdadIzq;
        String[][] nodoIzqVerdad = new String[nodoVerdadIzq][m[0].length];
        String[][] nodoDerechoFalso = new String[nodeFalsoDer][m[0].length];
        // Copiar los datos a las matrices
        int fila = 0;
        int filaN1 = 0;
        int filaN2=0;
        while(fila<m.length){
            if(!isNumeric(valor)){
                if(m[fila][posVariable]==valor){
                    nodoIzqVerdad[filaN1]=m[fila];
                    fila++;filaN1++;
                }else{
                    nodoDerechoFalso[filaN2]=m[fila];
                    fila++;filaN2++;
                }
            }else{
                if(Double.parseDouble(m[fila][posVariable]) >= Double.parseDouble(valor)){
                    nodoIzqVerdad[filaN1]=m[fila];
                    fila++;filaN1++;
                }else{
                    nodoDerechoFalso[filaN2]=m[fila];
                    fila++;filaN2++;
                }
            }
        }
        // ...
        Pair<String[][],String[][]> parejaDeMatrices = new Pair(nodoIzqVerdad,nodoDerechoFalso);
        return parejaDeMatrices;
    }

    // IG = 1 - (p0)^2 - (p1)^2. P0 = no/total P1 = si
    /*
    public static float giniNodo(String[][] m){
    float lasManzanas = 0;
    float lasUvas = 0;
    float losLimones = 0;
    for(int fila = 0; fila < m.length; fila++){
    if(m[fila][m[0].length-1].equals("Apple")){
    lasManzanas++;
    }else if(m[fila][m[0].length-1].equals("Grape")){
    lasUvas++;
    }else if(m[fila][m[0].length-1].equals("Lemon")){
    losLimones++;
    }
    }
    float proporcionApple = lasManzanas/(float)m.length;
    float proporcionUvas = lasUvas/(float)m.length;
    float proporcionLimones = losLimones/(float)m.length;
    float impureza = 1 - ((proporcionApple*proporcionApple) + (proporcionUvas*proporcionUvas) + (proporcionLimones*proporcionLimones));
    return impureza;
    }    */
    public static float giniNodo(String[][] m){
        float losQueTienenExito = 0;
        for (int fila = 0; fila < m.length; fila++){
            if (m[fila][m[0].length-1].equals("yes")){
                losQueTienenExito++;
            }
        }
        float losQueNoTienenExito = (float)m.length - losQueTienenExito;
        float proporcionDeLosQueTienenExito = losQueTienenExito/(float)m.length;
        float proporcionDeLosQueNoTieneExito = losQueNoTienenExito/(float)m.length;
        float impureza = 1 -    proporcionDeLosQueTienenExito*proporcionDeLosQueTienenExito - proporcionDeLosQueNoTieneExito*proporcionDeLosQueNoTieneExito;
        return impureza;        
    }

    public static float infoGain(String[][] nodoIzquierdo, String[][] nodoDerecho, float impurezaMatriz){
        float p = (float)nodoIzquierdo.length/((float)nodoIzquierdo.length + (float)nodoDerecho.length);
        return impurezaMatriz - p * giniNodo(nodoIzquierdo) - (1-p) * giniNodo(nodoDerecho);
    }

    public static Pair< Integer, Pair<String,Integer>> encontrarMejorPregunta(String[][] matriz){
        float best_gain = 0; 
        String best_question = "";
        float curren_uncertainty = giniNodo(matriz);
        int columna = 0; 
        for(int i = 0; i < matriz[0].length-1; i++){ 
            TreeSet<String> t = valoresSinRep(matriz, i);
            while(!t.isEmpty()){
                String pregunta = t.pollFirst();
                Pair<String[][],String[][]> pareja = dividirUnaMatrizEnDosMatrices(matriz, i, pregunta);
                if(pareja.getKey().length == 0 || pareja.getValue().length == 0){
                    continue;
                }else{
                    float gain = infoGain(pareja.getKey(), pareja.getValue(), curren_uncertainty);
                    if(gain >= best_gain){
                        best_gain = gain;
                        best_question = pregunta;
                        columna = i;
                    }
                }
            } 
        }

        Pair<String,Integer> m = new Pair(best_question, columna);
        Pair<Integer,Pair<String,Integer>> mejorPregunta = new Pair(best_gain, m);        
        return mejorPregunta;
    }  

    public static boolean isNumeric(String str)  
    {  
        try  
        {  
            double d = Double.parseDouble(str);  
        }  
        catch(NumberFormatException nfe)  
        {  
            return false;  
        }  
        return true;  
    } 
}

