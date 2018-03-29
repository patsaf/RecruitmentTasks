import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class HillsAndValleysTest {

    private HillsAndValleys hillsAndValleys;
    private final int[] testCase1 = {1, 2, 1, 6, 6, 7}; //4
    private final int[] testCase2 = {5, -5, 16, 17, 19, 10}; //4
    private final int[] testCase3 = {1, 1, 1, 1}; //1
    private final int[] testCase4 = {1, 5, 4, 3, 2}; //3
    private final int[] testCase5 = {11, 4, 15, 16, 9, 8, 7, 10, 14, 12, 13}; //7
    private final int[] testCase6 = {-3, -3, -3, -4}; //2

    @Before
    public void init() {
        hillsAndValleys = new HillsAndValleys();
    }

    @Test
    public void checkCastleCount() {
        assertTrue(hillsAndValleys.countCastles(testCase1) == 4);
        assertTrue(hillsAndValleys.countCastles(testCase2) == 4);
        assertTrue(hillsAndValleys.countCastles(testCase3) == 1);
        assertTrue(hillsAndValleys.countCastles(testCase4) == 3);
        assertTrue(hillsAndValleys.countCastles(testCase5) == 7);
        assertTrue(hillsAndValleys.countCastles(testCase6) == 2);
    }
}
