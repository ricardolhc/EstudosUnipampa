public class DVD extends Produto {

    private String autor;
    private String estilo;

    public DVD(String nome, double valor, String autor, String estilo) {
        super(nome, valor);
        this.autor = autor;
        this.estilo = estilo;
    }

    public String getAutor() { return this.autor; }
    public String getEditora() { return this.estilo; }

    public void setAutor(String autor) { this.autor = autor; }
    public void setEditora(String editora) { this.estilo = editora; }

    public String toString() {
        return super.toString() + " Autor: " + getAutor() + " Estilo: " + getEditora();
    }
    
}
