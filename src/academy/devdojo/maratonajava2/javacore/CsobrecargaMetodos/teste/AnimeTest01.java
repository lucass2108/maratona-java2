package academy.devdojo.maratonajava2.javacore.CsobrecargaMetodos.teste;

import academy.devdojo.maratonajava2.javacore.CsobrecargaMetodos.dominio.Anime;

public class AnimeTest01 {
    static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Sousou no Frieren", "TV", 22);
        anime.init("Sousou no Frieren", "TV", 22, "Drama");
        anime.setGenero("Drama");

        anime.imprimir();
    }
}
