public class Frutto {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Frutto(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Frutto{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
