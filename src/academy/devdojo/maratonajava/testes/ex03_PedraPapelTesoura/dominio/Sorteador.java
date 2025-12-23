package academy.devdojo.maratonajava2.testes.ex03_PedraPapelTesoura.dominio;

import java.util.Random;

public class Sorteador {
    private String nome;
    private PPT ppt;

    public Sorteador(String nome, PPT ppt) {
        this.nome = nome;
        this.ppt = ppt;

        sorteio();
    }

    private void sorteio() {
        Random random = new Random();
        int num = random.nextInt(3);
        String ppt;

        if (num == 0) {
            ppt = "TESOURA";
        } else if (num == 1) {
            ppt = "PEDRA";
        } else {
            ppt = "PAPEL";
        }

        System.out.println("você escolheu " + this.ppt);
        System.out.println("O computador escolheu " + ppt);
        if (this.ppt.name().equalsIgnoreCase(ppt)) {
            System.out.println("Empate");
        } else if (ppt == "PEDRA") {
            if (this.ppt.name().equalsIgnoreCase("TESOURA")) {
                System.out.println("Perdeu");
            } else {
                System.out.println("Ganhou");
            }
        } else if (ppt == "PAPEL") {
            if (this.ppt.name().equalsIgnoreCase("TESOURA")) {
                System.out.println("Ganhou");
            } else {
                System.out.println("Perdeu");
            }
        } else if (ppt == "TESOURA") {
            if (this.ppt.name().equalsIgnoreCase("PAPEL")) {
                System.out.println("Perdeu");
            } else {
                System.out.println("Ganhou");
            }
        } else {
            System.out.println("Errro");
        }
        System.out.println("FIM-------");
    }
}
