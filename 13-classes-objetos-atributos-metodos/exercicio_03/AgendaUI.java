import java.util.Scanner;

public class AgendaUI {

    private Agenda agenda;
    private Scanner input;
    
    public AgendaUI(Scanner input) {
        this.agenda = new Agenda();
        this.input = input;
    }

    public void menu() {
        int opcao = 0;

        while (opcao != 6) {
            System.out.println();
            System.out.println("1 - Adicionar pessoa");
            System.out.println("2 - Remover pessoa");
            System.out.println("3 - Imprimir agenda");
            System.out.println("4 - Imprimir pessoa");
            System.out.println("5 - Editar pessoa");
            System.out.println("6 - Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    this.addPessoa();
                    break;
                case 2:
                    this.removePessoa();
                    break;
                case 3:
                    this.printAgenda();
                    break;
                case 4:
                    this.printPessoa();
                    break;
                case 5:
                    this.editPessoa();
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    public void addPessoa() {
        String nome;
        String telefone;

        System.out.print("Digite o nome da pessoa: ");
        nome = input.nextLine();
        System.out.print("Digite o telefone da pessoa: ");
        telefone = input.nextLine();

        Pessoa pessoa = new Pessoa(nome, telefone);
        this.agenda.addPessoa(pessoa);
    }

    public void removePessoa() {
        String nome;

        System.out.print("Digite o nome da pessoa: ");
        nome = input.nextLine();

        this.agenda.removePessoa(nome);
    }

    public void printAgenda() {
        this.agenda.printAgenda();
    }

    public void printPessoa() {
        String nome;

        System.out.print("Digite o nome da pessoa: ");
        nome = input.nextLine();

        this.agenda.printAgenda(nome);
    }

    public void editPessoa() {
        String nome;
        String telefone;

        System.out.print("Digite o nome da pessoa: ");
        nome = input.nextLine();
        System.out.print("Digite o telefone da pessoa: ");
        telefone = input.nextLine();

        this.agenda.editPessoa(nome, telefone);
    }
}