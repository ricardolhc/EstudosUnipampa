import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
	    Scanner input = new Scanner(System.in);

		int idade;
	    
	    System.out.print("Idade = ");
		idade = input.nextInt();
		
		if(idade < 16) {
		    System.out.print("Não pode votar");
		} else if((idade >= 16 && idade < 18) || idade > 70) {
		    System.out.print("Voto facultativo");
		} else {
		    System.out.print("Voto obrigatório");
		}

		input.close();
	}
}
