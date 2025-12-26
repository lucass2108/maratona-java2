package academy.devdojo.maratonajava2.testes.ex06_EnvioNotificacoes.teste;

import academy.devdojo.maratonajava2.testes.ex06_EnvioNotificacoes.dominio.*;

import java.util.Scanner;

public class teste {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite sua mensagem: ");
        String mensagem = input.nextLine();

        System.out.println("Qual tipo de notificação? (EMAIL, SMS ou PUSH)");
        String tipo = input.next();

        try {
            TipoNotificacao tipoNotificacao = TipoNotificacao.valueOf(tipo.toUpperCase());

            if (tipoNotificacao == TipoNotificacao.EMAIL) {
                EmailNotificacao emailNotificacao = new EmailNotificacao(mensagem);
            }

            if (tipoNotificacao == TipoNotificacao.SMS) {
                SmsNotificacao smsNotificacao = new SmsNotificacao(mensagem);
            }

            if (tipoNotificacao == TipoNotificacao.PUSH){
                PushNotificacao pushNotificacao = new PushNotificacao(mensagem);
            }


        } catch (IllegalArgumentException e) {
            System.out.println("Tipo de notificação inválido");
            System.out.println("Tipo de notificaçõa inválido, tente novamente");
            e.printStackTrace();
        }

    }
}
