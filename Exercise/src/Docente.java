public class Docente {
    private String nome;
    private String cognome;
    private int codice;
    private int età;

    public Docente(String nome, String cognome, int codice, int età) {
        this.nome = nome;
        this.cognome = cognome;
        this.codice = codice;
        this.età = età;
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

    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public int getEtà() {
        return età;
    }

    public void setEtà(int età) {
        this.età = età;
    }
}
