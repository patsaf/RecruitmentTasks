import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given: two list of integers
 * Task: return a new sequence of integers made only of those numbers from
 * the first sentence which appear p times in the second sentence,
 * where p is a non-prime number
 */
public class AlterSequence {

    public List<Integer> getNewSequence(List<Integer> firstSequence, List<Integer> secondSequence) {
        List<Integer> newSequence = new ArrayList<>();
        for (Integer i : firstSequence) {
            int quantity = Collections.frequency(secondSequence, i);
            if (!isPrime(quantity)) {
                newSequence.add(i);
            }
        }
        return newSequence;
    }

    public boolean isPrime(int number) {
        if (number < 2) {
            return false;
        } else if (number == 2) {
            return true;
        } else {
            for (int i = 2; i < number; i++) {
                if ((number % i) == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
