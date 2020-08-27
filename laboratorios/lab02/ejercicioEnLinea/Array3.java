/**
 * Write a description of class Array3 here.
 * 
 * @author (Miguel Angel Zapata Jimenez & Santiago Ochoa Castaño) 
 * @version (1)
 */
public class Array3
{
    //fix34
    public int[] fix34(int[] nums) {  
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 3){
                for(int j = 0; j < nums.length; j++){
                    if(nums[j] == 4&&nums[j-1]!=3){
                        nums[j] = nums[i+1];
                        nums[i+1] = 4;
                    }
                }
            }
        }
        return nums;
    }

    //LinearIn
    public boolean linearIn(int[] outer, int[] inner) {
        int cont = 0;
        boolean res = false;
        if(inner.length == 0) return true;
        for(int i = 0; i < inner.length; i++){
            for(int j = 0; j < outer.length; j++){
                if(inner[i] == outer[j]){
                    cont++;
                    break;
                }
            }
            if(cont == inner.length){
                res = true;
            }
        }
        return res;
    }

    //countClumps
    public int countClumps(int[] nums) {
        int cont = 0;
        boolean res = true;
        for (int i = 0; i < nums.length-1; i++ ) {
            if(nums[i] == nums[i+1] && res) {
                cont++;
                res = false;
            } else if(nums[i] != nums[i+1]) {
                res = true;
            }
        }
        return cont;
    }

    //canBalance
    public boolean canBalance(int[] nums) {
        int sumLeft=0;
        int sumRigth=0;
        for(int i=0; i < nums.length; i++){
            sumLeft=sumLeft+nums[i];
            for(int j=nums.length-1; j > i; j--){
                sumRigth=sumRigth+nums[j];
            }
            if(sumLeft==sumRigth){
                return true;
            }
            sumRigth=0;
        }
        return false;
    }
    
    //fix45
    public int[] fix45(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 4&&nums[i+1]!=5){
                if(nums[0]==5){
                    nums[0] = nums[i+1];
                    nums[i+1] = 5;
                }
                for(int j = 0; j < nums.length; j++){
                    if(nums[j] == 5&&nums[j-1]!=4){
                        nums[j] = nums[i+1];
                        nums[i+1] = 5;
                   }
                }
           }
        }
        return nums;
    }
}
