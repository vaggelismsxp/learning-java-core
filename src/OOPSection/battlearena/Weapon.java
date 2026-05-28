package OOPSection.battlearena;

public class Weapon implements IWeapon {
    private String weaponType;
    private int attackIncrease;

    public Weapon(String weaponType,int attackDamageBoost){
        this.weaponType=weaponType;
        this.attackIncrease=attackDamageBoost;
    }

    //Getters
    @Override
    public String getWeaponType(){
        return this.weaponType;
    }
    @Override
    public int getAttackIncrease(){
        return this.attackIncrease;
    }
    //setters
    public void setWeaponType(String weaponType){
        this.weaponType=weaponType;
    }
    public void setAttackIncrease(int attackIncrease){
        this.attackIncrease=attackIncrease;
    }
    



}
