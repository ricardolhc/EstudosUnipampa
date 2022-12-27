public class Tecnico extends Pessoa implements Aposentadoria {

    private int siape;

    public Tecnico(String nome, int siape) {
        super(nome);
        this.siape = siape;
    }

    public int getSiape() { return siape; }

    public void setSiape(int siape) { this.siape = siape; }

    @Override
    public int calculaTempoMinimo() {
        return 30;
    }

}
