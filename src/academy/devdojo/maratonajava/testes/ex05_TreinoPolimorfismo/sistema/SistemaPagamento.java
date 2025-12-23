package academy.devdojo.maratonajava2.testes.ex05_TreinoPolimorfismo.sistema;

import academy.devdojo.maratonajava2.testes.ex05_TreinoPolimorfismo.dominio.Comprovante;
import academy.devdojo.maratonajava2.testes.ex05_TreinoPolimorfismo.dominio.Pagamento;

public class SistemaPagamento {
    public static void efetuarPagamento(Pagamento pagamento) {
        pagamento.processarPagamento();
        if (pagamento instanceof Comprovante)
            ((Comprovante) pagamento).gerarComprovante();
    }
}
