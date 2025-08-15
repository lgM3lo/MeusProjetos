public class Pizza {
    String nome;
    double preco;

    Pizza(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    void mostrarInfo() {
        System.out.println(nome + " - R$" + preco);
    }
}
