//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Banco banorte = new Banco("Banorte","11111111111111", "Rua José Bonifácio");
        System.out.println(banorte);

        Cliente sergio = new Cliente("Sergio","88899977700");
        Conta contacorrente1 = new ContaCorrente(sergio);
        sergio.adicionaContaCliente(contacorrente1);
        contacorrente1.depositar(100.00);
        contacorrente1.sacar(20.00);

        Conta contacorrente2 = new ContaPoupanca(sergio);
        sergio.adicionaContaCliente(contacorrente2);
        contacorrente1.transferir(30.00,contacorrente2);


        Cliente karla = new Cliente("Karla","88899977700");
        Conta contacorrente3 = new ContaCorrente(karla);
        karla.adicionaContaCliente(contacorrente3);

        contacorrente2.transferir(30,contacorrente3);
        contacorrente1.imprimirExtrato();
        contacorrente2.imprimirExtrato();
        contacorrente3.imprimirExtrato();
        System.out.println(sergio.imprimeList());
        System.out.println(karla.imprimeList());




    }
}