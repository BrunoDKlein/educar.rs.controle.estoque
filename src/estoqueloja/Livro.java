package estoqueloja;

public class Livro extends Produto{
    private String autor;

    public Livro(String autor, CategoriaProduto categoria, String nome, String descricao, double preco, int quantidade) {
        super(categoria, nome, descricao, preco, quantidade);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Produto: Autor=" + autor +super.toString();
    }
    
}
