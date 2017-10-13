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
public class Boss {

    //boss attributes
    private int health;
    private int strength;
    private int accuracy;


    //Constructor
    public Boss(){
        this.health = -1;
        this.strength = -1;
        float accuracy = 0;
    }

    //constructor scaling with player
    public Boss(Player player) {
        this.health = player.getHealth() * 20;
        this.strength =  player.getStrength() * 2;
        this.accuracy = 100 - 2*(player.getEvade());

    }

    //set functions for Boss attributes
    public void setHealth(int health){ this.health = health; }
    public void setStrength(int strength){ this.strength = strength; }



    //get functions for Boss attributes
    public int getHealth(){ return this.health; }
    public int getStrength(){ return this.strength ;}
    public int getAccuracy(){ return this.accuracy; }


    public void displayAttributes(){
        System.out.println( "\nBoss \n"    +
                "HP : " + this.health + "\n" +
                "STR: " + this.strength);
    }

}
