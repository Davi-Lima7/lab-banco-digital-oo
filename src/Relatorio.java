import java.util.List;

/**
 * Classe que gera relatórios de transações.
 * Permite gerar um relatório completo ou filtrado por tipo de transação.
 */

public class Relatorio {

  /**
   * Gera um relatório completo de todas as transações.
   * List transacoes A lista de transações a ser incluída no relatório.
   */

  public static void gerarRelatorio(List<Transacao> transacoes) {
    System.out.println("=== Relatório de Transações ===");
    for (Transacao transacao : transacoes) {
      System.out.println(transacao.toString());
    }
  }

  /**
   * Gera um relatório de transações filtrado por tipo.
   * List transacoes A lista de transações a ser filtrada.
   * String tipo O tipo de transação a ser incluído no relatório (Depósito, Saque,
   * etc.).
   */

  public static void gerarRelatorioPorTipo(List<Transacao> transacoes, String tipo) {
    System.out.println("=== Relatório de Transações - Tipo: " + tipo + " ===");
    for (Transacao transacao : transacoes) {
      if (transacao.getTipo().equals(tipo)) {
        System.out.println(transacao.toString());
      }
    }
  }
}
