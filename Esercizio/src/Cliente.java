public class Cliente {
    private String nome;
    private String targa;
    private String numTelefono;
    private TipoVeicolo tipoVeicolo;

    public Cliente(String nome, String targa, String numTelefono, TipoVeicolo tipoVeicolo) {
        this.nome = nome;
        this.targa = targa;
        this.numTelefono = numTelefono;
        this.tipoVeicolo = tipoVeicolo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public TipoVeicolo getTipoVeicolo() {
        return tipoVeicolo;
    }

    public void setTipoVeicolo(TipoVeicolo tipoVeicolo) {
        this.tipoVeicolo = tipoVeicolo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", targa='" + targa + '\'' +
                ", numTelefono='" + numTelefono + '\'' +
                ", tipoVeicolo=" + tipoVeicolo +
                '}';
    }
}
