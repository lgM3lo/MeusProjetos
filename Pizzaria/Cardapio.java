public class Cardapio {
    Pizza[] pizzas;

    Cardapio(Pizza[] pizzas) {
        this.pizzas = pizzas;
    }

    void mostrarCardapio() {
        System.out.println("Cardápio:");
        for (Pizza p : pizzas) {
            p.mostrarInfo();
        }
    }
}
