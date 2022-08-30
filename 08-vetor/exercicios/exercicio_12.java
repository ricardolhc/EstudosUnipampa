import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double melhorTempo;
		int voltaMelhorTempo;
		double mediaVoltas = 0;
		double tempoVolta[] = new double[3];
		
		for(int i = 0; i < tempoVolta.length; i++) {
		    System.out.print("Digite o tempo da " + (i + 1) + " volta (em segundos): ");
		    tempoVolta[i] = input.nextDouble();
		    mediaVoltas += tempoVolta[i];
		}
		
		mediaVoltas /= 3;
		voltaMelhorTempo = 1;
		melhorTempo = tempoVolta[0];
		
		for(int i = 0; i < tempoVolta.length; i++) {
		    if(melhorTempo > tempoVolta[i]) {
		        melhorTempo = tempoVolta[i];
		        voltaMelhorTempo = i + 1;
		    }
		}
		
		System.out.println("Melhor tempo: " + melhorTempo);
		System.out.println("Volta com o melhorTempo: " + voltaMelhorTempo);
		System.out.printf("Media das voltas: %.2f", mediaVoltas);

		input.close();
		
	}
}