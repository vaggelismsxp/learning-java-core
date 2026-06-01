package ExcHandling;

public class SimpleTryCatch {
    
    public static void main(String[] args) {
        
        
        parseString(null);



    }

    public static void parseString(String numberString){


        try{
            Integer.parseInt(numberString);
        }catch(NullPointerException | NumberFormatException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);

        }finally{
            System.out.println("always run no matter what");
        }
    }
}
