package OOPSection.extras;

public class Dog extends Animal{
    private int leg;
    private String type;
    private boolean canShed;
    private String domesticName;
    
    public Dog(){}
    public Dog(int weight, String color, int age, String animalType,int leg,String type, boolean canShed, String domesticName){
        super(weight, color,age,animalType);
        
        this.leg = leg;
        this.type=type;
        this.canShed=canShed;
        this.domesticName=domesticName;
    }
    public void Eat(){
        System.out.println("FAGITO MWRE");
    }
    
    
}
