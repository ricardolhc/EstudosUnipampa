import java.util.Scanner;

public class Exercicio_14 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String gabarito[] = new String[5];
		
		String nome[] = new String[10];
		String inscricao[] = new String[10];
        int pontuacao[] = new int[10];
        
        for(int i = 0; i < gabarito.length; i++) {
            System.out.print("Digite o gabarito da questão " + (i + 1) + ": ");
            gabarito[i] = input.nextLine();
        }
        
        for(int i = 0; i < nome.length; i++) {
            System.out.print("Digite o nome do candidato " + (i + 1) + ": ");
            nome[i] = input.nextLine();
            
            System.out.print("Digite o numero de inscricao do candidato " + (i + 1) + ": ");
            inscricao[i] = input.nextLine();
            
            String respotas[] = new String[5];
            for(int j = 0; j < 5; j++) {
               System.out.print("Digite a resposta do candidato " + (i + 1) + " da questao " + (j + 1) + ": ");
               respotas[j] = input.nextLine();
            }
            
            pontuacao[i] = 0;
            for(int j = 0; j < gabarito.length; j++) {
                if(gabarito[j].equals(respotas[j])) {
                    pontuacao[i] += 2;
                }
            }
        }
        
        for(int i = 0; i < nome.length; i++) {
            System.out.println("Nome: " + nome[i] + " Num. Inscricao: " + inscricao[i] + " Nota: " + pontuacao[i]);
        }

        input.close();
	}
}
