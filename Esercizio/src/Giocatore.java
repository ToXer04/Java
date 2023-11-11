import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;

public class Giocatore {
    private String nome;
    private String cognome;
    private Boolean capitano;
    private int goal, goalNazionale;

    public Giocatore(String nome, String cognome, Boolean capitano, int goal, int goalNazionale) {
        this.nome = nome;
        this.cognome = cognome;
        this.capitano = capitano;
        this.goal = goal;
        this.goalNazionale = goalNazionale;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Boolean getCapitano() {
        return capitano;
    }

    public void setCapitano(Boolean capitano) {
        this.capitano = capitano;
    }

    public int getGoal() {
        return goal;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }

    public int getGoalNazionale() {
        return goalNazionale;
    }

    public void setGoalNazionale(int goalNazionale) {
        this.goalNazionale = goalNazionale;
    }

    @Override
    public String toString() {
        return "Giocatore{" +
                "nome='" + nome + '\'' +
                ", capitano=" + capitano +
                ", goal=" + goal +
                ", goalNazionale=" + goalNazionale +
                '}';
    }
}
