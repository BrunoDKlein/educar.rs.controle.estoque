/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoqueloja;

/**
 *
 * @author Mauri
 */
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
