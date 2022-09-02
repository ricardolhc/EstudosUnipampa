import java.util.Date;
import java.io.Serializable;

class Pessoa implements Serializable {
    
    private String nome;
    private Date dataNascimento;
    private String endereco;

    public Pessoa(String nome, String endereco, Date dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

}

