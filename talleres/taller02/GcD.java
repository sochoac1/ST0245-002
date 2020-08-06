
/**
 * Write a description of class Taller02 here.
 * 
 * @author (Miguel Angel Zapata y Santiago Ochoa Castaño) 
 * @version (1)
 */
public class GcD
{
    public static int gcd(int p, int q){
        int residuo = p%q;
        int mcd = q;
        if(residuo == 0){
            return mcd;
        }else{
            return gcd(mcd, residuo);

        }
    } 
}
