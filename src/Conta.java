import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Classe abstrata que representa uma conta bancária.
 * Implementa a interface IConta e fornece operações básicas de conta.
 */

public abstract class Conta implements IConta {

	private static final int AGENCIA_PADRAO = 1; // Agencia padrão
	private static int SEQUENCIAL = 1; // Sequencial de contas

	protected int agencia; // Número da agencia
	protected int numero; // Número da conta
	protected double saldo; // Saldo da conta
	protected Cliente cliente; // Cliente associado à conta
	protected List<Transacao> transacoes; // Lista de tansações da conta

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		this.transacoes = new ArrayList<>(); // Inicializa a lista de transações
	}

	@Override
	public void sacar(double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("Valor de saque deve ser positivo.");
		}
		if (saldo < valor) {
			throw new IllegalStateException("Saldo insuficiente.");
		}
		saldo -= valor;
		registrarTransacao("Saque", valor);
	}

	@Override
	public void depositar(double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("Valor de depósito deve ser positivo.");
		}
		saldo += valor;
		registrarTransacao("Depósito", valor);
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		registrarTransacao("Transferência", valor);
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

	public List<Transacao> getTransacoes() {
		return transacoes;
	}

	/*
	 * Registra uma transação na lista de transações da conta.
	 * String tipo O tipo da transação (Saque, Depósito, Transferência).
	 * double valor O valor da transação.
	 */

	protected void registrarTransacao(String tipo, double valor) {
		Transacao transacao = new Transacao(new Date(), tipo, valor, this.numero);
		transacoes.add(transacao);
	}

	/**
	 * Imprime informações comuns da conta.
	 */

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
