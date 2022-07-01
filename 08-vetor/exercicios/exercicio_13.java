import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		final int qtd = 10;
		
		String [] nome = new String [qtd];
		double [] provas = new double [3];
		int [] matricula = new int [qtd];
		double [] media = new double [qtd];
		
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 0; i < qtd; i++) {
		    System.out.print("Digite seu nome: ");
		    nome[i] = entrada.nextLine();
		    
		    System.out.print("Digite sua matricula: ");
		    matricula[i] = entrada.nextInt();
		    
		    for(int j = 0; j < 3; j++) {
		        System.out.print("Digite a pontuacao da prova " + (j + 1) + ": ");
		        provas[j] = entrada.nextDouble();
		    }
		    entrada.nextLine();
		    
		    for(int j = 0; j < 3; j++) {
		        if(j == 0) {
		            media[i] = provas[j] * 2;
		        } else if(j == 1) {
		            media[i] = media[i] + provas[j] * 3;
		        } else if(j == 2) {
		            media[i] = (media[i] + provas[j] * 5) / 10;
		        }
		    }
		}
		
		for(int atual = 0; atual < 3; atual++) {
		    int posMaiorNota = 0;
		    double maiorNota = media[0];
		    
		    for(int i = 0; i < qtd; i++) {
		        if(maiorNota < media[i]) {
		            posMaiorNota = i;
		            maiorNota = media[i];
		        }
		    }
		    
		    System.out.println("Classificado: " + (atual + 1) + " Nome: " + nome[posMaiorNota] + " Matricula: " + matricula[posMaiorNota] + " Media: " + media[posMaiorNota]);
		    media[posMaiorNota] = 0;
		}
	}
}