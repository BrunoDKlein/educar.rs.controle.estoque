package estoqueloja;

import java.util.ArrayList;
import java.util.List;

public class EstoqueLoja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Estoque estoque = new Estoque();

        estoque.adicionarProduto(new Roupa(42, CategoriaProduto.ROUPA, "chinelo", "pra usar no pé", 30, 3));
        estoque.adicionarProduto(new Eletronico(Voltagem._110V, CategoriaProduto.ELETRÔNICO, "Geladeira", "para esfriar coisas", 5, 1));
        estoque.adicionarProduto(new Livro("Kahneman", CategoriaProduto.LIVRO, "Rápido e Devagar", "é um livro", 100, 2));
        System.out.println(estoque.produtos);
        estoque.removerProduto("Geladeira");
        System.out.println(estoque.produtos);
        
    }
    
}
