public class Pizzaria {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("Mussarela", 25.0);
        Pizza p2 = new Pizza("Calabresa", 30.0);
        Pizza p3 = new Pizza("Frango", 35.0);
        Pizza[] listaPizzas = {p1, p2, p3};
        Cardapio cardapio = new Cardapio(listaPizzas);
        cardapio.mostrarCardapio();
        Cliente cliente = new Cliente("Joao");
        Pedido pedido = new Pedido(cliente, p2);
        pedido.mostrarPedido();
    }
}