package academy.devdojo.maratonajava2.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava2.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava2.javacore.Gassociacao.dominio.Time;

public class Jogadortest02 {
    static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");
        jogador1.setTime(time);
        jogador1.imprime();
    }
}
