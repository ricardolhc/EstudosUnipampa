import java.io.*;

public class Arquivo {

	/**
	 * O atributo nome nomeLeitura, do tipo <i>String</i>, e utilizado para ler um arquivo existente.
	 */
	private String nomeLeitura;

	/**
	 * Construtor default da classe <b>Arquivo</b>.<br>
	 * <b>Uso: </b>
	 * Arquivo arquivo = new Arquivo("nomeGravacao", "nomeLeitura");<br><br>
	 * @param nomeGravacao <i>String</i> que identifica o nome para a gravacao do arquivo.
	 * @param nomeLeitura <i>String</i> que identifica o nome para a leitura de um arquivo existente.
	 */
	public Arquivo(String nomeLeitura) {
		this.nomeLeitura = nomeLeitura;
	} // fim do construtor Arquivo
	
	/** 
	 * @return <i>String</i> que contem o nome do arquivo para a leitura.
	 */
	public String getNomeLeitura() {
		return nomeLeitura;
	} // fim do método getNomeLeitura

	/** 
	 * @param nomeLeitura <i>String</i> que contem o nome do arquivo que deseja mudar para a leitura.
	 */
	public void setNomeLeitura(String nomeLeitura) {
		this.nomeLeitura = nomeLeitura;
	} // fim do método setNomeLeitura
	
	/** 
	 * @return <i>int</i> que identifica o numero de linhas do arquivo.
	 * @throws Exception que contem, caso aconteca, um erro.
	 */
	public int getTamanho() throws Exception {
		// declaração das variáveis        
		String linha;
		int linhas = 0;
		
        //abre o arquivo para leitura
        FileInputStream inFile = new FileInputStream(new File(nomeLeitura));
        BufferedReader buff = new BufferedReader(new InputStreamReader(inFile, "UTF-8"));

        //lê a primeira linha do arquivo (numero de linhas)
		do {
			linha = buff.readLine();
			linhas++;
		} while(linha != null);
		

		buff.close();
        inFile.close();

		return linhas;
	} // fim do método getTamanho


	public String[] getLinhas() throws Exception {
        // declaração das variáveis        
       	String[] linhas;
		String linha;
		int i = 0;
        //abre o arquivo para leitura
        FileInputStream inFile = new FileInputStream(new File(nomeLeitura));
        BufferedReader buff = new BufferedReader(new InputStreamReader(inFile, "UTF-8"));

        //lê a primeira linha do arquivo (numero de linhas)
		linha = buff.readLine();
		linhas = new String[getTamanho()-1];
		linhas[i++] = linha;

		//lê as demais linhas do arquivo
		do {
			linha = buff.readLine();
			if(linha != null)
				linhas[i++] = linha; 
		} while(linha != null);
            
        //fecha o arquivo
        buff.close();
        inFile.close();
		
		return linhas;
    } // fim do método getLinhas

} // fim da classe Arquivo