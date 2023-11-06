import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    void getYear() {
        String result = Main.getYear("2023-03-01T13:00:00Z");
        assertEquals("2023", result);
    }
    @Test
    void getYearNull() {
        String result = Main.getYear(null);
        assertNull(result);
    }
    @Test
    void getYearWrongString() {
        String result = Main.getMonth("as");
        assertEquals("La data deve essere uguale a 2023-03-01T13:00:00Z", result);
    }
    @Test
    void getMonth() {
        String result = Main.getMonth("2023-03-01T13:00:00Z");
        assertEquals("MARCH", result);
    }
    @Test
    void getMonthNull() {
        String result = Main.getMonth(null);
        assertNull(result);
    }
    @Test
    void getMonthWrongString() {
        String result = Main.getYear("as");
        assertEquals("La data deve essere uguale a 2023-03-01T13:00:00Z", result);
    }
    @Test
    void getDay() {
        String result = Main.getDay("2023-03-01T13:00:00Z");
        assertEquals("1", result);
    }
    @Test
    void getDayNull() {
        String result = Main.getDay(null);
        assertNull(result);
    }
    @Test
    void getDayWrongString() {
        String result = Main.getDay("as");
        assertEquals("La data deve essere uguale a 2023-03-01T13:00:00Z", result);
    }
    @Test
    void getDayOfWeek() {
        String result = Main.getDayOfWeek("2023-03-01T13:00:00Z");
        assertEquals("WEDNESDAY", result);
    }
    @Test
    void getgetDayOfWeekNull() {
        String result = Main.getDayOfWeek(null);
        assertNull(result);
    }
    @Test
    void getgetDayOfWeekWrongString() {
        String result = Main.getDayOfWeek("as");
        assertEquals("La data deve essere uguale a 2023-03-01T13:00:00Z", result);
    }
}