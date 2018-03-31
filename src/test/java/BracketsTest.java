import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BracketsTest {

    private Brackets brackets;
    private final String testCase1 = "[{}({})()]"; //true
    private final String testCase2 = "{[(])}"; //false
    private final String testCase3 = "[{()}]"; //true
    private final String testCase4 = "{[(]}"; //false
    private final String testCase5 = "{[}]"; //false

    @Before
    public void init() {
        brackets = new Brackets();
    }

    @Test
    public void checkBrackets() {
        assertTrue(brackets.isCorrect(testCase1));
        assertFalse(brackets.isCorrect(testCase2));
        assertTrue(brackets.isCorrect(testCase3));
        assertFalse(brackets.isCorrect(testCase4));
        assertFalse(brackets.isCorrect(testCase5));
    }
}
