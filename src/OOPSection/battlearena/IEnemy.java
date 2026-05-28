package OOPSection.battlearena;

public interface IEnemy {

    //Getters
    public int getHealthPoints();
    public int getAttackDamage();
    public int getHealthPointsRemaining();
    //setters
    public void setHealthPoints(int healthPoints);
    public void setAttackDamage(int attackDamage);
    public void setHealthPointsRemaining(int healthPointsRemaining);

    //Methods
    public void specialAttack();
    public int getId();
    public void talk();
    public void attack();
}
