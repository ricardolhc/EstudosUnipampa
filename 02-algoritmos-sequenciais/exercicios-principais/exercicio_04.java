import java.util.Scanner;

public class Exercicio_04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int segundos, minutos, horas;
	    
        System.out.print("Digite os segundos: ");
        segundos = input.nextInt();
        
        horas = segundos / 3600;
		segundos %= 3600;
		minutos = segundos / 60;
		segundos %= 60;
		
        System.out.print(horas + "h:" + minutos + "m:" + segundos + "s");

		input.close();
	}
}
