
/**
 * Write a description of class combinations here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Ejercicio3{
    public static void combinations(String s) { 
        combinationsAux("", s); 
    }

    private static void combinationsAux(String prefix, String s){
        if (s.length() == 0){
            System.out.println(prefix);
        }else{
            combinationsAux(prefix + s.charAt(0), s.substring(1));
            combinationsAux(prefix , s.substring(1));
            
        }
    }

}
