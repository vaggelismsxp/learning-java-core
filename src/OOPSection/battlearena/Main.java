package OOPSection.battlearena;

import static OOPSection.battlearena.enemies.Enemy.getNumberOfEnemies;

import OOPSection.battlearena.enemies.Enemy;
import OOPSection.battlearena.enemies.individualenemy.Zombie;
import OOPSection.battlearena.enemies.individualenemy.Ogre;
import OOPSection.battlearena.heros.Hero;
import OOPSection.battlearena.heros.weapons.Weapon;
public class Main {

    public static void main(String[] args) {
        
        Zombie zombie = new Zombie(30,3);
        Hero hero = new Hero(25,1);
        Weapon weapon = new Weapon("Sword", 5);

        hero.setWeapon(weapon);
        hero.setWeaponEquipped(true);
        hero.equipWeapon();

        heroBattle(hero,zombie);

        Ogre ogre = new Ogre(15, 3);

        heroBattle(hero, ogre);

    }

    private static void heroBattle(Hero hero, Enemy enemy) {
        getNumberOfEnemies();
        while (hero.getHealthPointsRemaining() >0 && enemy.getHealthPointsRemaining()>0){
            enemy.specialAttack();

            enemy.attack();
            hero.setHealthPointsRemaining(hero.getHealthPointsRemaining() - enemy.getAttackDamage());

            hero.attack();
            enemy.setHealthPointsRemaining(enemy.getHealthPointsRemaining() - hero.getAttackDamage());


        }
        if (hero.getHealthPointsRemaining()>0){
            System.out.println("Hero wins, life remaining: " + hero.getHealthPointsRemaining() );
        }else if(enemy.getHealthPointsRemaining()>0){
            System.out.println("Monster Wins, life remaining: " + enemy.getHealthPointsRemaining());
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
