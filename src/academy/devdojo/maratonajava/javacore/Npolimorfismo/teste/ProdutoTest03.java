package academy.devdojo.maratonajava2.javacore.Npolimorfismo.teste;

import academy.devdojo.maratonajava2.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava2.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava2.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava2.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    static void main(String[] args) {
        Produto produto = new Computador("Galaxy Book 4", 3500);

        System.out.println("------------------------");

        Tomate tomate = new Tomate("Vermelho", 6);
        tomate.setDataValidade("01/01/2026");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("---------------------");
        CalculadoraImposto.calcularImposto(produto);
    }
}
