import java.time.DateTimeException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String data = "2023-03-01T13:00:00Z";
        System.out.println(data);
        System.out.println(parseDate(data));
    }
    public static String parseDate(String data) {
        if(data == null) {
            return null;
        } else {
            try {
                OffsetDateTime dataNew = OffsetDateTime.parse(data);
                return dataNew.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
            } catch(DateTimeException dte) {
                return "Wrong format string";
            }
        }
    }
}