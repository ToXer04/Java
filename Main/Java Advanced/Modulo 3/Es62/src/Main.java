import java.time.DateTimeException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String data = "2023-03-01T13:00:00Z";
        System.out.println(addOneYear(data, Locale.ITALY));
        System.out.println(minusOneMonth(data, Locale.ITALY));
        System.out.println(addSevenDays(data, Locale.ITALY));
        System.out.println(makeAllOperations(data, Locale.ITALY));
    }
    public static String addOneYear(String data, Locale locale) {
        if(data == null) {
            return null;
        } else {
            try {
                OffsetDateTime dataNew = OffsetDateTime.parse(data);
                dataNew = dataNew.plusYears(1);
                return dataNew.format(DateTimeFormatter.ofPattern("cccc dd, MM/yyyy", locale));
            } catch (DateTimeException dte) {
                return "Wrong format string";
            }
        }
    }
    public static String minusOneMonth(String data, Locale locale) {
        if(data == null) {
            return null;
        } else {
            try {
                OffsetDateTime dataNew = OffsetDateTime.parse(data);
                dataNew = dataNew.minusMonths(1);
                return dataNew.format(DateTimeFormatter.ofPattern("cccc dd, MM/yyyy", locale));
            } catch (DateTimeException dte) {
                return "Wrong format string";
            }
        }
    }
    public static String addSevenDays(String data, Locale locale) {
        if(data == null) {
            return null;
        } else {
            try {
                OffsetDateTime dataNew = OffsetDateTime.parse(data);
                dataNew = dataNew.plusDays(7);
                return dataNew.format(DateTimeFormatter.ofPattern("cccc dd, MM/yyyy", locale));
            } catch (DateTimeException dte) {
                return "Wrong format string";
            }
        }
    }
    public static String makeAllOperations(String data, Locale locale) {
        if(data == null) {
            return null;
        } else {
            try {
                OffsetDateTime dataNew = OffsetDateTime.parse(data);
                dataNew = dataNew.plusYears(1);
                dataNew = dataNew.minusMonths(1);
                dataNew = dataNew.plusDays(7);
                return dataNew.format(DateTimeFormatter.ofPattern("cccc dd, MM/yyyy", locale));
            } catch (DateTimeException dte) {
                return "Wrong format string";
            }
        }
    }
}