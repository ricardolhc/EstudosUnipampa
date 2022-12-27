public class Professor extends Pessoa implements Aposentadoria {

    private int siape;
    private String curso;

    public Professor(String nome, int siape, String curso) {
        super(nome);
        this.siape = siape;
        this.curso = curso;
    }

    public int getSiape() { return siape; }
    public String getCurso() { return curso; }

    public void setSiape(int siape) { this.siape = siape; }
    public void setCurso(String curso) { this.curso = curso; }

    @Override
    public int calculaTempoMinimo() {
        return 20;
    }
    
}
