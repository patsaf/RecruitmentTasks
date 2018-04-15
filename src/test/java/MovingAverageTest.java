import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class MovingAverageTest {

    private MovingAverage movingAverage;
    private int[] arr1 = {2, 3, 9, 2, 5, 1, 3, 7, 10}; //k=3
    private int[] arr1Result = {2, 2, 4, 4, 5, 2, 3, 3, 6};
    private int[] arr2 = {1, 5, 4, 3, 2}; //k=5
    private int[] arr2Result = {1, 3, 3, 3, 3};
    private int[] arr3 = {11, 4, 15, 16, 9, 8, 7, 10, 14, 12, 13}; //k=2
    private int[] arr3Result = {11, 7, 9, 15, 12, 8, 7, 8, 12, 13, 12};

    @Before
    public void init() {
        movingAverage = new MovingAverage();
    }

    @Test
    public void assertThatAvgValuesAreCorrect() {
        for(int i=0; i<arr1Result.length;i++) {
            assertTrue(movingAverage.movingAverage(arr1,3)[i]==arr1Result[i]);
        }
        for(int i=0; i<arr2Result.length;i++) {
            assertTrue(movingAverage.movingAverage(arr2,5)[i]==arr2Result[i]);
        }
        for(int i=0; i<arr3Result.length;i++) {
            assertTrue(movingAverage.movingAverage(arr3,2)[i]==arr3Result[i]);
        }
    }
}
