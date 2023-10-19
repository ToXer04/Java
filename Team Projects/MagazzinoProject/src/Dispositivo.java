public class Dispositivo {
    private final String produttore;
    private final String modello;
    private final String descrizione;
    private final String dimensioneDisplay;
    private final String dimensioneSpazio;
    private final String prezzoAcquisto;
    private final String prezzoVendita;
    private final String id;
    private final TipoDispositivo tipo;

    public Dispositivo(String produttore, String modello, String descrizione, String dimensioneDisplay, String dimensioneSpazio, String prezzoAcquisto, String prezzoVendita, String id, TipoDispositivo tipo) {
        this.produttore = produttore;
        this.modello = modello;
        this.descrizione = descrizione;
        this.dimensioneDisplay = dimensioneDisplay;
        this.dimensioneSpazio = dimensioneSpazio;
        this.prezzoAcquisto = prezzoAcquisto;
        this.prezzoVendita = prezzoVendita;
        this.id = id;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Dispositivo {" +
                "Produttore = '" + produttore + '\'' +
                ", Modello = '" + modello + '\'' +
                ", Descrizione = '" + descrizione + '\'' +
                ", Dimensione display = '" + dimensioneDisplay + '\'' +
                ", Dimensione spazio = '" + dimensioneSpazio + '\'' +
                ", Prezzo di acquisto = '" + prezzoAcquisto + '\'' +
                ", Prezzo di vendita = '" + prezzoVendita + '\'' +
                ", ID = '" + id + '\'' +
                ", Tipo = " + tipo +
                '}';
    }

    public String getProduttore() {
        return produttore;
    }

    public String getModello() {
        return modello;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public String getDimensioneDisplay() {
        return dimensioneDisplay;
    }

    public String getDimensioneSpazio() {
        return dimensioneSpazio;
    }

    public String getPrezzoAcquisto() {
        return prezzoAcquisto;
    }

    public String getPrezzoVendita() {
        return prezzoVendita;
    }

    public String getId() {
        return id;
    }

    public TipoDispositivo getTipo() {
        return tipo;
    }
}