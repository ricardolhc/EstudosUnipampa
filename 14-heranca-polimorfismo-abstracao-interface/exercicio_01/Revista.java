public class Revista extends Produto {

    private String editora;

    public Revista(String nome, double valor, String editora) {
        super(nome, valor);
        this.editora = editora;
    }

    public String getEditora() { return this.editora; }
    public void setEditora(String editora) { this.editora = editora; }
 
    public String toString() {
        return super.toString() + " Editora: " + editora;
    }

}
