import java.io.Serializable;

class Produto implements Serializable {
    
    private int quantidade;
    private String nome;
    private float preco;
    private int registro;

    private static final long serialVersionUID = 1l;

    public Produto(int registro, String nome, float preco, int quantidade) {
        this.quantidade = quantidade;
        this.nome = nome;
        this.preco = preco;
        this.registro = registro;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getNome() {
        return nome;
    }

    public float getPreco() {
        return preco;
    }

    public int getRegistro() {
        return registro;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public String toString() {
        return "Número de registro: " + getRegistro() + " Nome: " + getNome() + " Preço: " + getPreco() + " Quantidade " + getQuantidade();
    }

}
