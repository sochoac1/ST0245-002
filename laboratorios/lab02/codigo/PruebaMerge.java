
/**
 * Write a description of class Prueba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PruebaMerge
{
    public static void main(String[] args) {

        long ti=0;
        long tf=0;
        for(int n = 10000000; n <= 200000000; n = n +10000000){
            int[] arreglo = new int [n];
            for(int i = 0; i < n; i++){
                arreglo[i] = n-i;
            }
            ti = System.currentTimeMillis();
            MergeSORT.sort(arreglo,0,n-1);
            tf = System.currentTimeMillis();
            System.out.println(tf-ti);
        }
    }
}
