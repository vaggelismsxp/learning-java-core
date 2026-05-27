package OOPSection.battlearena;

public class Enemy {
    private int id;
    private int healthPoints;
    private int attackDamage;
    private static int numberOfEnemies;
    
    Enemy(){}
    Enemy( int healthPoints,int attackDamage){
        this.healthPoints = healthPoints;
        this.attackDamage=attackDamage;
        numberOfEnemies++;
        this.id=numberOfEnemies;

    }

    
    //Methods
    public void talk(){
        System.out.println("AAAAAAAAAAAAAA");
    }
    public void attack(){
        System.out.println("Enemy attacks for "+this.attackDamage+" damage");

    }
    //Getters
    public void getInformation(){
        System.out.println(
            "health: " + this.getHealthPoints() + "\t" +
            "attackdmg: " + this.getAttackDamage()
        );
    }
    public int getID(){
        return this.id;
    }
    public int getHealthPoints(){
        return this.healthPoints;
    }
    public int getAttackDamage(){
        return this.attackDamage;
    }
    public int getNumberOfEnemies(){
        return numberOfEnemies;
    }
    //Setters
    public void setID(int id){
        this.id=id;
    }
    public void setHealthPoints(int healthPoints){
        this.healthPoints = healthPoints;
    }
    public void setAttackDamage(int attackDamage){
        this.attackDamage = attackDamage;
    }
   
}
