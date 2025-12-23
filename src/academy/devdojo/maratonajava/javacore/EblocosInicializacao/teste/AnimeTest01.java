package academy.devdojo.maratonajava.javacore.EblocosInicializacao.teste;

import academy.devdojo.maratonajava.javacore.EblocosInicializacao.dominio.Anime;

public class AnimeTest01 {
    static void main(String[] args) {
        Anime anime = new Anime();

        for (int ep : anime.getEps()) {
            System.out.print(ep + " ");
        }
    }
}
