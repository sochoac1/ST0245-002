import java.util.*;
class Calculadora{
    public static int polacaInversa(String s){
        Stack<Integer> p = new Stack<Integer>();
        String[] aux = s.split(" ");
        int num1 = 0;
        int num2 = 0;
        for(int i = 0; i < aux.length; i++){
            if(aux[i].equals("+") || aux[i].equals("-") || aux[i].equals("*") || aux[i].equals("/")){
                if(aux[i].equals("+")){
                    num1 = p.pop();
                    num2 = p.pop();
                    p.push(num1+num2);
                } else if(aux[i].equals("*")){
                    num1 = p.pop();
                    num2 = p.pop();
                    p.push(num1*num2);
                } else if(aux[i].equals("-")){
                    num1 = p.pop();
                    num2 = p.pop();
                    p.push(num2-num1);
                } else if(aux[i].equals("/")){
                    num1 = p.pop();
                    num2 = p.pop();
                    p.push(num2/num1);
                }
            } else{
               p.push(Integer.parseInt(aux[i]));
            } 
        }
        return p.pop();
    }

    public static void main(String[] args){
        String t = "14 16 -";
        System.out.println(polacaInversa(t));
    }
}

