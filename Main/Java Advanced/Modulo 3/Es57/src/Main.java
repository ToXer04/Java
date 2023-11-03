import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-11-01T13:00:00Z");
        OffsetDateTime data2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");
        System.out.println(data);
        System.out.println(data2);
        System.out.println(data + " viene prima di " + data2 + "? " + data.isBefore(data2));
        System.out.println(data2 + " viene dopo di " + data + "? " + data2.isAfter(data));
        if(data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.ITALY)).equals(OffsetDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.ITALY)))
                && data2.format(DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.ITALY)).equals(OffsetDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.ITALY)))) {
            System.out.println(data + " e " + data2 + " sono uguali ad ora");
        } else {
            System.out.println(data + " e " + data2 + " non sono uguali ad ora");
        }
    }
}