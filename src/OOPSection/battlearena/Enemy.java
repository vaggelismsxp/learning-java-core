package OOPSection.battlearena;

public abstract class Enemy implements IEnemy {
    private int id;
    private int healthPoints;
    private int healthPointsRemaining;
    private int attackDamage;
    private static int numberOfEnemies;
    
    Enemy(){}
    Enemy( int healthPoints,int attackDamage){
        this.healthPoints = healthPoints;
        this.healthPointsRemaining=healthPoints;
        this.attackDamage=attackDamage;
        numberOfEnemies++;
        this.id=numberOfEnemies;

    }

    
    //Methods
    @Override
    public void talk(){
        System.out.println("AAAAAAAAAAAAAA");
    }
    @Override
    public void attack(){
        System.out.println("Enemy attacks for "+this.attackDamage+" damage");

    }
    @Override
    public void specialAttack(){
        System.out.println("Enemy does not have a special attack.");
    }



    //Getters
    public void getInformation(){
        System.out.println(
            "health: " + this.getHealthPoints() + "\t" +
            "attackdmg: " + this.getAttackDamage()
        );
    }
    @Override
    public int getId(){
        return this.id;
    }
    @Override
    public int getHealthPoints(){
        return this.healthPoints;
    }
    @Override
    public int getHealthPointsRemaining(){
        return this.healthPointsRemaining;
    }
    @Override
    public int getAttackDamage(){
        return this.attackDamage;
    }
    public static int getNumberOfEnemies(){
        return numberOfEnemies;
    }
    //Setters
    @Override
    public void setHealthPoints(int healthPoints){
        this.healthPoints = healthPoints;
    }
    @Override
    public void setAttackDamage(int attackDamage){
        this.attackDamage = attackDamage;
    }
    @Override
    public void setHealthPointsRemaining(int newHealthPoint){
        this.healthPointsRemaining=newHealthPoint;
    }

   
}
