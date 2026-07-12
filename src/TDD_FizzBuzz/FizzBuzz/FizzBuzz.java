package TDD_FizzBuzz.FizzBuzz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FizzBuzz {


    public static void main (String[] args){
        fizzBuzz(15).forEach((n)->System.out.println(n));

    }


    public static List<String> fizzBuzz(int n){

        ArrayList<String> res = new ArrayList<>();
        HashMap<Integer,String> mp = new HashMap<>();
        mp.put(3,"Fizz");
        mp.put(5, "Buzz");

        int[] divisors = {3,5};

        for (int i=1; i<=n;i++){
            StringBuilder s = new StringBuilder();

            for (int d : divisors){

                if (i%d==0){
                    s.append(mp.get(d));
                    
                }
            }
            if (s.isEmpty())
                s.append(i);
            
            res.add(s.toString());



        }
        return res;

        // for(int i=6;i<=100;i++){
        //     if (i%3==0&&i%5==0){
        //         System.out.println("FizzBuzz");
        //         continue;
        //     }else if(i%3==0 || i%5==0){
        //         if (i%3==0) {
        //             System.out.println("Fizz");
        //             continue;
        //         }
        //         System.out.println("Buzz"); 
        //         continue;
        //     }
        //     System.out.println(i);

    }
    

}

        
