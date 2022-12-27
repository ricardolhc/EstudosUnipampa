public interface IListaProdutos {

    public void add(Produto produto);
    public void remove(Produto produto);
    public Produto consultaProdutoByCod(int codigo);

}