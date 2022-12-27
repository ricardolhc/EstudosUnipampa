public class Agenda {
    
    private Pessoa[] pessoas;

    public Agenda() {
        this.pessoas = new Pessoa[20];
    }

    public void addPessoa(Pessoa pessoa) {
        for (int i = 0; i < this.pessoas.length; i++) {
            if (this.pessoas[i] == null) {
                this.pessoas[i] = pessoa;
                break;
            }
            if(i == this.pessoas.length - 1) {
                System.out.println("Agenda cheia!");
            }
        }
    }

    public void removePessoa(String nome) {
        for (int i = 0; i < this.pessoas.length; i++) {
            if (this.pessoas[i] != null && this.pessoas[i].getNome().equals(nome)) {
                this.pessoas[i] = null;
                break;
            }
        }
    }

    public void printAgenda(String nome) {
        for (int i = 0; i < this.pessoas.length; i++) {
            if (this.pessoas[i] != null && this.pessoas[i].getNome().equals(nome)) {
                System.out.println(this.pessoas[i]);
                break;
            }
        }
    }

    public void printAgenda() {
        for (int i = 0; i < this.pessoas.length; i++) {
            if (this.pessoas[i] != null) {
                System.out.println(this.pessoas[i]);
            }
        }
    }

    public void editPessoa(String nome, String telefone) {
        for (int i = 0; i < this.pessoas.length; i++) {
            if (this.pessoas[i] != null && this.pessoas[i].getNome().equals(nome)) {
                this.pessoas[i].setTelefone(telefone);
                break;
            }
        }
    }


}
