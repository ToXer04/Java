import java.time.OffsetDateTime;
import java.util.ArrayList;

public class Proprietà {
    private int numStanze;
    private String nome;
    private String indirizzo;
    private ArrayList<Prenotazione> prenotazioni;

    public Proprietà(int numStanze, String nome, String indirizzo, ArrayList<Prenotazione> prenotazioni) {
        this.numStanze = numStanze;
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.prenotazioni = prenotazioni;
    }

    public int getNumStanze() {
        return numStanze;
    }

    public void setNumStanze(int numStanze) {
        this.numStanze = numStanze;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public ArrayList<Prenotazione> getPrenotazioni() {
        return prenotazioni;
    }

    public void setPrenotazioni(ArrayList<Prenotazione> prenotazioni) {
        this.prenotazioni = prenotazioni;
    }

    @Override
    public String toString() {
        return "Proprietà{" +
                "numStanze=" + numStanze +
                ", nome='" + nome + '\'' +
                ", indirizzo='" + indirizzo + '\'' +
                ", prenotazioni=" + prenotazioni +
                '}';
    }
    public boolean checkDisponibilità() {
        return this.numStanze > 0;
    }
    public Prenotazione creaPrenotazione(Proprietà prop, Utente u, int giorni, int id) throws Exception {
        if(prop.checkDisponibilità()) {
            this.numStanze --;
            Prenotazione prenotazione = new Prenotazione(id, OffsetDateTime.now(), OffsetDateTime.now().plusDays(giorni), prop.getNome());
            System.out.println(prenotazione);
            prenotazioni.add(prenotazione);
            return prenotazione;
        } else {
            throw new Exception("Non ci sono stanze disponibili");
        }
    }
}
