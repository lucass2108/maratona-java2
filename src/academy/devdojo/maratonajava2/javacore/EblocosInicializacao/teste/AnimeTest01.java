package academy.devdojo.maratonajava2.javacore.EblocosInicializacao.teste;

import academy.devdojo.maratonajava2.javacore.EblocosInicializacao.dominio.Anime;

public class AnimeTest01 {
    static void main(String[] args) {
        Anime anime = new Anime();

        for (int ep : anime.getEps()) {
            System.out.print(ep + " ");
        }
    }
}
