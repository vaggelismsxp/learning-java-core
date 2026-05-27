package OOPSection.battlearena;


public class Main {

    public static void main(String[] args) {
        
        // Ogre[] ogres = new Ogre[5];
        // for (int i=0;i<ogres.length;i++){
        //     ogres[i] = new Ogre(i, i);
        // }
        // Zombie[] zombies = new Zombie[10];
        // for (int i=0;i<zombies.length;i++){
        //     zombies[i] = new Zombie(i, i);
        // }
        // System.out.println("ee");
        // System.out.println(zombies[0].getNumberOfEnemies());
          

        // Enemy[] enemy = new Enemy[11];
        // for (int i=0;i<enemy.length;i++){
        //     if (i%2==0){
        //         enemy[i] = new Zombie(i, i);
        //     }else{
        //         enemy[i] = new Ogre(i, i);
        //     }
        // }

        // for (Enemy temp : enemy){
        //     temp.talk();
        // }
        // enemy[0].talk();

        Zombie zombie= new Zombie(10,1);
        Ogre ogre = new Ogre(20,3);

        battle(zombie);
        battle(ogre);

    }

    public static void battle(Enemy e){
        e.talk();
        e.attack();
    }
    
}
