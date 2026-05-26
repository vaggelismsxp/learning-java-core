package OneTwoSections;
public class StringDemo{
    public static void main(String[] args) {

        String message= "Hello world";
        String extra = "idk why";
        System.out.println(message + " " + extra );
        System.out.println("Leangth of " + extra + " is " + extra.length());
        
        System.out.println("UpperCase of " + extra + " is " + extra.toUpperCase());
        System.out.println("LowerCase of " + extra + " is " + extra.toLowerCase());
        String combo = message + " " + extra;
        System.out.println("combo: " + combo);
        String upperVersion = combo.toUpperCase();
        System.out.println(upperVersion);
    }
}