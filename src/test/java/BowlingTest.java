import org.junit.Test;
import static org.junit.Assert.*;

public class BowlingTest {
    @Test public void testZeroGame() {
        assertEquals(0, new BowlingGame("-- -- -- -- -- -- -- -- -- --").score());
    }
}
