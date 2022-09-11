import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException, Exception {
        menuPrincipal();
    }
    
    public static void menuPrincipal() throws IOException, Exception {
        int escolha = 0;
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        Scanner input = new Scanner(System.in);
        do {

            System.out.println("Menu");
            System.out.println("0 - Salvar");
            System.out.println("1 - Cadastrar novo estoque");
            System.out.println("2 - Visualizar estoque");
            System.out.print("Opção: ");
            escolha = input.nextInt();
            System.out.println();

            input.nextLine();

            switch(escolha) {
                case 0:
                    System.out.print("Você escolheu salvar!");
                    gravarBinario(produtos);
                    break;
                
                case 1:
                    produtos.add(registrarProduto(input));
                    break;

                case 2:
                    visualizarEstoque();
                    break;


                default:
                    System.out.print("Opção inválida!");
                    break;
            }

        } while(escolha != 0);

        input.close();
    }

    public static Produto registrarProduto(Scanner input) {
        String nome = "";
        float preco = 0;
        int quantidade = 0;
        int registro = 0;

        System.out.print("Digite o registro do produto: ");
        registro = input.nextInt();

        input.nextLine();

        System.out.print("Digite o nome do produto: ");
        nome = input.nextLine();

        System.out.print("Digite a quantidade do produto: ");
        quantidade = input.nextInt();

        System.out.print("Digite o preco do produto: ");
        preco = input.nextFloat();
        
        System.out.println();

        return new Produto(registro, nome, preco, quantidade);
    }

    public static void visualizarEstoque() throws IOException, Exception {
        ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream("estoque.bytej"));
        
        System.out.println("Estoque: ");

        ArrayList<Produto> produtosLer = (ArrayList<Produto>) objectInput.readObject();

        for(int i = 0; i < produtosLer.size(); i++) {
            System.out.println(produtosLer.get(i));
        }
            
        objectInput.close();
    }

    public static void gravarBinario(ArrayList<Produto> objeto) throws IOException {
        ObjectOutputStream objectOutput = new ObjectOutputStream(new FileOutputStream("estoque.bytej"));
        objectOutput.writeObject(objeto);
        objectOutput.close();
    }
}