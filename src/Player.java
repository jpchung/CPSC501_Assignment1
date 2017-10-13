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
 * Player class
 */
import java.util.*;
public class Player {

    //Player attributes
    private int health;
    private int strength;
    private int intelligence;
    private int evade;




    //Constructor
    public Player() {
        this.health = -1;
        this.strength = -1;
        this.intelligence = -1;
        this.evade = -1;

    }

    //Set functions for player attributes
    public void setHealth(int health){ this.health = health; }
    public void setStrength(int strength){ this.strength = strength; }
    public void setIntelligence(int intelligence){ this.intelligence = intelligence; }
    public void setEvade(int evade){this.evade =evade;}


    //Get functions for player attributes
    public int getHealth(){ return this.health; }
    public int getStrength(){ return this.strength ;}
    public int getIntelligence(){ return this.intelligence; }
    public int getEvade(){return this.evade;}



    public void displayAttributes(){
        System.out.println( "\nPlayer \n"    +
                "HP : " + this.health + "\n" +
                "STR: " + this.strength + "\n" +
                "INT: " + this.intelligence + "\n" +
                "EVD: " + this.evade);

    }
}
