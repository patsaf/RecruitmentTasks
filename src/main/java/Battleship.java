import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given: N - size of the board
 * String S - ships coordinates (beginning and ending, eg. : "1B 2C,2D 4D")
 * String T - shots fired (eg. : "2C 1B 2B 2D 3D 4A")
 * Description: check battleship manual
 * Task: determine the number of ships sunk and hit
 * Remark: exact input/output formats were specified and it took some code to manage them
 */
public class Battleship {

    public String checkScore(int N, String S, String T) {
        int sunk = 0;
        int hit = 0;
        String[] ships = S.split(",");
        List<String> shots = Arrays.asList(T.split(" "));
        for (String s : ships) {
            List<String> ship = manageShip(s);
            int count = 0;
            for (String position : ship) {
                if (shots.contains(position)) {
                    count++;
                }
            }
            if (count == ship.size()) {
                sunk++;
            } else if (count > 0) {
                hit++;
            }
        }
        return String.valueOf(sunk) + "," + String.valueOf(hit);
    }

    //returns full coordinates of a ship
    private List<String> manageShip(String s) {
        List<String> ship = new ArrayList<>(Arrays.asList(s.split(" ")));
        String first = ship.get(0);
        String last = ship.get(1);
        char firstCol = first.charAt(first.length() - 1);
        char lastCol = last.charAt(last.length() - 1);
        int firstRow = Integer.parseInt(first.substring(0, first.length() - 1));
        int lastRow = Integer.parseInt(last.substring(0, last.length() - 1));

        if (firstCol != lastCol) {
            if (firstRow != lastRow) { //ship is 2x2 square
                String toRight = String.valueOf(firstRow) + lastCol;
                String toLeft = String.valueOf(lastRow) + firstCol;
                ship.add(toRight);
                ship.add(toLeft);
            } else { // ship is 1x4
                char newCol = (char) (firstCol + 1);
                if (newCol != lastCol) {
                    String newPosition = String.valueOf(firstRow) + newCol;
                    ship.add(newPosition);
                    char nextCol = (char) (newCol + 1);
                    if (nextCol != lastCol) {
                        String nextPosition = String.valueOf(firstRow) + nextCol;
                        ship.add(nextPosition);
                    }
                }
            }
        } else { //ship is 4x1
            if (firstRow != lastRow) {
                int newRow = firstRow + 1;
                if (newRow != lastRow) {
                    String newPosition = String.valueOf(newRow) + firstCol;
                    ship.add(newPosition);
                    int nextRow = newRow + 1;
                    if (nextRow != lastRow) {
                        String nextPosition = String.valueOf(nextRow) + firstCol;
                        ship.add(nextPosition);
                    }
                }
            } else { //ship is 1x1
                ship.remove(0);
            }
        }
        return ship;
    }
}
