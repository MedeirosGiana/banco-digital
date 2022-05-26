
public class RodarProjeto {
    public static void main(String[] args) {
        Cliente Giana = new Cliente();
        Giana.setNome("Giana");

        Conta cc = new ContaCorrente(Giana);
        Conta poupanca = new ContaPoupanca(Giana);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
