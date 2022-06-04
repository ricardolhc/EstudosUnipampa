import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    
        	System.out.print("Digite a quantidade de anos que o funcionário trabalhou: ");
        	int anos_trabalho = sc.nextInt();
        	
        	int bonus_salario = (anos_trabalho / 5) * 2;
        	
        	System.out.print("O trabalhador que trabalhou " + anos_trabalho + " ano(s), recebeu um bônus de " + bonus_salario
		+ " salários");
	}
}