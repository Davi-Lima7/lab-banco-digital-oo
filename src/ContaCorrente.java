
/**
 * Classe que representa uma conta corrente.
 * Herda da classe Conta e fornece implementação específica para a conta
 * corrente.
 */

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}

}
