import java.text.SimpleDateFormat;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.now();
        OffsetDateTime data2 = OffsetDateTime.now();
        System.out.println(data);
        System.out.println(data2);
        System.out.println(data + " viene prima di " + data2 + "? " + checkFirstDateIsBeforeSecond(data, data2));
        System.out.println(data2 + " viene dopo di " + data + "? " + checkSecondDateIsAfterFirst(data, data2));
        System.out.println(data + " e " + data + " sono uguali alla data attuale? " + checkEqualsDate(data, data2));
    }
    public static boolean checkFirstDateIsBeforeSecond(OffsetDateTime data, OffsetDateTime data2) {
        return data.isBefore(data2);
    }
    public static boolean checkSecondDateIsAfterFirst(OffsetDateTime data, OffsetDateTime data2) {
        return data2.isAfter(data);
    }
    public static boolean checkEqualsDate(OffsetDateTime data, OffsetDateTime data2) {
        return data.equals(OffsetDateTime.now()) && data2.equals(OffsetDateTime.now());
    }
}