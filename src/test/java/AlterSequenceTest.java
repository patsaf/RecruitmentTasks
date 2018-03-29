import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class AlterSequenceTest {

    private AlterSequence alterSequence;
    private final Integer[] A = {2, 3, 9, 2, 5, 1, 3, 7, 10};
    private final Integer[] B = {2, 1, 3, 4, 3, 10, 6, 6, 1, 7, 10, 10, 10};
    private final Integer[] C = {2, 9, 2, 5, 7, 10};

    //TODO: add more test cases

    @Before
    public void init() {
        alterSequence = new AlterSequence();
    }

    @Test
    public void checkNewSequence() {
        assertTrue(alterSequence
                .getNewSequence(Arrays.asList(A), Arrays.asList(B))
                .equals(Arrays.asList(C)));
    }

}
