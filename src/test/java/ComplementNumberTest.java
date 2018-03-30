import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ComplementNumberTest {

    private ComplementNumber complementNumber;
    private final int testCase1 = 50; //13
    private final int testCase2 = 1; //0
    private final int testCase3 = 8; //7
    private final int testCase4 = 27; //4
    private final int testCase5 = 175; //80

    @Before
    public void init() {
        complementNumber = new ComplementNumber();
    }

    @Test
    public void checkWinterDays() {
        assertTrue(complementNumber.complementNumber(testCase1) == 13);
        assertTrue(complementNumber.complementNumber(testCase2) == 0);
        assertTrue(complementNumber.complementNumber(testCase3) == 7);
        assertTrue(complementNumber.complementNumber(testCase4) == 4);
        assertTrue(complementNumber.complementNumber(testCase5) == 80);
    }
}
