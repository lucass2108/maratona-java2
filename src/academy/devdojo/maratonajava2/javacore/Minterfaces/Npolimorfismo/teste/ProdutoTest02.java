package academy.devdojo.maratonajava2.javacore.Minterfaces.Npolimorfismo.teste;

import academy.devdojo.maratonajava2.javacore.Minterfaces.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava2.javacore.Minterfaces.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava2.javacore.Minterfaces.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    static void main(String[] args) {
        Produto produto = new Computador("Galaxy Book 4", 3500);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());

        System.out.println("------------------------");

        Produto produto2 = new Tomate("Vermelho", 6);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
    }
}
