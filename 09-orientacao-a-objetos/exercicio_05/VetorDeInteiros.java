public class VetorDeInteiros {

    private int[] vetor;
    private int indice;

    public VetorDeInteiros(int tamanhoMaximo) {
        vetor = new int[tamanhoMaximo];
        this.indice = 0;
    }

    public boolean add(int valor) {
        if(indice < vetor.length) {
            vetor[indice] = valor;
            indice++;
            return true;
        }
        return false;
    }

    
    public boolean set(int indice, int valor) {
        if(indice >= 0 && indice < vetor.length) {
            vetor[indice] = valor;
            return true;
        }
        return false;
    }

    public int get(int indice) {
        if(indice >= 0 && indice < vetor.length) {
            return vetor[indice];
        }
        return -1;
    }

    public int size() {
        return indice;
    }

    public boolean remove(int indice) {
        if(indice >= 0 && indice < vetor.length) {
            for(int i = indice; i < (vetor.length - 1); i++){
                vetor[i] = vetor[i + 1];
            }
            this.indice--;
            return true;
        }
        return false;
    } 

}