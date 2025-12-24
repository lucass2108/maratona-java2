package academy.devdojo.maratonajava2.javacore.Gassociacao.teste;

import java.util.Scanner;

public class LeituraDoTeclado {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("O grande software de previsão do futuro");
        System.out.println("Digite sua pergunta e eu responderei sim ou não");

        String pergunta = input.nextLine();

        if (pergunta.charAt(0) == ' ') {
            System.out.println("Sim");
        } else if (pergunta.charAt(0) == 'V') {
            System.out.println("Sim");
        } else if (pergunta.charAt(0) == 'S') {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }
    }
}
