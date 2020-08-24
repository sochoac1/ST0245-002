
/**
 * Write a description of class Recursion2 here.
 * 
 * @author (Santiago Ochoa & Miguel Angel Zapata) 
 * @version (1)
 */

 
public class Recursion2{
    //Split53:
    public boolean split53(int[] nums) { 
        return splitAux(nums, 0, 0,0); 
    }  

    public boolean splitAux(int[] nums, int prefix, int sum1, int sum2){ 
        if(prefix==nums.length)return sum1==sum2; 
        if(nums[prefix]%5==0){ 
            return splitAux(nums, prefix+1, sum1, sum2+nums[prefix]); 
        }else if(nums[prefix]%3==0){ 
            return splitAux(nums, prefix+1, sum1+nums[prefix], sum2); 
        }else{ 
            return splitAux(nums, prefix+1, sum1, sum2+nums[prefix])|| 
            splitAux(nums, prefix+1, sum1+nums[prefix], sum2); 
        } 
    } 

    //GroupNoAdj: 
    public boolean groupNoAdj(int start, int[] nums, int target) { 
        return groupNoAdjAux(nums,0,target); 
    } 

    public boolean groupNoAdjAux(int[] nums, int prefix, int target){ 
        if(prefix>=nums.length){ 
            return target==0; 
        }else{ 
            return groupNoAdjAux(nums, prefix+2,target-nums[prefix])||groupNoAdjAux(nums,prefix+1,target); 
        } 
    } 

    //SplitArray: 
    public boolean splitArray(int[] nums) { 
        return splitAux(nums, 0, 0,0); 
    } 

    public boolean splitAux1(int[] nums, int prefix, int sum1, int sum2){ 
        if(prefix==nums.length)return sum1==sum2; 
        return splitAux1(nums, prefix+1, sum1, sum2+nums[prefix])|| 
        splitAux(nums, prefix+1, sum1+nums[prefix], sum2); 
    } 

    //SPLITODD10: 
    public boolean splitOdd10(int[] nums) { 
        return splitAux(nums, 0, 0,0); 
    } 

    public boolean splitOdd10Aux(int[] nums, int prefix, int sum1, int sum2){ 
        if(prefix==nums.length)return sum1%10==0 && sum2%2!=0; 
        return splitOdd10Aux(nums, prefix+1, sum1, sum2+nums[prefix])|| 
        splitAux(nums, prefix+1, sum1+nums[prefix], sum2); 
    } 

    //GroupSumClump: 
    public boolean groupSumClump(int start, int[] nums, int target) { 
        return groupSumClumpAux(nums,0,target); 
    } 

    public boolean groupSumClumpAux(int[] nums, int prefix, int target){ 
        if(prefix>=nums.length)return target==0; 
        if(nums[prefix]==nums[prefix+1])return groupSumClumpAux(nums, prefix+2, target-nums[prefix])||groupSumClumpAux(nums, prefix+2, target); 
        return groupSumClumpAux(nums, prefix+1, target-nums[prefix])|| 
        groupSumClumpAux(nums, prefix+1, target); 
    } 

    //GroupSum6: 
    public boolean groupSum6(int start, int[] nums, int target) { 
        return groupSum6Aux(nums, 0, target); 
    } 

    public boolean groupSum6Aux(int[] nums, int prefix, int target){ 
        if(prefix>=nums.length)return target==0; 
        if(nums[prefix]==6)return groupSum6Aux(nums, prefix+1, target-nums[prefix]); 
        return groupSum6Aux(nums, prefix+1, target-nums[prefix])||groupSum6Aux(nums,prefix+1, target); 
    } 

    //GroupSum5: 
    public boolean groupSum5(int start, int[] nums, int target) { 
        return groupSum5Aux(nums,0,target); 
    } 

    public boolean groupSum5Aux(int[] nums, int prefix, int target){ 
        if(prefix>=nums.length)return target==0; 
        if(nums[prefix]%5==0&&prefix+1<nums.length){ 
            if(nums[prefix+1]==1)return groupSum5Aux(nums, prefix+2, target-nums[prefix]); 
            return groupSum5Aux(nums, prefix+1, target-nums[prefix]); 
        } 
        return groupSum5Aux(nums, prefix+1, target-nums[prefix])||groupSum5Aux(nums, prefix+1, target); 
    } 
}
