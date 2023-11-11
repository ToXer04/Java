import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void addOneYear() {
        String result = Main.addOneYear("2023-03-01T13:00:00Z", Locale.ITALY);
        assertEquals("venerdì 01, 03/2024", result);
    }

    @Test
    void addOneYearEnglish() {
        String result = Main.addOneYear("2023-03-01T13:00:00Z", Locale.US);
        assertEquals("Friday 01, 03/2024", result);
    }

    @Test
    void addOneYearNull() {
        String result = Main.addOneYear(null, Locale.ITALY);
        assertNull(result);
    }

    @Test
    void addOneYearWrongFormatString() {
        String result = Main.addOneYear("2023-03-01T13:0000Z", Locale.ITALY);
        assertEquals("Wrong format string", result);
    }

    @Test
    void minusOneMonth() {
        String result = Main.minusOneMonth("2023-03-01T13:00:00Z", Locale.ITALY);
        assertEquals("mercoledì 01, 02/2023", result);
    }

    @Test
    void minusOneMonthEnglish() {
        String result = Main.minusOneMonth("2023-03-01T13:00:00Z", Locale.US);
        assertEquals("Wednesday 01, 02/2023", result);
    }

    @Test
    void minusOneMonthNull() {
        String result = Main.minusOneMonth(null, Locale.ITALY);
        assertNull(result);
    }

    @Test
    void minusOneMonthFormatString() {
        String result = Main.minusOneMonth("2023-03-01T13:0000Z", Locale.ITALY);
        assertEquals("Wrong format string", result);
    }

    @Test
    void addSevenDays() {
        String result = Main.addSevenDays("2023-03-01T13:00:00Z", Locale.ITALY);
        assertEquals("mercoledì 08, 03/2023", result);
    }

    @Test
    void addSevenDaysEnglish() {
        String result = Main.addSevenDays("2023-03-01T13:00:00Z", Locale.US);
        assertEquals("Wednesday 08, 03/2023", result);
    }

    @Test
    void addSevenDaysNull() {
        String result = Main.addSevenDays(null, Locale.ITALY);
        assertNull(result);
    }

    @Test
    void addSevenDaysFormatString() {
        String result = Main.addSevenDays("2023-03-01T13:0000Z", Locale.ITALY);
        assertEquals("Wrong format string", result);
    }

    @Test
    void makeAllOperations() {
        String result = Main.makeAllOperations("2023-03-01T13:00:00Z", Locale.ITALY);
        assertEquals("giovedì 08, 02/2024", result);
    }

    @Test
    void makeAllOperationsEnglish() {
        String result = Main.makeAllOperations("2023-03-01T13:00:00Z", Locale.US);
        assertEquals("Thursday 08, 02/2024", result);
    }

    @Test
    void makeAllOperationsNull() {
        String result = Main.makeAllOperations(null, Locale.ITALY);
        assertNull(result);
    }

    @Test
    void  makeAllOperationsFormatString() {
        String result = Main.makeAllOperations("2023-03-01T13:0000Z", Locale.ITALY);
        assertEquals("Wrong format string", result);
    }
}