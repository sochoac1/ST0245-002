public class Ejercicio2
{
   /**
    * @author (Miguel Angel Zapata Jimenez & Santiago Ochoa Castaño)
    * @version (1)
    */
   
   public static void permutacion ( String str ) {  
        permutationAux ("",str);
    }

   private static void  permutationAux (String pref ,String  str ) {
        if(str.length() == 0){
            System.out.println(pref);
        }else{
           for(int i = 0; i < str.length(); i++){
               permutationAux(pref + str.charAt(i), str.substring(0,i) + str.substring(i+1, str.length()));
            }
        }
    }
}
