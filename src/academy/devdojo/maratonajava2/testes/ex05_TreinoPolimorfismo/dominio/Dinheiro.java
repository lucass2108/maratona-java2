package academy.devdojo.maratonajava2.testes.ex05_TreinoPolimorfismo.dominio;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Dinheiro extends Pagamento {
    public Dinheiro(double valor) {
        super(valor);
    }

    @Override
    public void processarPagamento() {
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("Pagamento de R$" + valor + " em Dinheiro");
    }

}
