import java.io.*;

public class Arquivo {

	/**
	 * O atributo nome nomeGravacao, do tipo <i>String</i>, e utilizado para gerar um novo arquivo com o nome desejado.
	 */
	private String nomeGravacao;

	/**
	 * Construtor default da classe <b>Arquivo</b>.<br>
	 * <b>Uso: </b>
	 * Arquivo arquivo = new Arquivo("nomeGravacao", "nomeLeitura");<br><br>
	 * @param nomeGravacao <i>String</i> que identifica o nome para a gravacao do arquivo.
	 */
	public Arquivo(String nomeGravacao) {
		this.nomeGravacao = nomeGravacao;
	} // fim do construtor Arquivo

	
	/** 
	 * @return <i>String</i> que contem o nome do arquivo para a gravacao.
	 */
	public String getNomeGravacao() {
		return nomeGravacao;
	} //fim do método getNomeGravacao

	
	/** 
	 * @param nomeGravacao <i>String</i> que contem o nome do arquivo que deseja mudar para a gravacao.
	 */
	public void setNomeGravacao(String nomeGravacao) {
		this.nomeGravacao = nomeGravacao;
	} // fim do método setNomeGravacao

	
	/** 
	 * @param conteudo <i>String</i> que contem o conteudo que deseja gravar no novo arquivo.
	 * @throws Exception que contem, caso aconteca, um erro.
	 */
	public void gravar(String conteudo) throws Exception {
		//abre o arquivo para escrita
		FileOutputStream outFile = new FileOutputStream(new File(nomeGravacao));
		BufferedWriter buff = new BufferedWriter(new OutputStreamWriter(outFile, "UTF-8"));

		//escreve no arquivo
		buff.write(conteudo);

		// fecha o arquivo
		buff.close();  
		outFile.close();
	} // fim do método gravar

	
} // fim da classe Arquivo