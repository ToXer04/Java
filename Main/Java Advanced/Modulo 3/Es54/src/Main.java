import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String data = "2023-03-01T13:00:00Z";
        System.out.println(data);
        System.out.println(makeFirstOfMarch2023(data));
    }
    public static String makeFirstOfMarch2023(String data) {
        if(data == null) {
            return null;
        } else if(!data.equals("2023-03-01T13:00:00Z")){
            return "La data deve essere uguale a 2023-03-01T13:00:00Z";
        } else {
            OffsetDateTime dataNew = OffsetDateTime.parse(data);
            return dataNew.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
        }
    }
}