import java.util.Scanner;

public class Exercicio_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int anosTrabalho, bonusSalario;
	    
        System.out.print("Digite a quantidade de anos que o funcionário trabalhou: ");
        anosTrabalho = input.nextInt();
        	
        bonusSalario = (anosTrabalho / 5) * 2;
        	
        System.out.print("O trabalhador que trabalhou " + anosTrabalho + " ano(s), recebeu um bônus de " + bonusSalario
		+ " salários");

		input.close();
	}
}