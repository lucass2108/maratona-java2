package academy.devdojo.maratonajava2.javacore.Npolimorfismo.teste;

import academy.devdojo.maratonajava2.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava2.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava2.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava2.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    static void main(String[] args) {
        Computador computador = new Computador("Galaxy Book 2", 2458);
        Tomate tomate = new Tomate("Cereja", 5);
        Televisao televisao = new Televisao("LG 52\"", 2500);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("---------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("---------------------------");
        CalculadoraImposto.calcularImposto(televisao);

    }
}
