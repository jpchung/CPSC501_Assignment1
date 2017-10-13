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
 * Driver class to run game
 */
import java.util.*;
public class Driver {


    public static void main(String[] args) {

        //setup game stats
        Player player = new Player();
        Boss boss = new Boss();
        int turn = 1;
        int choice = -1;


        System.out.println("Welcome to the game!");
        Scanner input = new Scanner(System.in);

        askUser(input, choice, player);

        player.displayAttributes();


        //spawn boss
        System.out.println("\nSpawning boss! Get Ready!");
        boss = new Boss(player);

        //keep playing while player and boss still alive
        while(player.getHealth() > 0 && boss.getHealth() > 0) {
            System.out.println("------------------------------");
            System.out.println("\nTURN: " + turn);
            boss.displayAttributes();
            player.displayAttributes();
            System.out.println("NOTE: every 2 turns survived increases your HP");

            System.out.println("\n1| Physical Attack\n" +
                    "2| Magical Attack\n" +
                    "3| Quit game");
            System.out.print("Enter a choice: ");

            while(!input.hasNextInt()) {
                input.next();
                System.out.print("Enter a valid integer: ");
            }
            choice =  input.nextInt();

            Random random = new Random();
            int chanceToHit = random.nextInt(100);


            if(choice == 1) {
                System.out.printf("\nYou did %d damage!\n", player.getStrength());
                boss.setHealth(boss.getHealth() - player.getStrength());

                bossAttack(chanceToHit, boss, player);
            }
            else if(choice == 2) {
                System.out.printf("\nYou did %d damage!\n", player.getIntelligence());
                boss.setHealth(boss.getHealth() - player.getIntelligence());

                bossAttack(chanceToHit, boss, player);
            }
            else if(choice == 3) {
                System.out.println("quitting game...");
                break;
            }
            else {
                System.out.print("Enter a valid integer:");
            }

            //increase health every 2 turns
            if((turn%2) == 0) {
                player.setHealth(player.getHealth() + 10);
            }
            turn++;
        }

        if(player.getHealth() <= 0) {
            System.out.println("YOU DIED");
            if(turn <= 3)
                System.out.println("lol git gud");

        }
        else if (boss.getHealth() <= 0) {
            System.out.printf("You won the game in %d turns!", turn);
        }

    }

    //game logic for boss counterattack
    private static void bossAttack(int chanceToHit, Boss boss, Player player){
        if(chanceToHit < boss.getAccuracy()) {
            System.out.printf("The boss retaliates and does %d damage!\n", boss.getStrength());
            player.setHealth(player.getHealth() - boss.getStrength());
        }
        else {
            System.out.println("The boss missed its counterattack!\n");
        }
    }

    //ask user for class selection
    private static void askUser(Scanner input, int choice, Player player){

        while(true){

            System.out.println( "1| Select Warrior Class\n" +
                    "2| Select Mage Class\n" +
                    "3| Select Thief Class" );

            System.out.print("Enter a choice: ");

            //check if integer input
            while(!input.hasNextInt()){
                input.next();
                System.out.print("Enter a valid integer: ");
            }

            choice = input.nextInt();

            if(choice == 1){
                //create warrior
                player.createWarrior();
                break;
            }
            else if(choice == 2){
                //create mage
                player.createMage();
                break;
            }
            else if(choice == 3){
                //create thief
                player.createThief();
                break;
            }
            else {
                System.out.println("Out of range");
            }
        }
    }





}
