import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ZombieClusterTest {

    private ZombieCluster zombieCluster;
    private final int[][] testCase1 = {{1, 0, 0, 1}, {0, 1, 1, 1}, {0, 1, 1, 0}, {1, 1, 0, 1}}; //1
    private final int[][] testCase2 = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}; //3
    private final int[][] testCase3 = {{1, 0, 1, 0}, {0, 1, 0, 1}, {1, 0, 1, 0}, {0, 1, 0, 1}}; //2
    private final int[][] testCase4 = {{1, 0, 0, 1, 1}, {0, 1, 0, 1, 0}, {0, 0, 1, 0, 0}, {1, 1, 0, 1, 0}, {1, 0, 0, 0, 1}}; //2
    private final int[][] testCase5 = {{1, 0, 1, 0}, {0, 1, 0, 0}, {1, 0, 1, 0}, {0, 0, 0, 1}}; //3

    @Before
    public void init() {
        zombieCluster = new ZombieCluster();
    }

    @Test
    public void checkWinterDays() {
        assertTrue(zombieCluster.countClusters(testCase1) == 1);
        assertTrue(zombieCluster.countClusters(testCase2) == 3);
        assertTrue(zombieCluster.countClusters(testCase3) == 2);
        assertTrue(zombieCluster.countClusters(testCase4) == 2);
        assertTrue(zombieCluster.countClusters(testCase5) == 3);
    }
}
