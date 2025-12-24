package academy.devdojo.maratonajava2.testes.ex01_ControleDeEstoque.dominio;

public class Produto {
    private String nome;
    private double preco;
    private int[] quantidade = new int[3];

    {
        System.out.println("Produto Criado");
    }

    public Produto() {

    }

    public Produto(String nome) {
        this.nome = nome;
    }

    public Produto(String nome, double preco) {
        this(nome);
        this.preco = preco;
    }

    public void calcularTotal() {
        int soma = 0;
        for (int i : quantidade) {
            soma += i;
        }
        System.out.println(soma);
    }

    public void exibirInfo() {
        System.out.println("Informações");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.print("Quantidades: ");
        for (int i : quantidade) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.print("Total de itens desse produto é: ");
        calcularTotal();
        System.out.println("-----------");
    }


    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setQuantidade(int x) {
        quantidade[0] = x;
    }

    public void setQuantidade(int x, int y) {
        setQuantidade(x);
        quantidade[1] = y;
    }

    public void setQuantidade(int x, int y, int z) {
        setQuantidade(x, y);
        quantidade[2] = z;
    }

    public int[] getQuantidade() {
        return quantidade;
    }
}
