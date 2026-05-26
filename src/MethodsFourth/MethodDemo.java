package MethodsFourth;

public class MethodDemo {
    public static void main(String[] args) {
        Greetings(30);

    }

    public static void Greetings(int count){
        for (int i=0 ; i<count;i++){
            Greetings();
            if (i >= 5) break;
        }
    }


    public static void Greetings(){
        System.out.println("dvl on top");
        System.out.println("checking how this works");
        System.out.println("preparing for tomorrow");
    }
    
}
