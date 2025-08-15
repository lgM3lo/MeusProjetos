import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;
import java.util.List;

public class TesteLoja {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        ArrayList<Produtos> produtos = new ArrayList<>();
        System.out.println("Quantos produtos essa loja tem?");
        int qtdProdutos = prompt.nextInt();
        for (int i = 0; i < qtdProdutos; i++) {
            System.out.print("Digite o código do produto " + (i + 1) + " :");
            int codigo = prompt.nextInt();
            System.out.print("Digite o nome do produto " + (i + 1) + " :");
            String nome = prompt.next();
            System.out.print("Digite o preço do produto " + (i + 1) + " :");
            double preco = prompt.nextDouble();
            produtos.add(new Produtos(codigo, nome, preco));
        }
        Loja loja = new Loja("Mercadinho do Zeca Urubu, " +
                "Picapau não é bem vindo", produtos);
        for (Produtos produtos1 : produtos) {
            System.out.println(produtos);
        }
        loja.exibirProdutos();
    }
}
