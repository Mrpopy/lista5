package q5;

public abstract class Esporte {
    private String nome;
    private String numero;
    private String tempo;

    public Esporte(String nome, String numero, String tempo) {
        this.nome = nome;
        this.numero = numero;
        this.tempo = tempo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    @Override
    public String toString() {
        return "Esporte{" +
                "nome='" + nome + '\'' +
                ", numero='" + numero + '\'' +
                ", tempo='" + tempo + '\'' +
                '}';
    }
}
