public class Livro extends Produto {

    private String autora;
    private String editora;

    public Livro(String nome, double valor, String autora, String editora) {
        super(nome, valor);
        this.autora = autora;
        this.editora = editora;
    }

    public String getAutora() { return this.autora; }
    public String getEditora() { return this.editora; }

    public void setAutora(String autora) { this.autora = autora; }
    public void setEditora(String editora) { this.editora = editora; }

    public String toString() {
        return super.toString() + " Autora: " + getAutora() + " Editora: " + getEditora(); 
    }
    
}
