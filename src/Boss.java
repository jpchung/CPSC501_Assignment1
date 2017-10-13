/**
 * CPSC 501 Assignment 1
 * @author Johnny Chung
 *
 * Original Code to refactor: CPSC 233 Project
 * @author Erik Biederstadt (original)
 * @author Patrick Abou Gharib (original)
 * Original code used with consent from original authors
 *
 *
 * Boss class
 */
import java.util.*;
public class Boss extends Character{

    //boss attributes (unique from Character)
    private int accuracy;

    //Constructor
    public Boss(){
        super();
        float accuracy = 0;
    }

    //constructor scaling with player
    public Boss(Player player) {
        this.setHealth( player.getHealth() * 20);
        this.setStrength(player.getStrength() * 2);
        this.accuracy = 100 - 2*(player.getEvade());

    }

    //get functions for Boss attributes
    public int getAccuracy(){ return this.accuracy; }


    public void displayAttributes(){
        System.out.println( "\nBoss \n"    +
                "HP : " + this.getHealth() + "\n" +
                "STR: " + this.getStrength());
    }

    public void bossAttack(Player player){
        Random random = new Random();
        int chanceToHit = random.nextInt(100);;
        if(chanceToHit < this.getAccuracy()) {
            System.out.printf("The boss retaliates and does %d damage!\n", this.getStrength());
            player.setHealth(player.getHealth() - this.getStrength());
        }
        else {
            System.out.println("The boss missed its counterattack!\n");
        }

    }

}
