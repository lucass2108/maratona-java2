package academy.devdojo.maratonajava2.testes.ex06_EnvioNotificacoes.dominio;

import academy.devdojo.maratonajava2.testes.ex06_EnvioNotificacoes.sistema.Notificacao;
import academy.devdojo.maratonajava2.testes.ex06_EnvioNotificacoes.sistema.NotificacaoException;

public class SmsNotificacao implements Notificacao {
    private String mensagem;

    public SmsNotificacao(String mensagem) {
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

        if (mensagem.length() > 20)
            throw new NotificacaoException("Número máximo de caracteres excedido");
        System.out.println("SMS enviado:<" + mensagem + ">");
        System.out.println("Enviado em " + data);
    }
}
