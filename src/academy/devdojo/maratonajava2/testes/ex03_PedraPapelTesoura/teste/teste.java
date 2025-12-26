package academy.devdojo.maratonajava2.testes.ex03_PedraPapelTesoura.teste;

import academy.devdojo.maratonajava2.testes.ex03_PedraPapelTesoura.dominio.PPT;
import academy.devdojo.maratonajava2.testes.ex03_PedraPapelTesoura.dominio.Sorteador;

import java.util.Scanner;

public class teste {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            try {
                System.out.println("Faça sua escolha");
                String entrada = input.next();
                PPT escolha = PPT.valueOf(entrada.toUpperCase());
                Sorteador sorteador = new Sorteador("Lucas", escolha);
            } catch (IllegalArgumentException e){
                System.out.println("Argumento inválido");
                System.out.println("Pulando jogada");
            }
        }
    }
}
