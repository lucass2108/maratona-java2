package academy.devdojo.maratonajava2.javacore.EblocosInicializacao.dominio;

public class Anime {
    private String nome;
    private int[] eps;
    // 1- Alocado espaço em memória para o objeto
    // 2- Cada atributo é criado e inicializado com default ou o que foi passado
    // 3- Bloco de Inicialização é executado
    // 4- Construtor é inicializado

    {
        System.out.println("Dentro do bloco de inicialização");
        eps = new int[100];
        for (int i = 0; i < eps.length; i++) {
            eps[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        System.out.println(eps);
        for (int i : this.eps) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }

    public String getNome() {
        return nome;
    }

    public int[] getEps() {
        return eps;
    }
}
