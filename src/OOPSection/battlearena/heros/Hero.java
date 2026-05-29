package OOPSection.battlearena.heros;

import OOPSection.battlearena.heros.weapons.Weapon;

public class Hero implements IHero{
    private int healthPoints;
    private int healthPointsRemaining;
    private int attackDamage;
    private boolean isWeaponEquipped=false;
    private Weapon weapon;
    

    public Hero(int healthPoints,int attackDamage){

        this.healthPoints=healthPoints;
        this.healthPointsRemaining=healthPoints;
        this.attackDamage=attackDamage;
    }
    public Hero(int healthPoints,int attackDamage, Weapon weapon){
        this.weapon=weapon;
        this.isWeaponEquipped=true;
        this.healthPoints=healthPoints;
        this.healthPointsRemaining=healthPoints;
        this.attackDamage=attackDamage;
    }

    //Setters
    public void setHealthPoints(int healthPoints){
        this.healthPoints=healthPoints;
    }
    public void setHealthPointsRemaining(int healthPointsRemaining){
        this.healthPointsRemaining=healthPointsRemaining;
    }
    public void setWeaponEquipped(boolean isWeaponEquipped){
        this.isWeaponEquipped=isWeaponEquipped;
    }
    public void setAttackDamage(int attackDamage){
        this.attackDamage=attackDamage;
    }
    public void setWeapon(Weapon weapon){
        this.weapon=weapon;
    }
    //Getters
    public int getHealthPoints(){
        return this.healthPoints;
    }
    public int getHealthPointsRemaining(){
        return this.healthPointsRemaining;
    }
    public boolean isWeaponEquipped(){
        return this.isWeaponEquipped;
    }
    public int getAttackDamage(){
        return this.attackDamage;
    }
    public Weapon getWeapon(){
        return this.weapon;
    }


    //Methods
    public void attack(){
        System.out.println("Hero attacks with his weapon for: " + this.getAttackDamage());
    }
    @Override
    public void equipWeapon(){
        if (this.getWeapon()!=null && isWeaponEquipped){
            setAttackDamage(getAttackDamage() + weapon.getAttackIncrease());
            setWeaponEquipped(true);

        }

    }
}
