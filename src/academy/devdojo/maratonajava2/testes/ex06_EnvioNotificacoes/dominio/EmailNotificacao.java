package academy.devdojo.maratonajava2.testes.ex06_EnvioNotificacoes.dominio;

import academy.devdojo.maratonajava2.testes.ex06_EnvioNotificacoes.sistema.Notificacao;
import academy.devdojo.maratonajava2.testes.ex06_EnvioNotificacoes.sistema.NotificacaoException;

public class EmailNotificacao implements Notificacao {
    private String mensagem;

    public EmailNotificacao(String mensagem) {
        this.mensagem = mensagem;
        try {
            enviar(mensagem);
        } catch (NotificacaoException e){
            e.printStackTrace();
        }
    }

    @Override
    public void enviar(String mensagem) throws NotificacaoException {
        mensagem = this.mensagem;
        if (mensagem.length() < 5)
            throw new NotificacaoException("Número de caracteres mínimos é 5");
        System.out.println("Email enviado: <" + mensagem + ">");
        System.out.println("Enviado em " + data);
    }
}
