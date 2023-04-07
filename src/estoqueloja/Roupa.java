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
public class Roupa extends Produto {
    private int tamanho;

    public Roupa() {
    }
    

    public Roupa(int tamanho, CategoriaProduto categoria, String nome, String descricao, double preco, int quantidade) {
        super(categoria, nome, descricao, preco, quantidade);
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Produto: tamanho=" + tamanho +super.toString();

        
    }
    
}
