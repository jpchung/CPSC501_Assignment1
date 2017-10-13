/**
 * CPSC 501 Assignment 1
 * @author Johnny Chung
 *
 * class for JUnit testing of Boss
 */

import org.junit.Test;
import static org.junit.Assert.*;
public class TestBoss {

    @Test
    public void testConstructor(){
        assertNotNull(new Boss());
        Boss boss = new Boss();
        assertEquals(-1, boss.getHealth());
        assertEquals(-1, boss.getStrength());
        assertEquals(-1, boss.getAccuracy());
    }

    @Test
    public void testParameterConstructor(){
        Player player = new Player();

        assertNotNull(new Boss(player));

        player.createWarrior();
        Boss boss = new Boss(player);
        assertEquals(boss.getHealth(),(player.getHealth()*20));
        assertEquals(boss.getStrength(), (player.getStrength() * 2));
        assertTrue(boss.getAccuracy() < 100);
        assertNotEquals(-1, boss.getAccuracy());
    }

    @Test
    public void testBossAttack(){
        Player player = new Player();
        player.createWarrior();
        Boss boss = new Boss(player);

        int playerHealthBeforeAttack  = player.getHealth();
        boss.bossAttack(player);
        int playerHealthAfterAttack =  player.getHealth();
        assertTrue(playerHealthBeforeAttack >= playerHealthAfterAttack);

    }
}
