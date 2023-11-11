import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-11-01T13:00:00Z");
        OffsetDateTime data2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");
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
        return data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.ITALY)).equals(OffsetDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.ITALY)))
                && data2.format(DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.ITALY)).equals(OffsetDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.ITALY)));
    }
}