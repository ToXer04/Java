import java.time.DateTimeException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String data = "2023-03-01T13:00:00Z";
        try {
            System.out.println(addOneYear(data, Locale.ITALY));
        } catch (DateTimeException dte) {
            System.out.println("Wrong format string");
        }
        try {
            System.out.println(minusOneMonth(data, Locale.ITALY));
        } catch (DateTimeException dte) {
            System.out.println("Wrong format string");
        }
        try {
            System.out.println(addSevenDays(data, Locale.ITALY));
        } catch (DateTimeException dte) {
            System.out.println("Wrong format string");
        }
        try {
            System.out.println(makeAllOperations(data, Locale.ITALY));
        } catch (DateTimeException dte) {
            System.out.println("Wrong format string");
        }
    }
    public static String addOneYear(String data, Locale locale) {
        if(data == null) {
            return null;
        } else {
            OffsetDateTime dataNew = OffsetDateTime.parse(data);
            dataNew = dataNew.plusYears(1);
            return dataNew.format(DateTimeFormatter.ofPattern("cccc dd, MM/yyyy", locale));
        }
    }
    public static String minusOneMonth(String data, Locale locale) {
        if(data == null) {
            return null;
        } else {
            OffsetDateTime dataNew = OffsetDateTime.parse(data);
            dataNew = dataNew.minusMonths(1);
            return dataNew.format(DateTimeFormatter.ofPattern("cccc dd, MM/yyyy", locale));
        }
    }
    public static String addSevenDays(String data, Locale locale) {
        if(data == null) {
            return null;
        } else {
            OffsetDateTime dataNew = OffsetDateTime.parse(data);
            dataNew = dataNew.plusDays(7);
            return dataNew.format(DateTimeFormatter.ofPattern("cccc dd, MM/yyyy", locale));
        }
    }
    public static String makeAllOperations(String data, Locale locale) {
        if(data == null) {
            return null;
        } else {
            OffsetDateTime dataNew = OffsetDateTime.parse(data);
            dataNew = dataNew.plusYears(1);
            dataNew = dataNew.minusMonths(1);
            dataNew = dataNew.plusDays(7);
            return dataNew.format(DateTimeFormatter.ofPattern("cccc dd, MM/yyyy", locale));
        }
    }
}