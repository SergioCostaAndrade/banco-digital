public interface IConta {
    void depositar(double valor);
    void sacar(double valor);

    void imprimirExtrato();

    void transferir(double valor, Conta contaDestino);

    void imprimirExtratoConta();
}
