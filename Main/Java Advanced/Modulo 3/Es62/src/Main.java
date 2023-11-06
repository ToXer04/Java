import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String data = "2023-03-01T13:00:00Z";
        System.out.println(makeOperations(data));
    }
    public static String makeOperations(String data) {
        if(data == null) {
            return null;
        } else if(!data.equals("2023-03-01T13:00:00Z")) {
            return "La data deve essere uguale a 2023-03-01T13:00:00Z";
        } else {
            OffsetDateTime dataNew = OffsetDateTime.parse(data);
            dataNew = dataNew.plusYears(1);
            dataNew = dataNew.minusMonths(1);
            dataNew = dataNew.plusDays(7);
            return dataNew.format(DateTimeFormatter.ofPattern("cccc dd, MM/yyyy", Locale.ITALY));
        }
    }
}