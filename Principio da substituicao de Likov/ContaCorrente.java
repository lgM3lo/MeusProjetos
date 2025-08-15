public class ContaCorrente extends Conta {

    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void processarPagamento(double valor) {
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente para o pagamento na conta corrente.");
        } else {
            this.saldo -= valor;
            System.out.println("Pagamento de R$ " + valor + " processado com sucesso na conta corrente.");
        }
    }
}