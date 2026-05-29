package OOPSection.battlearena.enemies.individualenemy;

import OOPSection.battlearena.enemies.Enemy;

public class Ogre extends Enemy implements IOgre {

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
    @Override
    public void stareDown(){
        System.out.println("Ogre ready to eat your ars");
    }
    @Override
    public void specialAttack(){
        boolean didSpecialAttackWork = Math.random() < .20;
        if (didSpecialAttackWork){
            this.setAttackDamage(getAttackDamage()+4);
            System.out.println("Ogre gets +4 attack damage buff");
        }
    }

}
