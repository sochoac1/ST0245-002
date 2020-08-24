/**
 * Write a description of class Recursion1 here.
 * 
 * @author (Miguel Angel Zapata & Santiago Ochoa) 
 * @version (1)
 */
public class Recursion1 {
    //Triangle
    public int triangle(int rows) { 
        if(rows==0){
            return 0; // C_1
        }
        return rows+triangle(rows-1); // T(n) = C_2 + T(n-1)
    } 

    //Fibonacci
    public int fibonacci(int n) { 
        if(n==0)return 0; 
        if(n==1)return 1; 
        return fibonacci(n-1)+fibonacci(n-2); // T(n) = C_3 + T(n-1) + T(n-2)
    }

    //CountHi
    public static int countHi(String str) { 
        int cont=0; 
        if(str.length()<=2) {
            if(str.substring(0,str.length()).equalsIgnoreCase("hi")){ 
                return cont=1;     //C_1 = 6
            }else{ 
                return 0; // C_2 = 4
            }
        }else{ 
            if(str.substring(0,2).equalsIgnoreCase("hi")){ 
                cont=1; // C_3 = 4 
            } 
        } 
        return cont+countHi(str.substring(1,str.length())); // C_4 = 2
        // T(n) = C_4 + T(n-1)
    } 

    //StringClean
    public String stringClean(String str) { 
        if (str.length() == 0) {
            return ""; // C_1 = 3
        }
        if (str.length() == 1) {
            return str;  // C_2 = 3
        }
        if(str.charAt(0) == str.charAt(1)){ 
            return stringClean(str.substring(1));// C_3 = 3
                                                 // T(n) = C_3 + T(n_1)
        }else{ 
            return str.charAt(0)+ stringClean(str.substring(1)); // C_4 = 3
                                                                 // T(n) = C_4 + T(n-1)
        }     
    } 
    
    //Array 11
    public int array11(int[] nums, int index) {
        int cont=0;
        if(index==nums.length){
            return 0; // C_1 = 3
        }
        if(nums[index]==11){
            cont=1; // C_2 = 4
        }
        return array11(nums,index+1)+cont; // C_3 = 3
                                           // T(n) = C_3 + T(n-1)       
    }
}

