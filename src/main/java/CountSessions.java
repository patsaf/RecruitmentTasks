import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

/**
 * Given: array of Strings with exact dates and times of user activity
 * Description: a user should be ask to fill a survey if:
 * a) they logged in every day for the past three days
 * b) they've had at lest 6 unique session altogether
 * where opening the page after a break of more that 30 minutes counts as a session
 * Task: determine if given user should or should not be asked for opinion
 */
public class CountSessions {

    public boolean shouldBeAsked(String[] timestamps) {
        List<LocalDateTime> timestampsList = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        for (String s : timestamps) {
            timestampsList.add(LocalDateTime.parse(s, formatter));
        }

        //checking if the user entered at least 6 times
        if (timestampsList.size() < 6) {
            return false;
        }

        //checking if the user entered each day for the past 3 days
        int lastDay = timestampsList
                .get(timestampsList.size() - 1)
                .getDayOfYear();
        if (timestampsList
                .stream()
                .noneMatch(date -> date.getDayOfYear() == (lastDay - 1)) ||
                timestampsList
                        .stream()
                        .noneMatch(date -> date.getDayOfYear() == (lastDay - 2))) {
            return false;
        }

        //checking the number of sessions
        int sessions = 1;
        for (int i = 0; i < (timestampsList.size() - 1); i++) {
            if (timestampsList
                    .get(i)
                    .until(timestampsList.get(i + 1), ChronoUnit.MINUTES) >= 30) {
                sessions++;
            }
        }
        return (sessions >= 6) ? true : false;
    }
}
