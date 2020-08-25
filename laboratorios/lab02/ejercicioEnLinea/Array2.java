/**
 * Write a description of class CodingBat here.
 * 
 * @author (Miguel Angel Zapata & Santiago Ochoa Castaño) 
 * @version (1)
 */
public class Array2 {
    //fizzArray3
    public static int [] fizzArray3(int start, int end){
        int tamaño = end - start;
        int[] nums = new int[tamaño];
        for(int i = 0; i < tamaño; i++){
            nums[i] = start;
            start = start + 1;
        }
        return nums;
    }    

    //only14
    public boolean only14(int[] nums) {
        boolean x=true;
        for(int i=0; i < nums.length;i++){
            if(nums[i]==1||nums[i]==4){
                x=true;
            }else{
                x=false;
                break;
            }
        }
        return x;
    }

    //centeredAvarage
    public int centeredAverage(int[] nums) {
        int n = nums.length;
        int pos_menor, temp;
        int promedio = 0;
        int cont = 0;
        for (int i = 0; i < n - 1; i++) {
            pos_menor = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[pos_menor]){
                    pos_menor = j;
                }
            }
            temp = nums[i];
            nums[i] = nums[pos_menor];
            nums[pos_menor] = temp;
        }
        for (int i = 1; i < nums.length - 1; i++){
            if(nums[i] == nums[i+1] && i +1 < nums.length-1){
                continue;
            }else{
                promedio = promedio + nums[i];
                cont++;
            }
        }
        return promedio/cont;
    }

    //fizzArray
    public int[] fizzArray(int n) {
        int[] nums= new int[n];
        for(int i=0; i<nums.length;i++){
            nums[i]=i;
        }
        return nums;
    }
    
    //shiftleft
    public int[] shiftLeft(int[] nums) {
        if(nums.length == 0)return nums;
        int num2[] = new int[nums.length];
        int temp = nums[0];
        int cont = 0;
        for(int i = 1;i< nums.length; i++){
            num2[cont] = nums[i];
            cont++;
        }
        num2[cont] = temp;
        return num2;
    }
}
