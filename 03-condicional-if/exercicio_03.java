import java.util.Scanner;

public class Exercicio_03 {
	public static void main(String[] args) {
		
	    Scanner input = new Scanner(System.in);

		int idade;
	    
	    System.out.print("Idade = ");
		idade = input.nextInt();
		
		System.out.print("Categoria ");
		
		if(idade >= 10 && idade <= 14) {
		    System.out.print("Infantil");
		} else if(idade >= 15 && idade <= 17) {
		    System.out.print("Juvenil");
		} else if(idade >= 18 && idade <= 25) {
		    System.out.print("Adulto");
		} else {
		    System.out.print("Inválida");
		}
		
		input.close();
	}
}
