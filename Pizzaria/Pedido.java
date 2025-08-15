public class Pedido {
    Cliente cliente;
    Pizza pizza;

    Pedido(Cliente cliente, Pizza pizza) {
        this.cliente = cliente;
        this.pizza = pizza;
    }

    void mostrarPedido() {
        System.out.println("Pedido de " + cliente.nome + ": " + pizza.nome + " - R$" + pizza.preco);
    }
}