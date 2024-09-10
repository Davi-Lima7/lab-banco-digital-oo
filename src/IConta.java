
/**
 * Interface que define as operações básicas para uma conta bancária.
 */

public interface IConta {

	void sacar(double valor);

	void depositar(double valor);

	void transferir(double valor, IConta contaDestino);

	void imprimirExtrato();
}
