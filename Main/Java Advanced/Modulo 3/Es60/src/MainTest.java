import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main testing = new Main();
    @Test
    void makeFirstOfMarch2023() {
        String result = testing.makeFirstOfMarch2023("2023-03-01T13:00:00Z");
        assertEquals("01 marzo 2023", result);
    }
    @Test
    void makeFirstOfMarch2023Null() {
        String result = testing.makeFirstOfMarch2023(null);
        assertNull(result);
    }
    @Test
    void makeFirstOfMarch2023WrongString() {
        String result = testing.makeFirstOfMarch2023("as");
        assertEquals("La data deve essere uguale a 2023-03-01T13:00:00Z", result);
    }
}