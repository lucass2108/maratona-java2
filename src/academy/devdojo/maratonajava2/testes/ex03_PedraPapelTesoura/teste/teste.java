package academy.devdojo.maratonajava2.testes.ex03_PedraPapelTesoura.teste;

import academy.devdojo.maratonajava2.testes.ex03_PedraPapelTesoura.dominio.PPT;
import academy.devdojo.maratonajava2.testes.ex03_PedraPapelTesoura.dominio.Sorteador;

import java.util.Scanner;

public class teste {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Faça sua escolha");
            String entrada = input.nextLine();
            PPT escolha = PPT.valueOf(entrada.toUpperCase());
            Sorteador sorteador = new Sorteador("Lucas", escolha);
        }
    }
}
