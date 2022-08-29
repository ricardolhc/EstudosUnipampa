import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int pesoVacaKg, pesoVacaGrama;
	    
        System.out.print("Digite o peso da vaca em kg: ");
        pesoVacaKg = input.nextInt();
        	
        pesoVacaGrama = pesoVacaKg * 1000;
        	
        System.out.println("O peso da vaca em gramas é: " + pesoVacaGrama);
        System.out.print("Se a vaca engordar 50%, o peso dela, em gramas, será de: " + (pesoVacaGrama + ((pesoVacaGrama * 5) / 10)));

		input.close();
	}
}
