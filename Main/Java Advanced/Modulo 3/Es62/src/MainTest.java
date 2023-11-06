import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void makeOperations() {
        String result = Main.makeOperations("2023-03-01T13:00:00Z");
        assertEquals("giovedì 08, 02/2024", result);
    }
    @Test
    void makeOperationsVoid() {
        String result = Main.makeOperations(null);
        assertNull(result);
    }
    @Test
    void makeOperationsWrongString() {
        String result = Main.makeOperations("as");
        assertEquals("La data deve essere uguale a 2023-03-01T13:00:00Z", result);
    }
}