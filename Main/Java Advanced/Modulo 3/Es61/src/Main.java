import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        String data = "2023-03-01T13:00:00Z";
        System.out.println(data);
        System.out.println(getYear(data));
        System.out.println(getMonth(data));
        System.out.println(getDay(data));
        System.out.println(getDayOfWeek(data));
    }
    public static String getYear(String data) {
        if(data == null) {
            return null;
        } else if(!data.equals("2023-03-01T13:00:00Z")){
            return "La data deve essere uguale a 2023-03-01T13:00:00Z";
        } else {
            OffsetDateTime dataNew = OffsetDateTime.parse(data);
            return String.valueOf(dataNew.getYear());
        }
    }
    public static String getMonth(String data) {
        if(data == null) {
            return null;
        } else if(!data.equals("2023-03-01T13:00:00Z")){
            return "La data deve essere uguale a 2023-03-01T13:00:00Z";
        } else {
            OffsetDateTime dataNew = OffsetDateTime.parse(data);
            return String.valueOf(dataNew.getMonth());
        }
    }
    public static String getDay(String data) {
        if(data == null) {
            return null;
        } else if(!data.equals("2023-03-01T13:00:00Z")){
            return "La data deve essere uguale a 2023-03-01T13:00:00Z";
        } else {
            OffsetDateTime dataNew = OffsetDateTime.parse(data);
            return String.valueOf(dataNew.getDayOfMonth());
        }
    }
    public static String getDayOfWeek(String data) {
        if(data == null) {
            return null;
        } else if(!data.equals("2023-03-01T13:00:00Z")){
            return "La data deve essere uguale a 2023-03-01T13:00:00Z";
        } else {
            OffsetDateTime dataNew = OffsetDateTime.parse(data);
            return String.valueOf(dataNew.getDayOfWeek());
        }
    }
}