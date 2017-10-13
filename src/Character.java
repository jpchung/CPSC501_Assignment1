/**
 * CPSC 501 Assignment 1
 * @author Johnny Chung
 *
 * abstract class for Player and Boss classes
 */

public abstract class Character {

    //shared instance variables for Player and Boss
    private int health;
    private int strength;

    //constructor
    //default values negative to determine if not altered since initialization
    public Character(){
        this.health = -1;
        this.strength = -1;
    }

    //set functions for Character attributes
    public void setHealth(int health){ this.health = health; }
    public void setStrength(int strength){ this.strength = strength; }

    //get functions for Character attributes
    public int getHealth(){ return this.health; }
    public int getStrength(){ return this.strength ;}

    //abstract method for displaying Player/Boss attributes
    public abstract void displayAttributes();


}
