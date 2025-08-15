public abstract class Conta implements ProcessadorPagamento {
    protected double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return this.saldo;
    }
}