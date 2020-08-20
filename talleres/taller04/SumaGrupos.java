
/**
 * Write a description of class SumaGrupos here.
 * 
 * @author (Miguel Angel Zapata & Santiago Ochoa Castaño) 
 * @version (a version number or a date)
 */
public class SumaGrupos
{
    public static boolean sumarGrupos(int indice, int[] nums, int target){
        if(indice==nums.length)return target==0;
        return sumarGrupos(indice+1, nums, target-nums[indice])|| sumarGrupos(indice+1, nums,target);
    }

    public static void main(String args[]){
        for(int n = 20; n<=40; n++){
            long ti = System.currentTimeMillis();
            sumarGrupos(0, new int[n], 10);
            long tf = System.currentTimeMillis();
            System.out.println(tf-ti);
        }
    } 
}

