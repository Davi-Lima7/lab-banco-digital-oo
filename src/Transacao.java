import java.util.Date;

/**
 * Classe que representa uma transação bancária.
 * Contém informações sobre a data, tipo e valor da transação.
 */

public class Transacao {
  private Date data; // Data da transação
  private String tipo; // Tipo de transação (Depósito, Saque, transferência)
  private double valor; // Valor da transação
  private int numeroConta; // Número da conta associada à transação

  public Transacao(Date data, String tipo, double valor, int numeroConta) {
    this.data = data;
    this.tipo = tipo;
    this.valor = valor;
    this.numeroConta = numeroConta;
  }

  public Date getData() {
    return data;
  }

  public String getTipo() {
    return tipo;
  }

  public double getValor() {
    return valor;
  }

  public int getNumeroConta() {
    return numeroConta;
  }

  @Override
  public String toString() {
    return String.format("Data: %s | Tipo: %s | Valor: %.2f | Conta: %d", data.toString(), tipo, valor, numeroConta);
  }
}
