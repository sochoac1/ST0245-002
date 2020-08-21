
/**
 * Write a description of class once here.
 * 
 * @author (Miguel Angel Zapata & Santiago Ochoa Castaño) 
 * @version (1)
 */
public class array11
{
    public int array11(int[] nums, int index) {
        int cont=0;
        if(index==nums.length) return 0;
        if(nums[index]==11){
            cont=1;
        }
        return array11(nums,index+1)+cont;
    }
}
