
/**
 * Write a description of class jj here.
 * 
 * @author (Miguel Angel Zapata & Santiago Ochoa Castaño) 
 * @version (1)
 */
public class triangle
{
    public int triangle(int rows) { 
        if(rows==0)return 0; 
        return rows+triangle(rows-1); 
    } 
}
