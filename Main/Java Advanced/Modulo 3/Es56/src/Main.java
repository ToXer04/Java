import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println(data);
        data = data.plusYears(1);
        data = data.minusMonths(1);
        data = data.plusDays(7);
        System.out.println(data.format(DateTimeFormatter.ofPattern("cccc dd, MM/yyyy", Locale.ITALY)));
    }
}