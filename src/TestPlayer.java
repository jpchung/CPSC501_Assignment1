/**
 * CPSC 501 Assignment 1
 * @author Johnny Chung
 *
 * class for JUnit testing of Player
 */

import org.junit.Test;
import static org.junit.Assert.*;
public class TestPlayer {

    @Test
    public void testConstructor(){
        assertNotNull(new Player());
        Player player = new Player();
        assertEquals(-1, player.getHealth());
        assertEquals(-1, player.getStrength());
        assertEquals(-1, player.getIntelligence());
        assertEquals(-1, player.getEvade());

    }

    @Test
    public void testCreateWarrior(){
        Player player = new Player();
        player.createWarrior();

        assertTrue(player.getHealth() >= 15);
        assertTrue(player.getStrength() >= 15);
        assertTrue(player.getIntelligence() >= 5);
        assertTrue(player.getEvade() >= 5);

    }

    @Test
    public void testCreateMage(){
        Player player = new Player();
        player.createMage();

        assertTrue(player.getHealth() >= 10);
        assertTrue(player.getStrength() >= 5);
        assertTrue(player.getIntelligence() >= 20);
        assertTrue(player.getEvade() >= 5);
    }

    @Test
    public void testCreateThief(){
        Player player = new Player();
        player.createThief();

        assertTrue(player.getHealth() >= 10);
        assertTrue(player.getStrength() >= 5);
        assertTrue(player.getIntelligence() >= 5);
        assertTrue(player.getEvade() >= 15);
    }


}
