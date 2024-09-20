package q5;

public class Basquete extends Esporte {
    public String alturaDoJogador;

    public Basquete(String nome, String numero, String tempo, String alturaDoJogador) {
        super(nome, numero, tempo);
        this.alturaDoJogador = alturaDoJogador;
    }

    public String getAlturaDoJogador() {
        return alturaDoJogador;
    }

    public void setAlturaDoJogador(String alturaDoJogador) {
        this.alturaDoJogador = alturaDoJogador;
    }
}
