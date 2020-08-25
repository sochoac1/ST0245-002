
/**
 * Write a description of class fibonacci here.
 * 
 * @author (your name) 
 * @version (a version numbe+r or a date)
 */
public class rectangles2xn
{
    public static int ways(int n){
        if(n<=2)return n;
        return ways(n-1)+ways(n-2);
    }
}
