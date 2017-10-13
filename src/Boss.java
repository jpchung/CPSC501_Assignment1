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

}
