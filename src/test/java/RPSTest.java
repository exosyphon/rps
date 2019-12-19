import org.junit.Test;

import static org.junit.Assert.*;

public class RPSTest {
    @Test
    public void testRockVsPaper() {
        assertEquals("Player 2 Wins", new RPSGame().score("Rock", "Paper"));
    }
}
