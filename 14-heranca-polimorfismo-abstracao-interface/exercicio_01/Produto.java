abstract class Produto {

    private String nome;
    private int codigo = 0;
    private double valor;

    private static int codigoAtual = 0;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
        this.codigo = codigoAtual++;
    }

    public String getNome() { return this.nome; }
    public int getCodigo() { return this.codigo; }
    public double getValor() { return this.valor; }

    public void setNome(String nome) { this.nome = nome; }
    public void setValor(double valor) { this.valor = valor; }

    public String toString() {
        return "Nome: " + getNome() + " Valor: " + getValor() + " Codigo: " + getCodigo();
    }

}