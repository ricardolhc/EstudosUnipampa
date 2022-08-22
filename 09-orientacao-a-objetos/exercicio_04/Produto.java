public class Produto {
    
    private String nome;
    private int quantidade;
    private float preco;

    public Produto(String nome) {
        this.nome = nome;
        this.quantidade = 0;
        this.preco = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public float getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String mostraProduto() {
        return "Nome: " + getNome() + " Quantidade: " + getQuantidade() + " Preço: " + getPreco();
    }

}
