import java.util.ArrayList;
import java.util.Locale;

public class GiocatoriUtils {
    public static int calcolaGoalTotali(String nome, String cognome, ArrayList<Giocatore> database) {
        try {
            Giocatore g = cercaConNomeECognome(nome, cognome, database);
            if (g != null) {
                return g.getGoal() + g.getGoalNazionale();
            } else {
                return 0;
            }
        } catch(NullPointerException npe) {
            throw npe;
        }
    }

    public static ArrayList<Giocatore> cercaConNome(String nome, ArrayList<Giocatore> database) {
        ArrayList<Giocatore> giocatori = new ArrayList<>();

        for (Giocatore g : database) {
            if (g.getNome().toLowerCase(Locale.ITALIAN).equals(nome.toLowerCase(Locale.ITALIAN))) {
                giocatori.add(g);
            }
        }

        return giocatori;
    }

    public static Giocatore cercaConNomeECognome(String nome, String cognome, ArrayList<Giocatore> database) {
        if (database != null) {
            for (Giocatore g : database) {
                if (g.getNome().toLowerCase(Locale.ROOT).equals(nome.toLowerCase(Locale.ROOT)) &&
                        g.getCognome().toLowerCase(Locale.ROOT).equals(cognome.toLowerCase(Locale.ROOT))
                ) {
                    return g;
                }
            }
        } else {
            throw new NullPointerException("Database not found");
        }
        return null;
    }
}
