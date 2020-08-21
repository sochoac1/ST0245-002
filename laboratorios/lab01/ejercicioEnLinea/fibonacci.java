
/**
 * Write a description of class fibonacci here.
 * 
 * @author (Miguel Angel Zapata & Santiago Ochoa Castaño) 
 * @version (1)
 */
public class fibonacci
{public int fibonacci(int n) { 
        if(n==0)return 0; 
        if(n==1)return 1; 
        return fibonacci(n-1)+fibonacci(n-2); 
    } 
}
