/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoqueloja;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mauri
 */
public class EstoqueLoja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List <Produto> produtos=new ArrayList<>();
        
        produtos.add(new Roupa(42, CategoriaProduto.ROUPA, "chinelo", "pra usar no pé", 30, 3));
        produtos.add(new Eletronico(Voltagem._110V, CategoriaProduto.ELETRÔNICO, "Geladeira", "para esfriar coisas", 5, 1));
        produtos.add(new Livro("Kahneman", CategoriaProduto.LIVRO, "Rápido e Devagar", "é um livro", 100, 2));
        
        System.out.println(produtos);
    }
    
}
