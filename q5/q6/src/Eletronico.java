public abstract class Eletronico {
    private String marca;
    private String modelo;
    private String preco;
    private String descricao;

    public Eletronico(String marca, String modelo, String preco, String descricao) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Eletronico{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", preco='" + preco + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
