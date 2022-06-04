import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
	    Scanner entrada = new Scanner(System.in);
	    
	    System.out.print("Idade = ");
		int idade = entrada.nextInt();
		
		if(idade < 16) {
		    System.out.print("Não pode votar");
		} else if((idade >= 16 && idade < 18) || idade > 70) {
		    System.out.print("Voto facultativo");
		} else {
		    System.out.print("Voto obrigatório");
		}
		
	}
}
