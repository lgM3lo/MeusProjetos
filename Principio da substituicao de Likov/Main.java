public class Main {
    public static void main(String[] args) {
        ProcessadorDePagamentos processador = new ProcessadorDePagamentos();

        System.out.println("--- Testando ContaCorrente ---");
        ContaCorrente contaCorrente = new ContaCorrente(2500.00);
        processador.processar(contaCorrente, 1500.00);
        System.out.println("Saldo da Conta Corrente apos o pagamnto: R$ " + contaCorrente.getSaldo());

        System.out.println("\n--- Testando ContaPoupanca ---");
        ContaPoupanca contaPoupanca = new ContaPoupanca(1500.00);
        processador.processar(contaPoupanca, 500.00);
        System.out.println("Saldo da conta poupança apos o pagamento: R$ " + contaPoupanca.getSaldo());

        System.out.println("\n--- Testando o limite de R$ 1000 da conta poupanca ---");
        processador.processar(contaPoupanca, 1200.00);
    }
}