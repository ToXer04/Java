import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        String data = "2002-03-01T13:00:00Z";
        System.out.println(data);
        System.out.println(returnLong(data));
        System.out.println(returnMedium(data));
        System.out.println(returnShort(data));
    }
    public static String returnLong(String data) {
        if(data == null) {
            return null;
        }
        OffsetDateTime dataNew = OffsetDateTime.parse(data);
        return dataNew.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
    }
    public static String returnMedium(String data) {
        if(data == null) {
            return null;
        }
        OffsetDateTime dataNew = OffsetDateTime.parse(data);
        return dataNew.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
    }
    public static String returnShort(String data) {
        if(data == null) {
            return null;
        }
        OffsetDateTime dataNew = OffsetDateTime.parse(data);
        return dataNew.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
    }
}