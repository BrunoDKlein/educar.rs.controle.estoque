
package estoqueloja;

public class Eletronico extends Produto{
    private Voltagem voltagem;

    public Eletronico(Voltagem voltagem, CategoriaProduto categoria, String nome, String descricao, double preco, int quantidade) {
        super(categoria, nome, descricao, preco, quantidade);
        this.voltagem = voltagem;
    }

    public Voltagem getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(Voltagem voltagem) {
        this.voltagem = voltagem;
    }

    @Override
    public String toString() {
        return "Produto: Voltagem=" + voltagem +super.toString();
    }
    
}
