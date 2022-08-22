public class Televisor {
    
    private int canal = 1;
    private int volume = 0;
    private boolean ligado = false;

    public int getCanal() {
        return canal;
    }

    public int getVolume() {
        return volume;
    }

    public boolean getEstado() {
        return ligado;
    }

    public boolean aumentarVolume() {
        if(ligado && volume < 10) {
            volume++;
            return true;
        }
        System.out.println("ERRO");
        return false;
    }

    public boolean reduzirVolume() {
        if(ligado && volume > 0) {
            volume--;
            return true;
        }
        System.out.println("ERRO");
        return false;
    }

    public boolean subirCanal() {
        if(ligado && canal < 16) {
            canal++;
            return true;
        }
        System.out.println("ERRO");
        return false;
    }

    public boolean descerCanal() {
        if(ligado && canal > 0) {
            canal--;
            return true;
        }
        System.out.println("ERRO");
        return false;
    }

    public boolean ligarTelevisor() {
        if(!ligado) {
            ligado = true;
            return true;
        }
        System.out.println("ERRO");
        return false;
    }

    public boolean desligarTelevisor() {
        if(ligado) {
            ligado = false;
            canal = 1;
            volume = 0;
            return true;
        }
        System.out.println("ERRO");
        return false;
    }

    public String mostraStatus() {
        String estado = "";
        if(ligado) {
            estado = "Ligado";
        } else {
            estado = "Desligado";
        }
        return "Canal: " + getCanal() + " Volume: " + getVolume() + " Estado: " + estado;
    }

}
