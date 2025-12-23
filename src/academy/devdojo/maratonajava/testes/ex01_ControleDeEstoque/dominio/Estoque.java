package academy.devdojo.maratonajava2.testes.ex01_ControleDeEstoque.dominio;

public class Estoque {
    private int[][] produtos = new int[5][1];

    public void estocar(int[] p, int pos) {
        if (pos >= 0 && pos <= 5) {
            produtos[pos] = p;
            System.out.println("Estocado com sucesso");
        } else {
            System.out.println("Posição inválida");
        }
        System.out.println("--------");
    }

    public void listar() {
        System.out.println("Produtos em estoque:");
        int item = 1;
        for (int[] arrayBase : produtos) {
            System.out.print("Produto " + item + ": ");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
            item++;
            System.out.println(" ");
        }
        System.out.println("\n-----------");
    }

    public void total() {
        int soma = 0;
        for (int[] i : produtos) {
            for (int num : i) {
                soma += num;
            }
        }
        System.out.println("O total de item em estoque é " + soma);
    }
}
