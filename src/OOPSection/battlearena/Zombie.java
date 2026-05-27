package OOPSection.battlearena;


public class Zombie extends Enemy {
    
    public Zombie(int healthPoints,int attackDamage){
        super(healthPoints,attackDamage);

    }
    @Override
    public void talk(){
        System.out.println("AAAAAAAAgrrrrrrr");
    }
    @Override
    public void attack(){
        System.out.println("Zombie attacks for " + this.getAttackDamage() + " damage");
    }
}
