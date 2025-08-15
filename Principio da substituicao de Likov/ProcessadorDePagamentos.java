public class ProcessadorDePagamentos {

    public void processar(ProcessadorPagamento conta, double valor) {
        try {
            System.out.println("--- Tentando processar pagamento de R$ " + valor + "...");
            conta.processarPagamento(valor);
            System.out.println("Pagamento concluido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}