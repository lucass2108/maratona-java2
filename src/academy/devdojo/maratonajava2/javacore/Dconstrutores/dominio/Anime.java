package academy.devdojo.maratonajava2.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int eps;
    private String genero;
    private String estudio;

    /**
     * O this na sobrecarga de de construtores referência ao construtor que se assemelha a ele.
     * Por Exemplo, o this(), no primeiro construtor, não tem referencia, o que significa que ele foi buscar o construror
     * que, assim como ele, não tem referncias, no caso o último.
     * Já o this(nome, tipo, eps, genero), tinha estas referencias, o que o levou a buscar o primeiro this.
     * Essa busca usa como ref o número e tipo de variáveis e se nn bater nn funciona
     */

    public Anime(String nome, String tipo, int eps, String genero) {
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.eps = eps;
        this.genero = genero;
    }

    public Anime(String nome, String tipo, int eps, String genero, String estudio) {
        this(nome, tipo, eps, genero);
        this.estudio = estudio;
    }

    public Anime() {
        System.out.println("Dentro do construtor sem argumemtos");
    }

    public void imprimir() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.eps);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEps() {
        return eps;
    }

    public void setEps(int eps) {
        this.eps = eps;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
