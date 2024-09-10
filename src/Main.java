
/**
 * Classe principal que executa o programa.
 * Cria clientes e contas, realiza operações e gera relatórios.
 */

public class Main {

	public static void main(String[] args) {
		Cliente davi = new Cliente();
		davi.setNome("Davi");

		Conta cc = new ContaCorrente(davi);
		Conta poupanca = new ContaPoupanca(davi);

		cc.depositar(100);
		cc.transferir(50, poupanca);
		cc.sacar(20);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		// Gera o relatório de todas as transações da conta corrente
		Relatorio.gerarRelatorio(cc.getTransacoes());

		// Gera o relatório de transações apenas de depósitos
		Relatorio.gerarRelatorioPorTipo(cc.getTransacoes(), "Saque");
	}
}
