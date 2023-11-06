import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main testing = new Main();

    @org.junit.jupiter.api.Test
    void avgCalc_Integers() {
        Double result = testing.avgCalc(10d, 20d, 40d);
        assertEquals(23, Math.floor(result));
    }
    @org.junit.jupiter.api.Test
    void avgCalc_null() {
        Double result = testing.avgCalc(10d, null, 40d);
        assertEquals(null, result);
    }
}