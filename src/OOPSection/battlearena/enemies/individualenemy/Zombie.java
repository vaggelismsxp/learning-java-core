package OOPSection.battlearena.enemies.individualenemy;

import OOPSection.battlearena.enemies.Enemy;

public class Zombie extends Enemy implements IZombie {
    
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
    @Override
    public void battleStance(){
        System.out.println("Ready all the time to suck your titties");
    }
    @Override
    public void specialAttack(){
        boolean didSpecialAttackWork = Math.random() < .50;
        if (didSpecialAttackWork){
            setHealthPoints(getHealthPoints()+2);
            System.out.println("Zombie generated 2 HP");
        }
    }
}
