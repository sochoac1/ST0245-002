
/**
 * Write a description of class ds here.
 * 
 * @author (Miguel Angel Zapata & Santiago Ochoa Castaño) 
 * @version (1)
 */
public class CountHiBat
{
    public int countHi(String str) { 
        int cont=0; 
        if(str.length()<=2) 
            if(str.substring(0,str.length()).equals("hi")){ 
                return cont=1; 
            }else{ 
                return 0; 
            }else{ 
            if(str.substring(0,2).equals("hi")){ 
                cont=1; 
            } 
        } 
        return cont+countHi(str.substring(1,str.length())); 
    } 
}
