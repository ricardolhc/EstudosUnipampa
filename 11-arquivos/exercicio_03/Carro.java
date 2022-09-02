import java.io.Serializable;

class Carro implements Serializable {

    private Pessoa proprietario;
    private String placa;
    private int ano;
    private static final long serialVersionUID = 423968228739655670l;
    
    public Carro(Pessoa proprietario, String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
        this.proprietario = proprietario;
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }

    public String getProprietario() {
        return "Proprietário: " + proprietario.getNome() + " Data de Nascimento: " + proprietario.getDataNascimento() + " Endereço: " + proprietario.getEndereco();
    }

    public String toString() {
        return "Placa: " + getPlaca() + " Ano: " + getAno() + "\n" + getProprietario();     
    }

}

