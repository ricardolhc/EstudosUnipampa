import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        VetorDeInteiros vetorDeInteiros = new VetorDeInteiros(20);

        int escolha = 0, valor, indice;

        do {

            System.out.println("1) Sair");
            System.out.println("2) Adicionar um valor no vetor");
            System.out.println("3) Setar um valor em um indice do vetor");
            System.out.println("4) Pegar um valor em um indice do vetor");
            System.out.println("5) Pegar a quantidade de posicoes ocupadas no vetor");
            System.out.println("6) Remover um valor em um indice do vetor");
            System.out.print("Opção: ");
            escolha = input.nextInt();

            switch(escolha) {

                case 1: 
                    System.out.println("Você escolheu sair do sistema");
                    break;

                case 2:
                    System.out.print("Digite o valor para ser adicionado: ");
                    if(vetorDeInteiros.add(input.nextInt())) {
                        System.out.println("Operação bem sucedida!");
                    } else {
                        System.out.println("Vetor cheio!");
                    }
                    break;

                case 3:
                    System.out.print("Digite o valor para ser adicionado: ");
                    valor = input.nextInt();

                    System.out.print("Digite o indice do vetor: ");
                    indice = input.nextInt();

                    if(vetorDeInteiros.set(valor, indice)) {
                        System.out.println("Operação bem sucedida!");
                    } else {
                        System.out.println("Indice inválido!");
                    }
                    break;


                case 4: 
                    System.out.print("Digite o indice do vetor para ser pego: ");
                    valor = vetorDeInteiros.get(input.nextInt());

                    if(valor != -1) {
                        System.out.println("Valor: " + valor);
                    } else {
                        System.out.println("Indice inválido!");
                    }
                    break;

                case 5:
                    System.out.println("Quantidade de posições ocupadas no vetor: " + vetorDeInteiros.size());
                    break;

                case 6:
                    System.out.print("Digite o indice do vetor para ser removido: ");

                    if(vetorDeInteiros.remove(input.nextInt())) {
                        System.out.println("Operação bem sucedida!");
                    } else {
                        System.out.println("Indice inválido!");
                    }
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;

            }

        } while(escolha != 1);

        input.close();
    }
}
