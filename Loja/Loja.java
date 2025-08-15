import java.util.ArrayList;
public class Loja {
    private String nome;
    private ArrayList<Produtos> produtos;

    public Loja(String nome, ArrayList<Produtos> produtos) {
        this.nome = nome;
        this.produtos = produtos;
    }

    public void exibirProdutos() {
        System.out.println("Produtos da loja " + nome);
        for (Produtos p : produtos) {
            System.out.println("Código: " + p.getCodigo());
            System.out.println("Nome: " + p.getNome());
            System.out.println("Preço: " + p.getPreco());
        }
    }
}
