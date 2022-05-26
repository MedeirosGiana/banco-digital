//Classe mãe ou Super Classe

public  abstract class Conta implements IConta{

    private static final int Agencia_Padrao = 1;
    private static  int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;


    public Conta(Cliente cliente) {
        this.agencia = Conta.Agencia_Padrao;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;

    }

    @Override
    public void sacar(double Valor) {
        saldo -= Valor;
    }

    @Override
    public void depositar(double Valor) {
        saldo += Valor;
    }

    @Override
    public void transferir(double Valor, Conta contaDestino) {
        this.sacar(Valor);
        contaDestino.depositar(Valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }


    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    protected void imprimirinfcomuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
