import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BattleshipTest {

    private Battleship battleship;

    //test case 1
    private final int N = 4;
    private final String S = "1B 2C,2D 4D";
    private final String T = "2C 1B 2B 2D 3D 4A";

    //TODO: add more test cases

    @Before
    public void init() {
        battleship = new Battleship();
    }

    @Test
    public void checkShipsSunkAndHit() {
        assertTrue(battleship.checkScore(N,S,T).equals("0,2"));
    }
}
