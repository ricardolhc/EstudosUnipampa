public class Pessoa {

    private String nome;
    private String telefone;

    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() { return this.nome; }
    public String getTelefone() { return this.telefone; }

    public void setNome(String nome) { this.nome = nome; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String toString() {
        return "Nome: " + this.nome + " - Telefone: " + this.telefone;
    }

}