package MethodsFourth;

public class Factorial {
    double result;
    public static void main(String[] args) {
        System.out.println(factorial(1)); 

    }


    public static double factorial(int num){
        
        if (num == 0){
            return 1;
        }
        
        return num*factorial(num-1);
    }
    
}
