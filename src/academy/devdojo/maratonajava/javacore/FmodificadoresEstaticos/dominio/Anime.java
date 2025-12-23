package academy.devdojo.maratonajava.javacore.FmodificadoresEstaticos.dominio;

public class Anime {
    private String nome;
    private static int[] eps;
    // 0- Bloco de inicializaçõa é executado quando a JVM carregar a classe
    // 1- Alocado espaço em memória para o objeto
    // 2- Cada atributo é criado e inicializado com default ou o que foi passado
    // 3- Bloco de Inicialização é executado
    // 4- Construtor é inicializado

    static {
        System.out.println("Dentro do bloco de inicialização estático 1");
        eps = new int[100];
        for (int i = 0; i < eps.length; i++) {
            eps[i] = i + 1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicialização estático 2");
    }

    static {
        System.out.println("Dentro do bloco de inicialização estático 3");
    }

    {
        System.out.println("Dentro do bloco de inicialização não estático");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        System.out.println(eps);
        for (int i : Anime.eps) {
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
