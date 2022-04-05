import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    @Test
    public void testHashCode() {
        Player player = new Player("Eduardo", "Rodriguez", "Pitcher");
        Player indenticalPlayer = new Player("Eduardo", "Rodriguez", "Pitcher");

        int hashCode1 = player.hashCode();
        int hashCode2 = player.hashCode();
        int hashCode3 = indenticalPlayer.hashCode();

        assertEquals(hashCode1, hashCode2);
        assertEquals(hashCode1, hashCode3);
    }

    @Test
    public void testPlayer() {
        Player player = new Player("Bobby", "Dalbec", "First Base");
        int hashcode1 = player.hashCode();
        String[] playerInfo = {"Bobby", "Dalbec", "First Base"};
        int hashcode2 = Arrays.hashCode(playerInfo);
        Object a = new Object();
        a.hashCode();

        assertEquals(hashcode1, hashcode2);
    }
}