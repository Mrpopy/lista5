package q5;

public class Volei extends Esporte {
    private String tamanhoDaRede;

    public Volei(String nome, String numero, String tempo, String tamanhoDaRede) {
        super(nome, numero, tempo);
        this.tamanhoDaRede = tamanhoDaRede;
    }

    public String getTamanhoDaRede() {
        return tamanhoDaRede;
    }

    public void setTamanhoDaRede(String tamanhoDaRede) {
        this.tamanhoDaRede = tamanhoDaRede;
    }
}
