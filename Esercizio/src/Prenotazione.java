import java.time.OffsetDateTime;

public class Prenotazione {
    private int id;
    private OffsetDateTime dataInizio;
    private OffsetDateTime dataFine;
    private String nomeProp;

    public Prenotazione(int id, OffsetDateTime dataInizio, OffsetDateTime dataFine, String nomeProp) {
        this.id = id;
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
        this.nomeProp = nomeProp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public OffsetDateTime getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(OffsetDateTime dataInizio) {
        this.dataInizio = dataInizio;
    }

    public OffsetDateTime getDataFine() {
        return dataFine;
    }

    public void setDataFine(OffsetDateTime dataFine) {
        this.dataFine = dataFine;
    }

    public String getnomeProp() {
        return nomeProp;
    }

    public void setnomeProp(String nomeProp) {
        this.nomeProp = nomeProp;
    }

    @Override
    public String toString() {
        return "Prenotazione{" +
                "id=" + id +
                ", dataInizio=" + dataInizio +
                ", dataFine=" + dataFine +
                ", nomeProp=" + nomeProp +
                '}';
    }
}
