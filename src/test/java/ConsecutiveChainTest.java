import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ConsecutiveChainTest {

    private ConsecutiveChain consecutiveChain;
    private int[] arr1 = {5, 3, 4, 2, 1}; //5
    private int[] arr2 = {11, 4, 15, 16, 9, 8, 9, 10, 14, 12, 13}; //9
    private int[] arr3 = {1, 1, 1, 1}; //1
    private int[] arr4 = {1, 2, 1, 6, 6, 7}; //2
    private int[] arr5 = {5, -5, 16, 17, 19, 10, 18}; //4

    @Before
    public void init() {
        consecutiveChain = new ConsecutiveChain();
    }

    @Test
    public void checkIfResultIsCorrect() {
        assertTrue(consecutiveChain.getChainLength(arr1) == 5);
        assertTrue(consecutiveChain.getChainLength(arr2) == 9);
        assertTrue(consecutiveChain.getChainLength(arr3) == 1);
        assertTrue(consecutiveChain.getChainLength(arr4) == 2);
        assertTrue(consecutiveChain.getChainLength(arr5) == 4);

    }
}
