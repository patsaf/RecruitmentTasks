import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BiggestPrimeSumTest {

    private BiggestPrimeSum biggestPrimeSum;
    private int[] arr1 = {2, 3, 5, 7, 11, 13, 17, 19, 23}; //4
    private int[] arr2 = {2, 3, 5, 7, 11, 13}; //2

    @Before
    public void init() {
        biggestPrimeSum = new BiggestPrimeSum();
    }

    @Test
    public void checkIfResultIsCorrect() {
        assertTrue(biggestPrimeSum.getBiggestSum(arr1) == 4);
        assertTrue(biggestPrimeSum.getBiggestSum(arr2) == 2);
    }
}
