/*interface é uma classe abstrata com todos
 os métodos abstratos,onde obriga
 todos que a implementa respeitar seu contrato.
*/

public interface IConta {

     void sacar (double Valor);
     void depositar(double Valor);
     void transferir(double Valor, Conta contaDestino) ;
     void imprimirExtrato();
}
