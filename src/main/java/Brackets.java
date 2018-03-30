import java.util.ArrayList;
import java.util.List;

/**
 * Given: String made of 6 chars: '[', ']', '{', '}', '(', ')'.
 * Description: Brackets are properly balanced if an opening bracket
 * is followed directly by its closing bracket or by another opening bracket,
 * which, however, has its closing bracket before the previous bracket's
 * closing one.
 * E.g.: "[{}({})()]" is properly balanced,
 * but "{[(])}" is not
 * Task: check if brackets are properly balanced
 */
public class Brackets {

    private final char OPEN1 = '[';
    private final char OPEN2 = '{';
    private final char OPEN3 = '(';
    private final char CLOSE1 = ']';
    private final char CLOSE2 = '}';
    private final char CLOSE3 = ')';

    public boolean isCorrect(String brackets) {
        int openings = 0;
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < brackets.length(); i++) {
            if (brackets.charAt(i) == OPEN1 ||
                    brackets.charAt(i) == OPEN2 ||
                    brackets.charAt(i) == OPEN3) {
                indexes.add(openings, i);
                openings++;
            }
        }
        if (openings != brackets.length() / 2) {
            return false;
        }

        StringBuilder sb = new StringBuilder(brackets);

        for (int i = openings - 1; i >= 0; i--) {
            char bracket = sb.charAt(indexes.get(i));
            char closeBracket = sb.charAt(indexes.get(i) + 1);
            if ((bracket == OPEN1) && (closeBracket != CLOSE1)) {
                return false;
            } else if ((bracket == OPEN2) && (closeBracket != CLOSE2)) {
                return false;
            } else if ((bracket == OPEN3) && (closeBracket != CLOSE3)) {
                return false;
            } else {
                sb.delete(indexes.get(i), indexes.get(i)+2);
            }
        }
        return true;
    }
}
