import java.util.ArrayList;
import java.util.List;

/**
 * Given: positive integer <= 100 000
 * Description: complement of a binary number is the result of changing
 * all its '1's to '0's and all its '0's to '1's
 * Task: find the binary completion of the given number and change
 * it back to decimal format
 */
public class ComplementNumber {

    public int complementNumber(int number) {
        List<Integer> binary = toBinary(number);
        int bits = binary.lastIndexOf(1);
        List<Integer> complemented = complement(binary, bits);
        int result = 0;
        for (int i = 0; i < complemented.size(); i++) {
            result += complemented.get(i) * Math.pow(2, i);
        }
        return result;
    }

    private List<Integer> toBinary(int number) {
        List<Integer> binary = new ArrayList<>();
        for (int i = 0; i < 17; i++) {
            binary.add(i, (number % 2 == 1) ? 1 : 0);
            number /= 2;
        }
        return binary;
    }

    private List<Integer> complement(List<Integer> binary, int bits) {
        List<Integer> complemented = new ArrayList<>();
        for (int i = 0; i <= bits; i++) {
            complemented.add(i, (binary.get(i) == 0) ? 1 : 0);
        }
        return complemented;
    }
}
