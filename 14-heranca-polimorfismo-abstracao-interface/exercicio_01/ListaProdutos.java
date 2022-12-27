import java.util.ArrayList;

public class ListaProdutos implements IListaProdutos {

    ArrayList<Produto> produtos;
    
    public ListaProdutos() {
        produtos = new ArrayList<Produto>();
    }
    
    @Override
    public void add(Produto produto) {
        produtos.add(produto);
    }

    @Override
    public void remove(Produto produto) {
        produtos.remove(produto);       
    }


    @Override
    public Produto consultaProdutoByCod(int codigo) {
        for(int i = 0; i < produtos.size(); i++) {
            if(produtos.get(i).getCodigo() == codigo) {
                return produtos.get(i);
            }
        }
        return null;
    }

    public String toString() {
        String conteudo = "";
        for(Produto produto : produtos) {
            conteudo += produto.toString() + "\n";
        }
        return conteudo;
    }

}