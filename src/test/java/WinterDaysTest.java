import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class WinterDaysTest {

    private WinterDays winterDays;
    private final int[] testCase1 = {1, 2, 1, 6, 4, 3}; //3
    private final int[] testCase2 = {5, -5, 16, 17, 19, 10}; //2
    private final int[] testCase3 = {1, 1, 1, 1}; //4
    private final int[] testCase4 = {1, 5, 4, 3, 2}; //1
    private final int[] testCase5 = {11, 4, 15, 16, 9, 8, 7, 10, 14, 12, 13}; //8

    @Before
    public void init() {
        winterDays = new WinterDays();
    }

    @Test
    public void checkWinterDays() {
        assertTrue(winterDays.countDays(testCase1)==3);
        assertTrue(winterDays.countDays(testCase2)==2);
        assertTrue(winterDays.countDays(testCase3)==4);
        assertTrue(winterDays.countDays(testCase4)==1);
        assertTrue(winterDays.countDays(testCase5)==8);
    }
}
