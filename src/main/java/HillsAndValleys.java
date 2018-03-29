/**
 * Given: array of integers storing land levels
 * Description: a castle may be built only in a valley or on a hill,
 * a valley is is an area which surroundings are higher than its level,
 * while a hill is an area which surroundings are lower
 * Task: determine the maximum number of castles in the given area (>=1)
 */
public class HillsAndValleys {

    public int countCastles(int[] A) {
        int i = 1;
        int count = 1;
        while (i < A.length - 1) {
            int temp = i + 1;
            while ((A[temp] == A[i]) && (temp < A.length - 1)) {
                temp++;
            }
            if (((A[i - 1] < A[i]) && (A[temp] < A[temp - 1])) ||
                    ((A[i - 1] > A[i]) && (A[temp] > A[temp - 1]))) {
                count++;
            }
            i++;
        }
        if (!((count == 1) && (A[0] == A[A.length - 1]))) {
            count++;
        }
        return count;
    }

}
