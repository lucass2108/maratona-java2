package academy.devdojo.maratonajava2.testes.ex01_ControleDeEstoque.teste;

import academy.devdojo.maratonajava2.testes.ex01_ControleDeEstoque.dominio.Estoque;
import academy.devdojo.maratonajava2.testes.ex01_ControleDeEstoque.dominio.Produto;

public class ProdutoTest {
    static void main(String[] args) {
        Estoque estoque = new Estoque();

        Produto produto = new Produto("Bolacha", 3.25);
        produto.setQuantidade(10, 20, 30);
        produto.exibirInfo();

        estoque.estocar(produto.getQuantidade(), 0);

        Produto produto2 = new Produto("Macarrão");
        produto2.setQuantidade(20, 90);
        produto2.exibirInfo();

        estoque.estocar(produto2.getQuantidade(), 1);

        Produto produto3 = new Produto("Maisena", 9.48);
        produto3.setQuantidade(3);
        produto3.exibirInfo();

        estoque.estocar(produto3.getQuantidade(), 2);

        Produto produto4 = new Produto("Panetone");
        produto4.setQuantidade(50, 38, 41);
        produto4.exibirInfo();

        estoque.estocar(produto4.getQuantidade(), 2);

        estoque.listar();
        estoque.total();

    }
}
