package OOPSection.battlearena;

import static OOPSection.battlearena.Enemy.getNumberOfEnemies;
public class Main {

    public static void main(String[] args) {
        
        Zombie zombie = new Zombie(30,9);
        Hero hero = new Hero(30,5);
        Weapon weapon = new Weapon("Sword", 5);

        hero.setWeapon(weapon);
        hero.setWeaponEquipped(true);
        hero.equipWeapon();

        heroBattle(hero,zombie);

        System.out.println(hero.getAttackDamage());
        
    }

    private static void heroBattle(Hero hero, Enemy enemy) {
        while (hero.getHealthPointsRemaining() >0 && enemy.getHealthPointsRemaining()>0){
            enemy.specialAttack();

            enemy.attack();
            hero.setHealthPointsRemaining(hero.getHealthPointsRemaining() - enemy.getAttackDamage());

            enemy.setHealthPointsRemaining(enemy.getHealthPointsRemaining() - hero.getAttackDamage());


        }
        if (hero.getHealthPointsRemaining()>0){
            System.out.println("Hero wins");
        }else if(enemy.getHealthPointsRemaining()>0){
            System.out.println("Monster Wins");
        }else{
            System.out.println("Fight ended as a draw");
        }

    }

    public static void battle(Enemy e1, Enemy e2){

        while (e1.getHealthPointsRemaining()>0 && e2.getHealthPointsRemaining()>0){
            e1.talk();
            e2.talk();

            e1.specialAttack();
            e2.specialAttack();

            e2.attack();
            e1.setHealthPointsRemaining(e1.getHealthPointsRemaining() - e2.getAttackDamage());
            
            e1.attack();
            e2.setHealthPointsRemaining(e2.getHealthPointsRemaining() - e1.getAttackDamage());
        }
        if (e1.getHealthPointsRemaining()>0){
            System.out.println("E1 enemy wins");
        }else if (e2.getHealthPointsRemaining()>0){
            System.out.println("E2 enemy wins");
        }else{
            System.out.println("It ends with Draw");
        }
    }
    
    
}
