import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main testing = new Main();
    @Test
    void parseDate() {
        String result = testing.parseDate("2023-03-01T13:00:00Z");
        assertEquals("01 marzo 2023", result);
    }
    @Test
    void parseDateNull() {
        String result = testing.parseDate(null);
        assertNull(result);
    }
    @Test
    void parseDateOtherDate() {
        String result = testing.parseDate("2023-03-02T13:00:00Z");
        assertEquals("02 marzo 2023", result);
    }
    @Test
    void parseDateWrongFormatString() {
        String result = testing.parseDate("2023-03-02T13:00:0Z");
        assertEquals("Wrong format string", result);
    }
}