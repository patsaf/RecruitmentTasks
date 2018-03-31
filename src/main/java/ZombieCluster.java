import java.util.ArrayList;
import java.util.List;

/**
 * Given: symmetric matrix filled with '0's and '1's.
 * Description: if zombie 1 knows zombie 2 and zombie 2 knows zombie 3
 * then zombie 1 also knows zombie 3 (though indirectly) and
 * all 3 of them belong to the same cluster
 * Task: determine the number of zombie clusters in the given matrix
 */
public class ZombieCluster {

    public int countClusters(int[][] zombies) {
        List<Integer> singleZombies = new ArrayList<>();
        for (int i = 0; i < zombies.length; i++) {
            singleZombies.add(i, i + 1);
        }
        for (int i = 0; i < zombies.length - 1; i++) {
            for (int j = i + 1; j < zombies.length; j++) {
                if (zombies[i][j] == 1 && singleZombies.contains(j + 1)) {
                    Integer toRemove = j + 1;
                    singleZombies.remove(toRemove);
                    for (int k = 0; k < zombies.length; k++) {
                        if (k != i && k != j && zombies[j][k] == 1 && singleZombies.contains(k+1)) {
                            Integer toRemove2 = k + 1;
                            singleZombies.remove(toRemove2);
                        }
                    }
                }
            }
        }
        return singleZombies.size();
    }
}
