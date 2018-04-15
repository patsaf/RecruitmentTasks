/**
 * Given: array of prime numbers with the last element N
 * Task: find the biggest sum of consecutive array elements
 * which is a prime number and < N and return the length
 * of the chain of elements
 */
public class BiggestPrimeSum {

    private AlterSequence alterSequence;

    public BiggestPrimeSum() {
        alterSequence = new AlterSequence();
    }

    public int getBiggestSum(int[] array) {
        int sum = 0;
        int countTemp = 0;
        int countPos = 0;
        int count = 1;
        int N = array[array.length - 1];
        for (int i = 0; i < array.length; i++) {
            countTemp = 0;
            countPos = 0;
            for (int j = i; j < array.length; j++) {
                sum += array[j];
                if (alterSequence.isPrime(sum) && sum < N) {
                    countTemp++;
                    countPos = countTemp;
                } else if (!alterSequence.isPrime(sum) && sum < N) {
                    countTemp++;
                }
            }
            count = (countPos > count) ? countPos : count;
        }
        return count;
    }
}
