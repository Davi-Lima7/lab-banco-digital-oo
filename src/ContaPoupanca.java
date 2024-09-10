
/**
 * Classe que representa uma conta poupança.
 * Herda da classe Conta e fornece implementação específica para a conta
 * poupança.
 */

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}
}
