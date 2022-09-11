import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        String nomeArquivo;
        
        System.out.print("Digite o nome do arquivo para ser lido: ");
        nomeArquivo = input.nextLine();

        Arquivo arquivo = new Arquivo(nomeArquivo);

        System.out.println("Resultado do somatório = " + somatorioArquivo(getTamanho(arquivo), getLinhas(arquivo)));

        input.close();
    }

    public static int getTamanho(Arquivo arquivo) throws Exception {
        return arquivo.getTamanho() - 1;
    }

    public static String[] getLinhas(Arquivo arquivo) throws Exception {
        return arquivo.getLinhas();
    }

    public static int somatorioArquivo(int tamanhoArquivo, String[] linhas) {
        int somatorio = 0;

        for(int i = 0; i < tamanhoArquivo; i++) {
            String[] numSeparado = linhas[i].split(" ");

            for(int j = 0; j < numSeparado.length; j++) {
                if(!numSeparado[j].equals("")) {
                    somatorio += Integer.parseInt(numSeparado[j]);
                }
            }
        }

        return somatorio;
    }
    

}