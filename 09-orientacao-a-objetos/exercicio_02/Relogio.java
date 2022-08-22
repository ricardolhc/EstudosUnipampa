public class Relogio {
    
    private int segundos;
    private int minutos;
    private int horas;

    public Relogio(int segundos, int minutos, int horas) {
        this.segundos = segundos;
        this.minutos = minutos;
        this.horas = horas;
    }

    public int getSegundos() {
        return segundos;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getHoras() {
        return horas;
    }

    public void setSegundos(int segundos) {
        if(segundos <= 59) {
            this.segundos = segundos;
        } else {
            System.out.println("ERRO");
        }
    }

    public void setMinutos(int minutos) {
        if(minutos <= 59) {
            this.minutos = minutos;
        } else {
            System.out.println("ERRO");
        }
    }

    public void setHoras(int horas) {
        if(horas <= 59) {
            this.horas = horas;
        } else {
            System.out.println("ERRO");
        }
    }

    public String getHorario() {
        return getHoras() + ":" + getMinutos() + ":" + getSegundos();
    }

}
