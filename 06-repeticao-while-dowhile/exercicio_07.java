import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		char escolha;
		int qtd_gremista = 0;
		int qtd_colorado = 0;
		int qtd_torcedor = 0;
		
		System.out.println("Pesquisa das torcidas: ");
		
		do {
		    
		    System.out.println("\ng - Gremio");
		    System.out.println("i - Inter");
		    System.out.println("o - Outro");
		    System.out.println("f - Fim");
		    System.out.print("Opção: ");
		    escolha = entrada.next().charAt(0);
		    
		    switch(escolha) {
		        
		            case 'g': case 'G':
		                    qtd_torcedor++;
		                    qtd_gremista++;
		                    break;
		            
		            case 'i': case 'I':
		                    qtd_torcedor++;
		                    qtd_colorado++;
		                    break;
		           
		            case 'o': case 'O':
		                    qtd_torcedor++;
		                    break;
		           
		            case 'f': case 'F':
		                    System.out.println("");
		                    break;
		           
		            default:
		                    System.out.println("Opção inválida!");
		                    break;
		    }
		    
		} while (escolha != 'f' && escolha != 'F');
		
		System.out.println("Resultado: ");
		System.out.println("Número total de torcedores: " + qtd_torcedor);
		System.out.println("Torcedores gremistas: " + qtd_gremista);
		System.out.println("Torcedores colorados: " + qtd_colorado);
	}
}
