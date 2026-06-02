package OOPSection.PojosOOP;

public class Animal {
    
    private int weight;
    private String color;
    private int age;
    private String animalType;


    Animal(){}
    Animal(int weight, String color, int age, String animalType){
        this.weight=weight;
        this.color=color;
        this.age=age;
        this.animalType=animalType;
    }

    public void Talk(){
        System.out.println("This is an animal talking");
    }

    public void Eat(){
        System.out.println("animal eating");
    }
    public void Sleep(){
        System.out.println("animal sleeping");
    }


}
