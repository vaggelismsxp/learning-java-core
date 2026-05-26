package OneTwoSections;
public class CastingDemo {
    public static void main(String[] args) {

        double check=45.4433;
        int checkInt= (int) check;

        System.out.println(checkInt);
        
        float anotherFloat = 33.25f;
        byte anotherByte = (byte)anotherFloat;
        System.out.println(anotherByte);

        String moneyHoner= "dv";
        int moneyBegger = Integer.parseInt(moneyHoner);
        System.out.println(moneyBegger);

        
    }
    
}
