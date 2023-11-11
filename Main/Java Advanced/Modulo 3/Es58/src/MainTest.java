import org.junit.jupiter.api.Test;;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main testing = new Main();

    @Test
    void avgCalc_Integers() {
        Double result = testing.avgCalc(10d, 20d, 40d);
        assertEquals(23, result);
    }
    @Test
    void avgCalc_FirstNull() {
        Double result = testing.avgCalc(null, 20d, 40d);
        assertNull(result);
    }
    @Test
    void avgCalc_SecondNull() {
        Double result = testing.avgCalc(10d, null, 40d);
        assertNull(result);
    }
    @Test
    void avgCalc_ThirdNull() {
        Double result = testing.avgCalc(10d, 20d, null);
        assertNull(result);
    }
    @Test
    void avgCalc_AllNull() {
        Double result = testing.avgCalc(null, null, null);
        assertNull(result);
    }
}