package academy.devdojo.maratonajava2.testes.ex05_TreinoPolimorfismo.teste;

import academy.devdojo.maratonajava2.testes.ex05_TreinoPolimorfismo.dominio.CartaoCredito;
import academy.devdojo.maratonajava2.testes.ex05_TreinoPolimorfismo.dominio.Dinheiro;
import academy.devdojo.maratonajava2.testes.ex05_TreinoPolimorfismo.dominio.Pagamento;
import academy.devdojo.maratonajava2.testes.ex05_TreinoPolimorfismo.dominio.Pix;
import academy.devdojo.maratonajava2.testes.ex05_TreinoPolimorfismo.sistema.SistemaPagamento;

public class PagamentoTest {
    static void main(String[] args) {
        Pagamento pagamento1 = new CartaoCredito(152.36);
        Pagamento pagamento2 = new Pix(85);
        Pagamento pagamento3 = new Dinheiro(14.55);

        SistemaPagamento.efetuarPagamento(pagamento1);
        System.out.println("--------------------");
        SistemaPagamento.efetuarPagamento(pagamento2);
        System.out.println("--------------------");
        SistemaPagamento.efetuarPagamento(pagamento3);
    }
}
