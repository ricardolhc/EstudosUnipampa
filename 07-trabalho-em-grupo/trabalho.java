import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String escolha; // VARIÁVEL RESPONSÁVEL POR ARMAZENAR A ESCOLHA DO USUÁRIO
	    
		boolean repetir = true; // VARIÁVEL RESPONSÁVEL POR SAIR DO PROGRAMA CASO NECESSÁRIO
		
		int questoes_Corretas; // CONTADOR DE RESPOSTAS CORRETAS
		int questoes_Erradas; // CONTADOR DE RESPOSTAS ERRADAS
		
		boolean sair; // VARIÁVEL RESPONSÁVEL POR SAIR NO MEIO DA QUESTAO CASO NECESSARIO
		
		do {
		    // MENU PRINCIPAL DO QUIZ
		    System.out.println("QUIZ Cultural");
		    System.out.println("");
		    System.out.println("a) Filmes e Séries");
		    System.out.println("b) Música");
		    System.out.println("c) Sobre Alegrete-RS");
		    System.out.println("d) Java");
		    System.out.println("e) Jogos Digitais");
		    System.out.println("f) Sair");
		    System.out.println("");
		    System.out.print("Escolha o tema para responder às questões: ");
		    escolha = entrada.nextLine(); //LER RESPOSTA DO USUÁRIO
		    
		    questoes_Corretas = 0; // VALOR PADRÃO PARA AS RESPOSTAS CERTAS
		    questoes_Erradas = 0; // VALOR PADRÃO PARA AS RESPOSTAS ERRADAS
		    
		    sair = false;  
		    
		    switch(escolha) {
		        
		        case "a": case "A": // FILMES E SÉRIES
		            
		            /* ============ QUESTÃO 1   TEMA 1 ============== */
		            do {
		                
		                if(!sair) {
		                    System.out.println("");
    		                System.out.println("1. Qual o filme mais assistido da história do cinema?");
    		                System.out.println("a) Avatar"); // QUESTÃO CERTA
    		                System.out.println("b) Avengers: Ultimato");
    		                System.out.println("c) Avengers: Endgame");
    		                System.out.println("d) E o vento levou");
    		                System.out.println("e) Ir para o menu principal");
    		                System.out.println("");
    		                
    		                System.out.print("Qual é sua resposta? ");
    		                escolha = entrada.nextLine(); // LER RESPOSTA DO USUÁRIO
    		                
    		                escolha = escolha.toLowerCase();  // TRANSFORMAR A RESPOSTA DO USUÁRIO PARA MINUSCULAS
    		                
    		                if(escolha.equals("a")) { //QUESTÃO CERTA É A ALTERNATIVA A
    		                    System.out.println("Parabéns, você acertou!\n");
    		                    questoes_Corretas++;
    		                } else if(escolha.equals("b") || escolha.equals("c") || escolha.equals("d")) {
    		                    System.out.println("Resposta errada! O filme mais assistido da história é Avatar.\n");
    		                    questoes_Erradas++;
    		                } else if(escolha.equals("e")){
    		                    sair = true; // USUÁRIO QUER SAIR NO MEIO DA QUESTÃO
    		                } else {
    		                    System.out.println("Opção inválida. Informe a letra a, b, c ou d.");
    		                }
		                }
		                
		            } while(!escolha.equals("a") && !escolha.equals("b") && !escolha.equals("c") && !escolha.equals("d") && !sair);
		            
		            
		            /* ============ QUESTÃO 2   TEMA 1 ============== */
		            do { 
		                
		                if(!sair) {
    		                System.out.println("");
    		                System.out.println("2. Qual ator ganhou mais oscars?");
    		                System.out.println("a) Anthony Hopkins");
    		                System.out.println("b) Meryl Streep");
    		                System.out.println("c) Daniel Day Lewis"); // QUESTÃO CERTA
    		                System.out.println("d) Robert Downey Jr.");
    		                System.out.println("e) Ir para o menu principal");
    		                System.out.println("");
    		                
    		                System.out.print("Qual é sua resposta? ");
    		                escolha = entrada.nextLine(); // LER RESPOSTA DO USUÁRIO
    		                
    		                escolha = escolha.toLowerCase();  // TRANSFORMAR A RESPOSTA DO USUÁRIO PARA MINUSCULAS
    		                
    		                if(escolha.equals("c")) { // QUESTÃO CERTA É A ALTERNATIVA C
    		                    System.out.println("Parabéns, você acertou!\n");
    		                    questoes_Corretas++;
    		                } else if(escolha.equals("a") || escolha.equals("b") || escolha.equals("d")) {
    		                    System.out.println("Resposta errada! A pessoa que mais ganhou oscars é Daniel Day Lewis.\n");
    		                    questoes_Erradas++;
    		                } else if(escolha.equals("e")){
    		                    sair = true; // USUÁRIO QUER SAIR NO MEIO DA QUESTÃO
    		                } else {
    		                    System.out.println("Opção inválida. Informe a letra a, b, c ou d.");
    		                }
		                }
		                
		            } while(!escolha.equals("a") && !escolha.equals("b") && !escolha.equals("c") && !escolha.equals("d") && !sair);
		            
		            
		            /* ============ QUESTÃO 3   TEMA 1 ============== */
		            do {
		                
		                if(!sair) {
    		                System.out.println("");
    		                System.out.println("3. Qual a série mais assistida da Netflix?");
    		                System.out.println("a) Heartstopper");
    		                System.out.println("b) La Casa de Papel");
    		                System.out.println("c) Strangers Things");
    		                System.out.println("d) Round 6"); //QUESTÃO CERTA
    		                System.out.println("e) Ir para o menu principal");
    		                System.out.println("");
    		                
    		                System.out.print("Qual é sua resposta? ");
    		               escolha = entrada.nextLine(); // LER RESPOSTA DO USUÁRIO
    		                
    		                escolha = escolha.toLowerCase();  // TRANSFORMAR A RESPOSTA DO USUÁRIO PARA MINUSCULAS
    		                
    		                if(escolha.equals("d")) { // QUESTÃO CERTA É A ALTERNATIVA D
    		                    System.out.println("Parabéns, você acertou!\n");
    		                    questoes_Corretas++;
    		                } else if(escolha.equals("a") || escolha.equals("b") || escolha.equals("c")) {
    		                    System.out.println("Resposta errada! A série mais assistida da Netflix é Round 6.\n");
    		                    questoes_Erradas++;
    		                } else if(escolha.equals("e")){
    		                    sair = true; // USUÁRIO QUER SAIR NO MEIO DA QUESTÃO
    		                } else {
    		                    System.out.println("Opção inválida. Informe a letra a, b, c ou d.");
    		                }
		                }
		                
		            } while(!escolha.equals("a") && !escolha.equals("b") && !escolha.equals("c") && !escolha.equals("d") && !sair);
		            
		            /* ============ QUESTÃO 4   TEMA 1 ============== */
		            do {
		                
		                if(!sair) {
    		                System.out.println("");
    		                System.out.println("4. Qual a série com mais temporadas da TV?");
    		                System.out.println("a) Grey's Anatomy");
    		                System.out.println("b) Doctor Who"); //QUESTÃO CERTA
    		                System.out.println("c) Breaking Bad");
    		                System.out.println("d) Os Simpsons");
    		                System.out.println("e) Ir para o menu principal");
    		                System.out.println("");
    		                
    		                System.out.print("Qual é sua resposta? ");
    		                escolha = entrada.nextLine(); // LER RESPOSTA DO USUÁRIO
    		                
    		                escolha = escolha.toLowerCase();  // TRANSFORMAR A RESPOSTA DO USUÁRIO PARA MINUSCULAS
    		                
    		                if(escolha.equals("b")) { // QUESTÃO CERTA É A ALTERNATIVA B
    		                    System.out.println("Parabéns, você acertou!\n");
    		                    questoes_Corretas++;
    		                } else if(escolha.equals("a") || escolha.equals("c") || escolha.equals("d")) {
    		                    System.out.println("Resposta errada! A série com mais temporadas da TV é Doctor Who.\n");
    		                    questoes_Erradas++;
    		                } else if(escolha.equals("e")){
        		                sair = true; // USUÁRIO QUER SAIR NO MEIO DA QUESTÃO
        		            } else {
        		                System.out.println("Opção inválida. Informe a letra a, b, c ou d.");
        		            }
		                }
		                
		            } while(!escolha.equals("a") && !escolha.equals("b") && !escolha.equals("c") && !escolha.equals("d") && !sair);
		            
		             /* ============ QUESTÃO 5   TEMA 1 ============== */
		            do {
		                
		                if(!sair) {
    		                System.out.println("");
    		                System.out.println("5. Qual o nome da cidade para qual o chaves viaja com a vila?");
    		                System.out.println("a) Acapulco"); //QUESTÃO CERTA
    		                System.out.println("b) Cidade do México"); 
    		                System.out.println("c) Tijuana");
    		                System.out.println("d) Manoel Viana");
    		                System.out.println("e) Ir para o menu principal");
    		                System.out.println("");
    		                
    		                System.out.print("Qual é sua resposta? ");
    		                escolha = entrada.nextLine(); // LER RESPOSTA DO USUÁRIO
    		                
    		                escolha = escolha.toLowerCase();  // TRANSFORMAR A RESPOSTA DO USUÁRIO PARA MINUSCULAS
    		                
    		                if(escolha.equals("a")) { // QUESTÃO CERTA É A ALTERNATIVA A
    		                    System.out.println("Parabéns, você acertou!\n");
    		                    questoes_Corretas++;
    		                } else if(escolha.equals("b") || escolha.equals("c") || escolha.equals("d")) {
    		                    System.out.println("Resposta errada! A cidade é Acapulco.\n");
    		                    questoes_Erradas++;
    		                } else if(escolha.equals("e")){
        		                sair = true; // USUÁRIO QUER SAIR NO MEIO DA QUESTÃO
        		            } else {
        		                System.out.println("Opção inválida. Informe a letra a, b, c ou d.");
        		            }
		                }
		                
		            } while(!escolha.equals("a") && !escolha.equals("b") && !escolha.equals("c") && !escolha.equals("d") && !sair);
		            
		            // MOSTRA O TOTAL DE ERROS E ACERTOS
		            System.out.println("");
		            System.out.println("Total de acertos: " + questoes_Corretas);
		            System.out.println("Total de erros: " + questoes_Erradas);

					switch(questoes_Corretas) {
						case 0:
							System.out.println("Você acertou nenhuma, mas não desanime!");
							break;
						
						case 1:
							System.out.println("Você tem um grande caminho pela frente!");
							break;

						case 2:
							System.out.println("Continue assim!");	
							break;

						case 3:
							System.out.println("Quase lá!");
							break;

						case 4:
							System.out.println("Você é sensacional!");
							break;

						case 5:
							System.out.println("Você é um GÊNIO!");
							break;
					}
		            
		            System.out.println("");
		            
		            break;
		        
		        case "b": case "B": // MÚSICA
    		            
    		        /* ============ QUESTÃO 1   TEMA 2 ============== */
    		        do {
    		            
    		            if(!sair) {     
        		            System.out.println("");
        		            System.out.println("1. Qual o álbum mais vendido da história? ");
        		            System.out.println("a) Thriller - Michael Jackson"); // QUESTÃO CERTA
        		            System.out.println("b) Metallica - Metallica");
        		            System.out.println("c) Dark Side - Pink Floyd");
        		            System.out.println("d) The Bodyguard - Whitney Houston");
        		            System.out.println("e) Ir para o menu principal");
        		            System.out.println("");
        		                
        		            System.out.print("Qual é sua resposta? ");
        		            escolha = entrada.nextLine(); // LER RESPOSTA DO USUÁRIO
    		                
    		                escolha = escolha.toLowerCase();  // TRANSFORMAR A RESPOSTA DO USUÁRIO PARA MINUSCULAS
        		                
        		            if(escolha.equals("a")) { // QUESTÃO CERTA É A ALTERNATIVA A
    		                    System.out.println("Parabéns, você acertou!\n");
    		                    questoes_Corretas++;
    		                } else if(escolha.equals("b") || escolha.equals("c") || escolha.equals("d")) {
    		                    System.out.println("Resposta errada! O álbum mais vendido da história é Thriller - Michael Jackson.\n");
    		                    questoes_Erradas++;
    		                } else if(escolha.equals("e")){
            		            sair = true; // USUÁRIO QUER SAIR NO MEIO DA QUESTÃO
    		                } else {
    		                    System.out.println("Opção inválida. Informe a letra a, b, c ou d.");
    		                }
    		            }
    		                
    		        } while(!escolha.equals("a") && !escolha.equals("b") && !escolha.equals("c") && !escolha.equals("d") &&!sair);
    		            
    		            
    		        /* ============ QUESTÃO 2   TEMA 2 ============== */
    		        do { 
    		            
    		            if(!sair) {    
        		            System.out.println("");
        		            System.out.println("2. Quem venceu o Grammy Latino 2021 de gravação do ano?");
        		            System.out.println("a) Talvez - Caetano Veloso e Tom veloso"); //QUESTÃO CERTA
        		            System.out.println("b) Suéltame, Bogotá – Diamante Eléctrico");
        		            System.out.println("c) Dios Así Lo Quiso – Ricardo Montaner & Juan Luis Guerra");
        		            System.out.println("d) Un Amor Eterno (Versión Balada) – Marc Anthony.");
        		            System.out.println("e) Ir para o menu principal");
        		            System.out.println("");
        		                
        		            System.out.print("Qual é sua resposta? ");
        		            escolha = entrada.nextLine(); // LER RESPOSTA DO USUÁRIO
    		                
    		                escolha = escolha.toLowerCase();  // TRANSFORMAR A RESPOSTA DO USUÁRIO PARA MINUSCULAS
        		                
        		            if(escolha.equals("a")) { // QUESTÃO CERTA É A ALTERNATIVA A
    		                    System.out.println("Parabéns, você acertou!\n");
    		                    questoes_Corretas++;
    		                } else if(escolha.equals("b") || escolha.equals("c") || escolha.equals("d")) {
    		                    System.out.println("Resposta errada! Quem venceu a categoria de gravação do ano no Grammy Latino 2021 foi Talvez - Caetano Veloso e Tom veloso.\n");
    		                    questoes_Erradas++;
    		                } else if(escolha.equals("e")){
            		            sair = true; // USUÁRIO QUER SAIR NO MEIO DA QUESTÃO
    		                } else {
    		                    System.out.println("Opção inválida. Informe a letra a, b, c ou d.");
    		                }
    		            }
    		            
    		        } while(!escolha.equals("a") && !escolha.equals("b") && !escolha.equals("c") && !escolha.equals("d") && !sair);
    		            
    		            
    		        /* ============ QUESTÃO 3   TEMA 2 ============== */
    		        do {
    		            
    		            if(!sair) {
    		                
        		            System.out.println("");
        		            System.out.println("3. Quem é o maior vencedor da história do Grammy?");
        		            System.out.println("a) Quincy Jones");
        		            System.out.println("b) Beyoncé");
        		            System.out.println("c) Michael Jackson");
        		            System.out.println("d) Georg Solti"); //QUESTÃO CERTA
        		            System.out.println("e) Ir para o menu principal");
        		            System.out.println("");
        		                
        		            System.out.print("Qual é sua resposta? ");
        		            escolha = entrada.nextLine(); // LER RESPOSTA DO USUÁRIO
    		                
    		                escolha = escolha.toLowerCase();  // TRANSFORMAR A RESPOSTA DO USUÁRIO PARA MINUSCULAS
        		            
        		            if(escolha.equals("d")) { // QUESTÃO CERTA É A ALTERNATIVA D
    		                    System.out.println("Parabéns, você acertou!\n");
    		                    questoes_Corretas++;
    		                } else if(escolha.equals("a") || escolha.equals("b") || escolha.equals("c")) {
    		                    System.out.println("Resposta errada! O maior vencedor da história do Grammy é Georg Solti.\n");
    		                    questoes_Erradas++;
    		                } else if(escolha.equals("e")){
            		            sair = true; // USUÁRIO QUER SAIR NO MEIO DA QUESTÃO
    		                } else {
    		                    System.out.println("Opção inválida. Informe a letra a, b, c ou d.");
    		                }
    		            }
    		                
    		        } while(!escolha.equals("a") && !escolha.equals("b") && !escolha.equals("c") && !escolha.equals("d") && !sair);
    		        
    		            
    		        /* ============ QUESTÃO 4   TEMA 2 ============== */
    		        do {
    		             
    		            if(!sair) {   
        		            System.out.println("");
        		            System.out.println("4. Qual a melhor posição alcançada pela música Envolver - Anita no Spotify?");
        		            System.out.println("a) 10º Lugar");
        		            System.out.println("b) 5º Lugar"); 
        		            System.out.println("c) 2º Lugar");
        		            System.out.println("d) 1º Lugar"); //QUESTÃO CERTA
        		            System.out.println("e) Ir para o menu principal");
        		            System.out.println("");
        		                
        		            System.out.print("Qual é sua resposta? ");
        		            escolha = entrada.nextLine(); // LER RESPOSTA DO USUÁRIO
    		                
    		                escolha = escolha.toLowerCase();  // TRANSFORMAR A RESPOSTA DO USUÁRIO PARA MINUSCULAS
        		            
        		            if(escolha.equals("d")) { // QUESTÃO CERTA É A ALTERNATIVA D
    		                    System.out.println("Parabéns, você acertou!\n");
    		                    questoes_Corretas++;
    		                } else if(escolha.equals("a") || escolha.equals("b") || escolha.equals("c")) {
    		                    System.out.println("Resposta errada! A melhor posição alcançada pela música Envolver foi o 1º Lugar.\n");
    		                    questoes_Erradas++;
    		                } else if(escolha.equals("e")){
                		        sair = true; // USUÁRIO QUER SAIR NO MEIO DA QUESTÃO
    		                } else {
    		                    System.out.println("Opção inválida. Informe a letra a, b, c ou d.");
    		                }  
    		            }
         
    		        } while(!escolha.equals("a") && !escolha.equals("b") && !escolha.equals("c") && !escolha.equals("d") && !sair);
    		            
    		        /* ============ QUESTÃO 5   TEMA 2 ============== */
    		        do {
    		            
    		            if(!sair) {     
        		            System.out.println("");
        		            System.out.println("5. Qual o nome do último álbum lançado pela banda Red Hot Chili Peppers?");
        		            System.out.println("a) Californication"); 
        		            System.out.println("b) Blood Sugar Sex Magik"); 
        		            System.out.println("c) By The Way");
        		            System.out.println("d) Unlimited Love"); //QUESTÃO CERTA
        		            System.out.println("e) Ir para o menu principal");
        		            System.out.println("");
        		                
        		            System.out.print("Qual é sua resposta? ");
        		            escolha = entrada.nextLine(); // LER RESPOSTA DO USUÁRIO
    		                
    		                escolha = escolha.toLowerCase();  // TRANSFORMAR A RESPOSTA DO USUÁRIO PARA MINUSCULAS
        		            
        		            if(escolha.equals("d")) { // QUESTÃO CERTA É A ALTERNATIVA D
    		                    System.out.println("Parabéns, você acertou!\n");
    		                    questoes_Corretas++;
    		                } else if(escolha.equals("a") || escolha.equals("b") || escolha.equals("c")) {
    		                    System.out.println("Resposta errada! O nome do último álbum lançado pela banda RHCP é Unlimited Love.\n");
    		                    questoes_Erradas++;
    		                } else if(escolha.equals("e")){
                		        sair = true; // USUÁRIO QUER SAIR NO MEIO DA QUESTÃO
    		                } else {
    		                    System.out.println("Opção inválida. Informe a letra a, b, c ou d.");
    		                }
    		            }

		            } while(!escolha.equals("a") && !escolha.equals("b") && !escolha.equals("c") && !escolha.equals("d") && !sair);
		            
    		        
    		        // MOSTRA O TOTAL DE ERROS E ACERTOS
		            System.out.println("");
		            System.out.println("Total de acertos: " + questoes_Corretas);
		            System.out.println("Total de erros: " + questoes_Erradas);
		            
		            // MOSTRA UMA FRASE PERSONALIZADA DE ACORDO COM O NÚMERO DE ACERTOS
		            if (questoes_Corretas == 0){
                        System.out.println("Você não acertou nenhuma, mas não desanime!");
		            } else if(questoes_Corretas == 1){
		                System.out.println("Você tem um grande caminho pela frente!");
                    } else if(questoes_Corretas == 2){
		                System.out.println("Continue assim!");
                    } else if(questoes_Corretas == 3){
		                System.out.println("Quase lá!");
                    } else if(questoes_Corretas == 4){
                        System.out.println("Você é sensacional!");
                    } else {                   
                        System.out.println("Você é um GÊNIO!");
		            }
		            System.out.println("");
		            
		            break;
		      
		        case "c": case "C": //Sobre Alegrete-RS
		       
		            /* ============ QUESTÃO 1   TEMA 3 ============== */
		            do {
		                if(!sair) {
    		                System.out.println("");
    		                System.out.println("1. Qual o nome do rio que banha a cidade de Alegrete-RS?");
    		                System.out.println("a) Rio Ibicuí"); 
    		                System.out.println("b) Rio Uruguai");
    		                System.out.println("c) Rio Jacuí");
    		                System.out.println("d) Rio Ibirapuitã"); // QUESTÃO CERTA
    		                System.out.println("e) Ir para o menu principal");
    		                System.out.println("");
    		                
    		                System.out.print("Qual é sua resposta? ");
    		                escolha = entrada.nextLine(); // LER RESPOSTA DO USUÁRIO
    		                
    		                escolha = escolha.toLowerCase();  // TRANSFORMAR A RESPOSTA DO USUÁRIO PARA MINUSCULAS
    		                
    		                if(escolha.equals("d")) { // QUESTÃO CERTA É A ALTERNATIVA D
    		                    System.out.println("Parabéns, você acertou!\n");
    		                    questoes_Corretas++;
    		                } else if(escolha.equals("a") || escolha.equals("b") || escolha.equals("c")) {
    		                    System.out.println("Resposta errada! A reposta é rio Ibirapuitã\n");
    		                    questoes_Erradas++;
    		                } else if (escolha.equals("e")) {
    		                    sair = true; // USUÁRIO QUER SAIR NO MEIO DA QUESTÃO
    		                } else {
    		                    System.out.println("Opção inválida. Informe a letra a, b, c ou d.");
    		                }
		                }
		            } while(!escolha.equals("a") && !escolha.equals("b") && !escolha.equals("c") && !escolha.equals("d") && !sair);
		            
		            
		            /* ============ QUESTÃO 2   TEMA 3 ============== */
		            do { 
    		                if (!sair) {
    		                System.out.println("");
    		                System.out.println("2. Qual o ano de fundação da cidade de Alegrete-RS?");
    		                System.out.println("a) 1831 "); // QUESTÃO CERTA
    		                System.out.println("b) 1500 ");
    		                System.out.println("c) 1909 "); 
    		                System.out.println("d) 1930 ");
    		                System.out.println("e) Ir para o menu principal");
    		                System.out.println("");
    		                
    		                System.out.print("Qual é sua resposta? ");
    		                escolha = entrada.nextLine(); // LER RESPOSTA DO USUÁRIO
    		                
    		                escolha = escolha.toLowerCase();  // TRANSFORMAR A RESPOSTA DO USUÁRIO PARA MINUSCULAS
    		                
    		                if(escolha.equals("a")) { // QUESTÃO CERTA É A ALTERNATIVA A
    		                    System.out.println("Parabéns, você acertou!\n");
    		                    questoes_Corretas++;
    		                } else if(escolha.equals("b") || escolha.equals("c") || escolha.equals("d")) {
    		                    System.out.println("Resposta errada! A cidade foi fundada no ano de 1831.\n");
    		                    questoes_Erradas++;
    		                } else if (escolha.equals("e")) {
    		                    sair = true; // USUÁRIO QUER SAIR NO MEIO DA QUESTÃO
    		                } else {
    		                    System.out.println("Opção inválida. Informe a letra a, b, c ou d.");
    		                }
		                }
		            } while(!escolha.equals("a") && !escolha.equals("b") && !escolha.equals("c") && !escolha.equals("d") && !sair);
		            
		            
		            /* ============ QUESTÃO 3   TEMA 3 ============== */
		            do {
    		                if (!sair) {
    		                System.out.println("");
    		                System.out.println("3. Qual destes personagens ilustres é nascido em Alegrete-RS?");
    		                System.out.println("a) Getúlio Vargas");
    		                System.out.println("b) Ronaldinho Gaúcho");
    		                System.out.println("c) Xuxa Meneghel");
    		                System.out.println("d) Mário Quintana"); //QUESTÃO CERTA
    		                System.out.println("e) Ir para o menu principal");
    		                System.out.println("");
    		                
    		                System.out.print("Qual é sua resposta? ");
    		                escolha = entrada.nextLine(); // LER RESPOSTA DO USUÁRIO
    		                
    		                escolha = escolha.toLowerCase();  // TRANSFORMAR A RESPOSTA DO USUÁRIO PARA MINUSCULAS
    		                
    		               if(escolha.equals("d")) { // QUESTÃO CERTA É A ALTERNATIVA D
    		                    System.out.println("Parabéns, você acertou!\n");
    		                    questoes_Corretas++;
    		                } else if(escolha.equals("a") || escolha.equals("b") || escolha.equals("c")) {
    		                    System.out.println("Resposta errada! A reposta é Mario Quintana \n");
    		                    questoes_Erradas++;
    		                } else if (escolha.equals("e")) {
    		                    sair = true; // USUÁRIO QUER SAIR NO MEIO DA QUESTÃO
    		                } else {
    		                    System.out.println("Opção inválida. Informe a letra a, b, c ou d.");
    		                }
		                }
		            } while(!escolha.equals("a") && !escolha.equals("b") && !escolha.equals("c") && !escolha.equals("d") && !sair);
		            
		            /* ============ QUESTÃO 4   TEMA 3 ============== */
		            do {
    		                if (!sair){
    		                System.out.println("");
    		                System.out.println("4. Em qual ano aconteceram as primeiras aulas na Unipampa campus Alegrete?");
    		                System.out.println("a) 2010");
    		                System.out.println("b) 2006"); //QUESTÃO CERTA
    		                System.out.println("c) 2012");
    		                System.out.println("d) 2008");
    		                System.out.println("e) Ir para o menu principal");
    		                System.out.println("");
    		                
    		                System.out.print("Qual é sua resposta? ");
    		                escolha = entrada.nextLine(); // LER RESPOSTA DO USUÁRIO
    		                
    		                escolha = escolha.toLowerCase();  // TRANSFORMAR A RESPOSTA DO USUÁRIO PARA MINUSCULAS
    		                
    		                if(escolha.equals("b")) { // QUESTÃO CERTA É A ALTERNATIVA B
    		                    System.out.println("Parabéns, você acertou!\n");
    		                    questoes_Corretas++;
    		                } else if(escolha.equals("a")|| escolha.equals("b")|| escolha.equals("d")) {
    		                    System.out.println("Resposta errada! As primeiras aulas foram realizadas no ano de 2006.\n");
    		                    questoes_Erradas++;
    		                } else if (escolha.equals("e")) {
    		                    sair = true; // USUÁRIO QUER SAIR NO MEIO DA QUESTÃO
    		                } else {
    		                    System.out.println("Opção inválida. Informe a letra a, b, c ou d.");
    		                }
		                }
		            } while(!escolha.equals("a") && !escolha.equals("b") && !escolha.equals("c") && !escolha.equals("d") && !sair);
		            
		            /* ============ QUESTÃO 5   TEMA 3 ============== */
		            do {
    		                if (!sair) {
    		                System.out.println("");
    		                System.out.println("5. Em que dia celebramos o aniversário da cidade de Alegrete-RS?");
    		                System.out.println("a) 12 de Janeiro"); 
    		                System.out.println("b) 25 de Outubro"); //QUESTÃO CERTA
    		                System.out.println("c) 7 de Maio");
    		                System.out.println("d) 13 de Agosto");
    		                System.out.println("e) Ir para o menu principal");
    		                System.out.println("");
    		                
    		                System.out.print("Qual é sua resposta? ");
    		                escolha = entrada.nextLine(); // LER RESPOSTA DO USUÁRIO
    		                
    		                escolha = escolha.toLowerCase();  // TRANSFORMAR A RESPOSTA DO USUÁRIO PARA MINUSCULAS
    
    		                if(escolha.equals("b")) { // QUESTÃO CERTA É A ALTERNATIVA B
    		                    System.out.println("Parabéns, você acertou!\n");
    		                    questoes_Corretas++;
    		                } else if(escolha.equals("a")|| escolha.equals("c")|| escolha.equals("d")) {
    		                    System.out.println("Resposta errada! É celebrado dia 25 de Outubro.\n");
    		                    questoes_Erradas++;
    		                } else if (escolha.equals("e")) {
    		                    sair = true; // USUÁRIO QUER SAIR NO MEIO DA QUESTÃO
    		                } else {
    		                    System.out.println("Opção inválida. Informe a letra a, b, c ou d.");
    		                }
		                }
		            } while(!escolha.equals("a") && !escolha.equals("b") && !escolha.equals("c") && !escolha.equals("d") && !sair);
		            
		            // MOSTRA O TOTAL DE ERROS E ACERTOS
		            System.out.println("");
		            System.out.println("Total de acertos: " + questoes_Corretas);
		            System.out.println("Total de erros: " + questoes_Erradas);
		            
		            // MOSTRA UMA FRASE PERSONALIZADA DE ACORDO COM O NÚMERO DE ACERTOS
		            if (questoes_Corretas == 0){
                        System.out.println("Você não acertou nenhuma, mas não desanime!");
		            } else if(questoes_Corretas ==1){
		                System.out.println("Você tem um grande caminho pela frente!");
                    } else if(questoes_Corretas == 2){
		                System.out.println("Continue assim!");
                    } else if(questoes_Corretas == 3){
		                System.out.println("Quase lá!");
                    } else if(questoes_Corretas == 4){
                        System.out.println("Você é sensacional!");
                    } else {                   
                        System.out.println("Você é um GÊNIO!");
		            }
		            System.out.println("");
		           
		           break;
		           
		        case "d": case "D": //Java
		           
		            /* ============ QUESTÃO 1   TEMA 4 ============== */
		            do {
		                if(!sair) {
    		                char aspas = '"';
    		                
    		                System.out.println("");
    		                System.out.println("1. Como imprimir corretamente a mensagem 'oi' no Java?");
    		                System.out.println("a) System.out.println(" + aspas + "oi" + aspas + ");"); // QUESTÃO CERTA
    		                System.out.println("b) system.out.Println(" + aspas + "oi" + aspas + ");");
    		                System.out.println("c) Systemout.println(" + aspas + "oi" + aspas + ");");
    		                System.out.println("d) System.out.prinTLn(" + aspas + "oi" + aspas + ");"); 
    		                System.out.println("e) Ir para o menu principal");
    		                System.out.println("");
    		                
    		                System.out.print("Qual é sua resposta? ");
    		                escolha = entrada.nextLine(); // LER RESPOSTA DO USUÁRIO
    		                
    		                escolha = escolha.toLowerCase();  // TRANSFORMAR A RESPOSTA DO USUÁRIO PARA MINUSCULAS
    		                
    		                if(escolha.equals("a")) { // QUESTÃO CERTA É A ALTERNATIVA A
    		                    System.out.println("Parabéns, você acertou!\n");
    		                    questoes_Corretas++;
    		                } else if(escolha.equals("b") || escolha.equals("c") || escolha.equals("d")) {
    		                    System.out.println("Resposta errada! A forma correta é System.out.println(" + aspas + "oi" + aspas + ");");
    		                    questoes_Erradas++;
    		                } else if (escolha.equals("e")) {
    		                    sair = true; // USUÁRIO QUER SAIR NO MEIO DA QUESTÃO
    		                } else {
    		                    System.out.println("Opção inválida. Informe a letra a, b, c ou d.");
    		                }
		                }
		            } while(!escolha.equals("a") && !escolha.equals("b") && !escolha.equals("c") && !escolha.equals("d") && !sair);
		            
		            
		            /* ============ QUESTÃO 2   TEMA 4 ============== */
		            do { 
		                if (!sair) {
    		                System.out.println("");
    		                System.out.println("2. Qual a sintaxe correta da estrutura condicional 'IF ELSE'?");
    		                System.out.println("a) if () { } else { }"); // QUESTÃO CERTA
    		                System.out.println("b) if () } else { }");
    		                System.out.println("c) if {} else { }"); 
    		                System.out.println("d) if ) { else { }");
    		                System.out.println("e) Ir para o menu principal");
    		                System.out.println("");
    		                
    		                System.out.print("Qual é sua resposta? ");
    		                escolha = entrada.nextLine(); // LER RESPOSTA DO USUÁRIO
    		                
    		                escolha = escolha.toLowerCase();  // TRANSFORMAR A RESPOSTA DO USUÁRIO PARA MINUSCULAS
    		                
    		                if(escolha.equals("a")) { // QUESTÃO CERTA É A ALTERNATIVA A
    		                    System.out.println("Parabéns, você acertou!\n");
    		                    questoes_Corretas++;
    		                } else if(escolha.equals("b") || escolha.equals("c") || escolha.equals("d")) {
    		                    System.out.println("Resposta errada! A sintaxe correta é if () { } else { }.\n");
    		                    questoes_Erradas++;
    		                } else if (escolha.equals("e")) {
    		                    sair = true; // USUÁRIO QUER SAIR NO MEIO DA QUESTÃO
    		                } else {
    		                    System.out.println("Opção inválida. Informe a letra a, b, c ou d.");
    		                }
		                }
		            } while(!escolha.equals("a") && !escolha.equals("b") && !escolha.equals("c") && !escolha.equals("d") && !sair);
		            
		            
		            /* ============ QUESTÃO 3   TEMA 4 ============== */
		            do {
		                if (!sair) {
    		                System.out.println("");
    		                System.out.println("3. Qual a forma correta de fazer uma comparação de igualdade de inteiros?");
    		                System.out.println("a) x=y");
    		                System.out.println("b) x-=y");
    		                System.out.println("c) x==y"); //QUESTÃO CERTA
    		                System.out.println("d) x equal y"); 
    		                System.out.println("e) Ir para o menu principal");
    		                System.out.println("");
    		                
    		                System.out.print("Qual é sua resposta? ");
    		                escolha = entrada.nextLine(); // LER RESPOSTA DO USUÁRIO
    		                
    		                escolha = escolha.toLowerCase();  // TRANSFORMAR A RESPOSTA DO USUÁRIO PARA MINUSCULAS
    		                
    		                if(escolha.equals("c")) { // QUESTÃO CERTA É A ALTERNATIVA C
    		                    System.out.println("Parabéns, você acertou!\n");
    		                    questoes_Corretas++;
    		                } else if(escolha.equals("a") || escolha.equals("b") || escolha.equals("d")) {
    		                    System.out.println("Resposta errada! A forma correta é x==y.\n");
    		                    questoes_Erradas++;
    		                } else if (escolha.equals("e")) {
    		                    sair = true; // USUÁRIO QUER SAIR NO MEIO DA QUESTÃO
    		                } else {
    		                    System.out.println("Opção inválida. Informe a letra a, b, c ou d.");
    		                }
		                }
		            } while(!escolha.equals("a") && !escolha.equals("b") && !escolha.equals("c") && !escolha.equals("d") && !sair);
		            
		            /* ============ QUESTÃO 4   TEMA 4 ============== */
		            do {
		                if(!sair) {
    		                System.out.println("");
    		                System.out.println("4. Qual a maneira correta de receber uma entrada do tipo char?");
    		                System.out.println("a) variavel = entrada.next().charAt();");
    		                System.out.println("b) variavel = entrada.next().charAt(0);"); //QUESTÃO CERTA
    		                System.out.println("c) variavel = entrada.next()charAt(0);");
    		                System.out.println("d) variavel = entradanext().charAt(0);");
    		                System.out.println("e) Ir para o menu principal");
    		                System.out.println("");
    		                
    		                System.out.print("Qual é sua resposta? ");
    		                escolha = entrada.nextLine(); // LER RESPOSTA DO USUÁRIO
    		                
    		                escolha = escolha.toLowerCase();  // TRANSFORMAR A RESPOSTA DO USUÁRIO PARA MINUSCULAS
    		                
    		                if(escolha.equals("b")) { // QUESTÃO CERTA É A ALTERNATIVA B
    		                    System.out.println("Parabéns, você acertou!\n");
    		                    questoes_Corretas++;
    		                } else if(escolha.equals("a") || escolha.equals("c") || escolha.equals("d")) {
    		                    System.out.println("Resposta errada! A maneira correta é variavel = entrada.next().charAt(0);.\n");
    		                    questoes_Erradas++;
    		                } else if (escolha.equals("e")) {
    		                    sair = true; // USUÁRIO QUER SAIR NO MEIO DA QUESTÃO
    		                } else {
    		                    System.out.println("Opção inválida. Informe a letra a, b, c ou d.");
    		                }
		                }
		            } while(!escolha.equals("a") && !escolha.equals("b") && !escolha.equals("c") && !escolha.equals("d") && !sair);
		            
		            /* ============ QUESTÃO 5   TEMA 4 ============== */
		            do {
		                if(!sair) {
    		                System.out.println("");
    		                System.out.println("5. Qual a maneira correta de declarar o import do Scanner?");
    		                System.out.println("a) import java.utilScanner;"); 
    		                System.out.println("b) import java.util.Scanner;"); //QUESTÃO CERTA
    		                System.out.println("c) import javautil.Scanner;");
    		                System.out.println("d) não é necessário declarar o import do Scanner");
    		                System.out.println("e) Ir para o menu principal");
    		                System.out.println("");
    		                
    		                System.out.print("Qual é sua resposta? ");
    		                escolha = entrada.nextLine(); // LER RESPOSTA DO USUÁRIO
    		                
    		                escolha = escolha.toLowerCase();  // TRANSFORMAR A RESPOSTA DO USUÁRIO PARA MINUSCULAS
    		                
    		                if(escolha.equals("b")) { // QUESTÃO CERTA É A ALTERNATIVA B
    		                    System.out.println("Parabéns, você acertou!\n");
    		                    questoes_Corretas++;
    		                } else if(escolha.equals("a") || escolha.equals("c") || escolha.equals("d")) {
    		                    System.out.println("Resposta errada! O correto é import java.util.Scanner;\n");
    		                    questoes_Erradas++;
    		                } else if (escolha.equals("e")) {
    		                    sair = true; // USUÁRIO QUER SAIR NO MEIO DA QUESTÃO
    		                } else {
    		                    System.out.println("Opção inválida. Informe a letra a, b, c ou d.");
    		                }
		                }
		            } while(!escolha.equals("a") && !escolha.equals("b") && !escolha.equals("c") && !escolha.equals("d") && !sair);
		            
		            // MOSTRA O TOTAL DE ERROS E ACERTOS
		            System.out.println("");
		            System.out.println("Total de acertos: " + questoes_Corretas);
		            System.out.println("Total de erros: " + questoes_Erradas);
		            
		            // MOSTRA UMA FRASE PERSONALIZADA DE ACORDO COM O NÚMERO DE ACERTOS
		            if (questoes_Corretas == 0){
                        System.out.println("Você não acertou nenhuma, mas não desanime!");
		            } else if(questoes_Corretas == 1){
		                System.out.println("Você tem um grande caminho pela frente!");
                    } else if(questoes_Corretas == 2){
		                System.out.println("Continue assim!");
                    } else if(questoes_Corretas == 3){
		                System.out.println("Quase lá!");
                    } else if(questoes_Corretas == 4){
                        System.out.println("Você é sensacional!");
                    } else {                   
                        System.out.println("Você é um GÊNIO!");
		            }
		            System.out.println("");
		           
		            break;
		           
		        case "e": case "E": // JOGOS DIGITAIS
		           
		            /* ============ QUESTÃO 1   TEMA 5 ============== */
		            do {
		                if (!sair){
    		                System.out.println("");
    		                System.out.println("1. Qual jogo foi o GOTY (Game Of The Year) em 2021?");
    		                System.out.println("a) It Takes Two"); // QUESTÃO CERTA
    		                System.out.println("b) Metroid Dread");
    		                System.out.println("c) Deathloop");
    		                System.out.println("d) Resident Evil Village"); 
    		                System.out.println("e) Ir para o menu principal");
    		                System.out.println("");
    		                
    		                System.out.print("Qual é sua resposta? ");
    		                escolha = entrada.nextLine(); // LER RESPOSTA DO USUÁRIO
    		                
    		                escolha = escolha.toLowerCase();  // TRANSFORMAR A RESPOSTA DO USUÁRIO PARA MINUSCULAS
    		                
    		                if(escolha.equals("a")) { // QUESTÃO CERTA É A ALTERNATIVA A
    		                    System.out.println("Parabéns, você acertou!\n");
    		                    questoes_Corretas++;
    		                } else if(escolha.equals("b") || escolha.equals("c") || escolha.equals("d")) {
    		                    System.out.println("Resposta errada! O Jogo que venceu o GOTY de 2021 foi It Takes Two.\n");
    		                    questoes_Erradas++;
    		                } else if (escolha.equals("e")) {
    		                    sair = true; // USUÁRIO QUER SAIR NO MEIO DA QUESTÃO
    		                } else {
    		                    System.out.println("Opção inválida. Informe a letra a, b, c ou d.");
    		                }
		                }   
		            } while(!escolha.equals("a") && !escolha.equals("b") && !escolha.equals("c") && !escolha.equals("d") && !sair);
		            
		            
		            /* ============ QUESTÃO 2   TEMA 5 ============== */
		            do { 
		                if (!sair){
    		                System.out.println("");
    		                System.out.println("2. Qual jogo a seguir é um FPS (First Person Shooter)?");
    		                System.out.println("a) Valorant"); // QUESTÃO CERTA
    		                System.out.println("b) Fortnite");
    		                System.out.println("c) League of Legends"); 
    		                System.out.println("d) Dark Souls 3");
    		                System.out.println("e) Ir para o menu principal");
    		                System.out.println("");
    		                
    		                System.out.print("Qual é sua resposta? ");
    		                escolha = entrada.nextLine(); // LER RESPOSTA DO USUÁRIO
    		                
    		                escolha = escolha.toLowerCase();  // TRANSFORMAR A RESPOSTA DO USUÁRIO PARA MINUSCULAS
    
    		                if(escolha.equals("a")) { // QUESTÃO CERTA É A ALTERNATIVA B
    		                    System.out.println("Parabéns, você acertou!\n");
    		                    questoes_Corretas++;
    		                } else if(escolha.equals("b")|| escolha.equals("c")|| escolha.equals("d")) {
    		                    System.out.println("Resposta errada! Valorant é um FPS.\n");
    		                    questoes_Erradas++;
    		                } else if (escolha.equals("e")) {
    		                    sair = true; // USUÁRIO QUER SAIR NO MEIO DA QUESTÃO
    		                } else {
    		                    System.out.println("Opção inválida. Informe a letra a, b, c ou d.");
    		                }
		                }
		            } while(!escolha.equals("a") && !escolha.equals("b") && !escolha.equals("c") && !escolha.equals("d") && !sair);
		            
		            
		            /* ============ QUESTÃO 3   TEMA 5 ============== */
		            do {
		                if (!sair){
    		                System.out.println("");
    		                System.out.println("3. Qual jogo ganhou na categoria de melhor jogo de eSport em 2021?");
    		                System.out.println("a) CS:GO");
    		                System.out.println("b) Dota 2");
    		                System.out.println("c) Valorant"); 
    		                System.out.println("d) League of Legends"); //QUESTÃO CERTA
    		                System.out.println("e) Ir para o menu principal");
    		                System.out.println("");
    		                
    		                System.out.print("Qual é sua resposta? ");
    		                escolha = entrada.nextLine(); // LER RESPOSTA DO USUÁRIO
    		                
    		                escolha = escolha.toLowerCase();  // TRANSFORMAR A RESPOSTA DO USUÁRIO PARA MINUSCULAS
    		                
    		               if(escolha.equals("d")) { // QUESTÃO CERTA É A ALTERNATIVA D
    		                    System.out.println("Parabéns, você acertou!\n");
    		                    questoes_Corretas++;
    		                } else if(escolha.equals("a") || escolha.equals("b") || escolha.equals("c")) {
    		                    System.out.println("Resposta errada! A reposta é League of Legends \n");
    		                    questoes_Erradas++;
    		                } else if (escolha.equals("e")) {
    		                    sair = true; // USUÁRIO QUER SAIR NO MEIO DA QUESTÃO
    		                } else {
    		                    System.out.println("Opção inválida. Informe a letra a, b, c ou d.");
    		                }
		                }
		            } while(!escolha.equals("a") && !escolha.equals("b") && !escolha.equals("c") && !escolha.equals("d") && !sair);
		            
		            /* ============ QUESTÃO 4   TEMA 5 ============== */
		            do {
		                if (!sair) {
    		                System.out.println("");
    		                System.out.println("4. Qual jogo a seguir não é um FPS (First Person Shooter)?");
    		                System.out.println("a) Valorant");
    		                System.out.println("b) Rainbow Six Siege"); 
    		                System.out.println("c) Hollow Knight"); //QUESTÃO CERTA
    		                System.out.println("d) CS:GO");
    		                System.out.println("e) Ir para o menu principal");
    		                System.out.println("");
    		                
    		                System.out.print("Qual é sua resposta? ");
    		                escolha = entrada.nextLine(); // LER RESPOSTA DO USUÁRIO
    		                
    		                escolha = escolha.toLowerCase();  // TRANSFORMAR A RESPOSTA DO USUÁRIO PARA MINUSCULAS
    		                
    		                if(escolha.equals("c")) { // QUESTÃO CERTA É A ALTERNATIVA C
    		                    System.out.println("Parabéns, você acertou!\n");
    		                    questoes_Corretas++;
    		                } else if(escolha.equals("a")|| escolha.equals("b")|| escolha.equals("d")) {
    		                    System.out.println("Resposta errada! Hollow Knight não é um FPS.\n");
    		                    questoes_Erradas++;
    		                } else if (escolha.equals("e")) {
    		                    sair = true; // USUÁRIO QUER SAIR NO MEIO DA QUESTÃO
    		                } else {
    		                    System.out.println("Opção inválida. Informe a letra a, b, c ou d.");
    		                }
		                }
		            } while(!escolha.equals("a") && !escolha.equals("b") && !escolha.equals("c") && !escolha.equals("d") && !sair);
		            
		            /* ============ QUESTÃO 5   TEMA 5 ============== */
		            do {
		                if (!sair) {
    		                System.out.println("");
    		                System.out.println("5. Qual a plataforma de jogos mais popular do mundo?");
    		                System.out.println("a) Epic Games"); 
    		                System.out.println("b) Steam"); //QUESTÃO CERTA
    		                System.out.println("c) Origin");
    		                System.out.println("d) Blizzard");
    		                System.out.println("e) Ir para o menu principal");
    		                System.out.println("");
    		                
    		                System.out.print("Qual é sua resposta? ");
    		                escolha = entrada.nextLine(); // LER RESPOSTA DO USUÁRIO
    		                
    		                escolha = escolha.toLowerCase();  // TRANSFORMAR A RESPOSTA DO USUÁRIO PARA MINUSCULAS
    
    		                if(escolha.equals("b")) { // QUESTÃO CERTA É A ALTERNATIVA B
    		                    System.out.println("Parabéns, você acertou!\n");
    		                    questoes_Corretas++;
    		                } else if(escolha.equals("a")|| escolha.equals("c")|| escolha.equals("d")) {
    		                    System.out.println("Resposta errada! A plataforma mais popular é a Steam.\n");
    		                    questoes_Erradas++;
    		                } else if (escolha.equals("e")) {
    		                    sair = true; // USUÁRIO QUER SAIR NO MEIO DA QUESTÃO
    		                } else {
    		                    System.out.println("Opção inválida. Informe a letra a, b, c ou d.");
    		                }
		                }
		            } while(!escolha.equals("a") && !escolha.equals("b") && !escolha.equals("c") && !escolha.equals("d") && !sair);
		            
		            
		            // MOSTRA O TOTAL DE ERROS E ACERTOS
		            System.out.println("");
		            System.out.println("Total de acertos: " + questoes_Corretas);
		            System.out.println("Total de erros: " + questoes_Erradas);
		            
		            // MOSTRA UMA FRASE PERSONALIZADA DE ACORDO COM O NÚMERO DE ACERTOS
		            if (questoes_Corretas == 0){
                        System.out.println("Você não acertou nenhuma, mas não desanime!");
		            } else if(questoes_Corretas == 1){
		                System.out.println("Você tem um grande caminho pela frente!");
                    } else if(questoes_Corretas == 2){
		                System.out.println("Continue assim!");
                    } else if(questoes_Corretas == 3){
		                System.out.println("Quase lá!");
                    } else if(questoes_Corretas == 4){
                        System.out.println("Você é sensacional!");
                    } else {                   
                        System.out.println("Você é um GÊNIO!");
		            }
		            System.out.println("");
		           
		           break;
		           
		        case "f": case "F": //SAIR DO SISTEMA
		           System.out.println("Você escolheu sair do sistema!");
		           repetir = false; // USUÁRIO NÃO QUER MAIS JOGAR O QUIZ
		           break;
		           
		        default:     //ESCOLHA INVÁLIDA
		           System.out.println("Escolha inválida!\n");
		           break;    
		       
		    }
		} while (repetir);
	}	
}
