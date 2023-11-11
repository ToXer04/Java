import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class GiocatoriUtilsTest {
    ArrayList<Giocatore> giocatori = new ArrayList<>();

    @Before
    public void init() {
        Giocatore g = new Giocatore("Cristiano", "Ronaldo" ,false, 200, 50);
        Giocatore g1 = new Giocatore("Leo", "Messi" , false, 250, 30);
        Giocatore g2 = new Giocatore("Diego Armando", "Maradona" , true, 150, 40);
        Giocatore g3 = new Giocatore("Ciccio", "Caputo" , false, 15, 1);
        giocatori.add(g);
        giocatori.add(g1);
        giocatori.add(g2);
        giocatori.add(g3);
    }

    @Test
    public void calcolaGoalTotali() {
        int goalTotali = GiocatoriUtils.calcolaGoalTotali("Ciccio", "Caputo", giocatori);
        assertEquals(16, goalTotali);
    }
    @Test
    public void calcolaGoalTotaliNullThrowException() {
        Exception e = assertThrows(NullPointerException.class, () -> GiocatoriUtils.calcolaGoalTotali("Ciccio", "Caputo", null));
        assertEquals(NullPointerException.class, e.getClass());
        assertEquals("Database not found", e.getMessage());
    }
}
