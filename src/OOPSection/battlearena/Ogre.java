package OOPSection.battlearena;

public class Ogre extends Enemy {

    public Ogre( int healthPoints,int attackDamage){
        super(healthPoints,attackDamage);
        
    }


    @Override
    public void talk(){
        System.out.println("THIS IS MY HOME ODDYSEYS");
    }
    @Override
    public void attack(){
        System.out.println("Ogre attacks for " + this.getAttackDamage() + " damage");
    }
}
