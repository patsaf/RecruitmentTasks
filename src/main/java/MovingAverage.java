/**
 * Given: array of integers and integer k
 * Task: return an array of moving average values within the range of k
 */
public class MovingAverage {

    public int[] movingAverage(int[] array, int k) {
        int[] result = new int[array.length];
        k = Math.min(k, array.length);
        int i = 0;
        int sum = 0;
        while (i < k) {
            sum += array[i];
            result[i] = sum / (i + 1);
            i++;
        }
        while (i < array.length) {
            sum += array[i];
            sum -= array[i - k];
            result[i] = sum / k;
            i++;
        }
        return result;
    }
}
