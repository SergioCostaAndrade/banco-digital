public abstract class Conta implements IConta{
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    private int agencia;
    private int numero;
    private Cliente cliente;
    private double limite;
    private double saldo;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.saldo = 0;
        this.limite = 0;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depositar - Saldo atualizado: R$" + this.saldo);
    }

    @Override
    public void sacar(double valor) {
        if ((this.saldo + this.limite) >= valor) {
            this.saldo -= valor;
            System.out.println("Sacar - Saldo atualizado: R$" + this.saldo);
        } else System.out.println("Saldo insuficiente");
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if ((this.saldo + this.limite) >= valor) {
            this.saldo -= valor;
            contaDestino.saldo += valor;
            System.out.println("Transferir - Saldo atualizado: R$" + this.saldo);
        } else System.out.println("Saldo insuficiente");
    }

    @Override
    public void imprimirExtratoConta() {
            System.out.println(String.format("Titular: %s", this.cliente.getNome()));
            System.out.println(String.format("Agencia: %d", this.agencia));
            System.out.println(String.format("Numero: %d", this.numero));
            System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", cliente=" + cliente +
                ", limite=" + limite +
                ", saldo=" + saldo +
                '}';
    }
}
