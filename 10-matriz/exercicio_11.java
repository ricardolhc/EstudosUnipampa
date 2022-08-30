import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
		
		int matriz[][] = new int[5][10];
		             
		for(int i = 0; i < matriz.length; i++){
		    System.out.println("Delegação " + (i + 1));
		    for(int j = 0; j < matriz[0].length; j++) {
		        System.out.print("Digite o valor da altura do atleta: ");
		        matriz[i][j] = input.nextInt();
		    }
		}
		
		for(int i = 0; i < matriz.length; i++) {
		    int maiorAltura = matriz[i][0];
		    for(int j = 0; j < matriz[0].length; j++) {
		        if(maiorAltura < matriz[i][j]) {
		            maiorAltura = matriz[i][j];
		        }
		    }
		    System.out.println("Maior atleta da delegação " + (i + 1) + ": " + maiorAltura);
		}

		input.close();
	}
}