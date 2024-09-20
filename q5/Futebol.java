package q5;

public class Futebol extends Esporte {
    private String tipoDeCampo;

    public Futebol(String nome, String numero, String tempo, String tipoDeCampo) {
        super(nome, numero, tempo);
        this.tipoDeCampo = tipoDeCampo;
    }

    public String getTipoDeCampo() {
        return tipoDeCampo;
    }

    public void setTipoDeCampo(String tipoDeCampo) {
        this.tipoDeCampo = tipoDeCampo;
    }
}
