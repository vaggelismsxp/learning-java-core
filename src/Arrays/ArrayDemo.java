package Arrays;

public class ArrayDemo {
    
    public static void main(String[] args) {
        String[] colos = new String[15];
        for (int i =0; i<15;i++){
            colos[i]=String.valueOf(i);
        }
        System.out.println("Colos Length: "+ colos.length);
        for(String temp : colos){
            System.out.println(temp);
            if (temp.equals("1")) {
                temp= "Devolooo";
                System.out.println("temp : "+ temp + "  and colos:"+  colos[1]);

            }
        }
    }
}
