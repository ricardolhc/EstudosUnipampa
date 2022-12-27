import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Produto[] produtos;

        System.out.print("Digite a quantidade de produtos: ");
        produtos = new Produto[input.nextInt()];
        input.nextLine();

        for (int i = 0; i < produtos.length; i++) {
            System.out.print("Digite o nome do produto: ");
            String nome = input.nextLine();
            
            System.out.print("Digite o valor do produto: ");
            float valor = input.nextFloat();

            System.out.print("Digite a quantidade do produto: ");
            int quantidade = input.nextInt();

            input.nextLine();
            produtos[i] = new Produto(nome, valor, quantidade);
        }

        for (int i = 0; i < produtos.length; i++) {
            System.out.println(produtos[i]);
        }

        input.close();
    }
    
}
