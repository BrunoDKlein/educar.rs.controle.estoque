package estoqueloja;

public abstract class Produto {
    private CategoriaProduto categoria;
    private String nome;
    private String descricao;
    private double preco;
    private int quantidade;

    public Produto() {
    }

    public Produto(CategoriaProduto categoria, String nome, String descricao, double preco, int quantidade) {
        this.categoria = categoria;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public CategoriaProduto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProduto categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "categoria=" + categoria + ", nome=" + nome + ", descricao=" + descricao + ", preco=" + preco + ", quantidade=" + quantidade + "}\n";
    }
    
    
}
