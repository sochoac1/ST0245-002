
/**
 * Write a description of class maximo here.
 * 
 * @author (Miguel Angel Zapata Jimenez & Santiago Ochoa Castaño) 
 * @version (1)
 */
public class maximun
{
    public static int maxF(int index, int[] nums){
        if(nums.length==0){
            return Integer.MIN_VALUE;
        }else if(index==nums.length){
            return nums[index-1];
        }else{
            return Math.max(nums[index], maxF(index+1,nums));
        }
    }

    public static void main(String args[]){
        for(int n = 20; n<=40; n++){
            long ti = System.currentTimeMillis();
            maxF(0, new int[n]);
            long tf = System.currentTimeMillis();
            System.out.println(tf-ti);
        }
    }
}

