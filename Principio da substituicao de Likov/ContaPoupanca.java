public class ContaPoupanca extends Conta {

    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void processarPagamento(double valor) {
        if (valor > 1000.00) {
            throw new IllegalArgumentException("Valor de pagamento excede o limite de R$ 1000 para conta poupanca.");
        }
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente para o pagamento na conta poupança.");
        } else {
            this.saldo -= valor;
            System.out.println("Pagamento de R$ " + valor + " processado com sucesso na conta poupança.");
        }
    }
}