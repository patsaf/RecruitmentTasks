import java.util.Arrays;

/**
 * Given: array of integers (shuffled)
 * Task: return length of the longest chain of
 * consecutive numbers in the array (ignoring the duplicates)
 */
public class ConsecutiveChain {

    public int getChainLength(int[] array) {
        int count = 1;
        int countTemp = 1;
        Arrays.sort(array);
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == (array[i + 1] - 1)) {
                countTemp++;
            } else if (array[i] != array[i + 1]) {
                count = (countTemp > count) ? countTemp : count;
                countTemp = 1;
            }
        }
        count = (countTemp > count) ? countTemp : count;
        return count;
    }
}
