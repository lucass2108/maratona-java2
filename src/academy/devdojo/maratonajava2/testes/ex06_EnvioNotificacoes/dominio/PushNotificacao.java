package academy.devdojo.maratonajava2.testes.ex06_EnvioNotificacoes.dominio;

import academy.devdojo.maratonajava2.testes.ex06_EnvioNotificacoes.sistema.Notificacao;
import academy.devdojo.maratonajava2.testes.ex06_EnvioNotificacoes.sistema.NotificacaoException;

public class PushNotificacao implements Notificacao {
    private String mensagem;

    public PushNotificacao(String mensagem) {
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

        System.out.println("Push enviado:<" + mensagem + ">");
        System.out.println("Enviado em " + data);
    }
}
