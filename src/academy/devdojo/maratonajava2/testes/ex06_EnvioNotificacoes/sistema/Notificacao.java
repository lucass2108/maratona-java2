package academy.devdojo.maratonajava2.testes.ex06_EnvioNotificacoes.sistema;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;

public interface Notificacao {
    public LocalDateTime data =  LocalDateTime.now();
    void enviar(String mensagem) throws NotificacaoException;
}
