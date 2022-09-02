import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    
    public static void main(String[] args) throws ParseException, IOException, ClassNotFoundException {

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        Date dataFormatada = formato.parse("29/12/2003");
        
        /* UTILIZADO PARA CRIAR O OBJETO PARA GERAR O ARQUIVO */
        //Pessoa pessoa = new Pessoa("Ricardo", "Avenida xxx Num 234", dataFormatada);
        //Carro meuCarro = new Carro(pessoa, "OAO-3298", 2020);
  
        /* GERANDO O ARQUIVO BINÁRIO */
        /*ObjectOutputStream objectOutput = new ObjectOutputStream(new FileOutputStream("teste.bytej"));
        objectOutput.writeObject(meuCarro);
        objectOutput.close();*/

        /* LENDO O ARQUIVO BINÁRIO GERADO */
        ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream("teste.bytej"));
        Carro meuCarro = (Carro) objectInput.readObject();
        objectInput.close();

        System.out.println(meuCarro);

    }
}
