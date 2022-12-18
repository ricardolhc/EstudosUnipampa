import java.util.Scanner;

public class Exercicio_05 {
	public static void main(String[] args) {
		
	    Scanner input = new Scanner(System.in);

		char escolha;
	    
	    System.out.println("Opção   Ação");
	    System.out.println("a       Cadastrar");
	    System.out.println("b       Editar");
	    System.out.println("c       Consultar");
	    System.out.println("d       Remover");
	    System.out.println("e       Sair");
	    System.out.print("Opção: ");
	    escolha = input.next().charAt(0);
	    
	    switch(escolha) {
	        case 'a': case 'A':
	            System.out.print("Cadastrar");
	            break;
	            
	        case 'b': case 'B':
	            System.out.print("Editar");
	            break;    
	            
	        case 'c': case 'C':
	            System.out.print("Consultar");
	            break;
	            
	        case 'd': case 'D':
	            System.out.print("Remover");
	            break;
	            
	        case 'e': case 'E':
	            System.out.print("Sair");
	            break;
	           
	        default:
	            System.out.print("Opção inválida!");
	            break;
	    }
	    
		input.close();
	}
}
