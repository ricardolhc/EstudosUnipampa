import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Arquivo arquivo = new Arquivo("exercicio_02.txt");
        arquivo.gravar(registrarDados());
    }

    public static String registrarDados() {

        int escolha;
        String conteudo = "";
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Se deseja sair, digite 0, caso contrario, digite outro numero: ");
            escolha = input.nextInt();

            input.nextLine();

            if(escolha != 0) {
                conteudo += "Nome: ";
                System.out.print("Digite o nome da pessoa: ");
                conteudo += input.nextLine();

                conteudo += " Telefone: ";
                System.out.print("Digite o telefone da pessoa: ");
                conteudo += input.nextLine();

                conteudo += "\n";
            }
        } while(escolha != 0);

        input.close();

        return conteudo;
    }

}