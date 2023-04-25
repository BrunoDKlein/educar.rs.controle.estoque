package estoqueloja;

import java.util.ArrayList;
import java.util.List;

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
