import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class CountSessionsTest {

    private CountSessions countSessions;
    private final String[] testCase1 = {"2017-03-10 08:13:11", "2017-03-10 19:01:27", "2017-03-11 07:35:55",
            "2017-03-11 16:15:11", "2017-03-12 08:01:41", "2017-03-12 17:19:08"}; //true
    private final String[] testCase2 = {"2017-03-10 18:58:11", "2017-03-10 19:01:27", "2017-03-11 07:35:55",
            "2017-03-11 16:15:11", "2017-03-12 08:01:41", "2017-03-12 17:19:08"}; //false
    private final String[] testCase3 = {"2017-03-08 17:11:13", "2017-03-11 17:22:47", "2017-03-11 19:23:51",
            "2017-03-11 22:03:12", "2017-03-12 08:32:04", "2017-03-12 13:19:08", "2017-03-12 17:19:08"}; //false

    @Before
    public void init() {
        countSessions = new CountSessions();
    }

    @Test
    public void checkIfUserShouldBeAsked() {
        assertTrue(countSessions.shouldBeAsked(testCase1));
        assertFalse(countSessions.shouldBeAsked(testCase2));
        assertFalse(countSessions.shouldBeAsked(testCase3));
    }
}
