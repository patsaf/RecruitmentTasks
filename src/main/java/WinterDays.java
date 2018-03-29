/**
 * Given: array of integers storing average temperatures of a day
 * Description: assume there are two seasons during the year - winter and summer -
 * and the coldest day of summer is still warmer than the warmest day of winter
 * Task: determine the minimal size of winter (>=1)
 */
public class WinterDays {

    public int countDays(int[] T) {
        int count = 0;
        int temp = T[0];
        int min = T[0];
        for(int i = 1; i < T.length; i++) {
            if(T[i] <= min) {
                min = T[i];
                count = i;
            }
        }
        for(int i = count; i > 0; i--) {
            if(T[i] > temp) {
                temp = T[i];
            }
        }
        for(int i = count+1; i < T.length; i++) {
            if(T[i] < temp) {
                count = i;
            }
        }
        return count+1;
    }
}
