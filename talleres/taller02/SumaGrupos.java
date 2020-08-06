
/**
 * Write a description of class SumaGrupos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SumaGrupos
{  
    public static boolean SumaGrupo(int[] nums, int target) {
        return SumaGrupo(0, nums, target);
    }  

    private static boolean SumaGrupo(int start, int[] nums, int target) {
        if (start>=nums.length){
            return target==0;
        }else{
            return SumaGrupo(start+1, nums, target - nums[start])||SumaGrupo(start+1, nums, target);
        }
    }
    
    public static void main(String args[]){
        int nums[] ={2,4,8};
        System.out.print((SumaGrupo(nums,99))+"\n");
    }
}

