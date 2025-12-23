package academy.devdojo.maratonajava2.testes.ex05_TreinoPolimorfismo.dominio;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pix extends Pagamento implements Comprovante{
    public Pix(double valor) {
        super(valor);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pix recebido de R$ " + valor);
    }

    @Override
    public void gerarComprovante() {
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("##COMPROVANTE## \n Pagamento de: R$" + valor + " \n Data: " + agora.format(formato) + " \n Meio de pagamento: PIX");
    }
}
