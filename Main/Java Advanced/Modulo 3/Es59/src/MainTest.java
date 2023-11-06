import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main testing = new Main();
    @Test
    void returnLong() {
        String result = testing.returnLong("2002-03-01T13:00:00Z");
        assertEquals("March 1, 2002", result);
    }

    @Test
    void returnMedium() {
        String result = testing.returnMedium("2002-03-01T13:00:00Z");
        assertEquals("Mar 1, 2002", result);
    }

    @org.junit.jupiter.api.Test
    void returnShort() {
        String result = testing.returnShort("2002-03-01T13:00:00Z");
        assertEquals("3/1/02", result);
    }
    @Test
    void returnLongNull() {
        String result = testing.returnLong(null);
        assertNull(result);
    }

    @Test
    void returnMediumNull() {
        String result = testing.returnMedium(null);
        assertNull(result);
    }

    @Test
    void returnShortNull() {
        String result = testing.returnShort(null);
        assertNull(result);
    }
}