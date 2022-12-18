import java.util.Scanner;

public class Exercicio_02 {
	public static void main(String[] args) {
		
	    Scanner input = new Scanner(System.in);

		float n1, n2, n3, media;
	    
	    System.out.print("N1 = ");
		n1 = input.nextFloat();
		
		System.out.print("N2 = ");
		n2 = input.nextFloat();
		
		System.out.print("N3 = ");
		n3 = input.nextFloat();
		
		media = (n1 + n2 + n3) / 3;

		System.out.print("Media = ");
		System.out.format("%.2f", media);
		
		if(media >= 6) {
		    System.out.print(" : Aprovado");
		} else {
		    System.out.print(" : Reprovado");
		}

		input.close();
	}
}
