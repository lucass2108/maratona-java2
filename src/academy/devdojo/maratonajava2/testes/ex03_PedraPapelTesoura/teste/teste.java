package academy.devdojo.maratonajava2.testes.ex03_PedraPapelTesoura.teste;

import academy.devdojo.maratonajava2.testes.ex03_PedraPapelTesoura.dominio.PPT;
import academy.devdojo.maratonajava2.testes.ex03_PedraPapelTesoura.dominio.Sorteador;

import java.util.Scanner;

public class teste {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("###PEDRA, PAPEL & TESOURA###");

        while (continuar) {
            System.out.println("Faça sua escolha");
            String entrada = input.next();

            try {
                PPT escolha = PPT.valueOf(entrada.toUpperCase());
                Sorteador sorteador = new Sorteador(escolha);
            } catch (IllegalArgumentException e) {
                System.out.println(" ");
                System.out.println("Argumento inválido");
                System.out.println("Inciando outra jogada");

                continue;
            }

            System.out.println("Jogar novamente? (s/n)");
            String resposta = input.next();
            char p = Character.toUpperCase(resposta.charAt(0));

            if (p != 'S')
                continuar = false;
        }
        System.out.println("Programa encerrado");
    }
}
