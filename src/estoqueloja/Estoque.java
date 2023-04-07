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
public class Estoque {

    private final List<Produto> produtos;

    public Estoque() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(String nomeProduto) {
        for (Produto p : produtos) {
            if (p.getNome().equals(nomeProduto)) {
                produtos.remove(p);
                return;
            }

        }
    }

}
