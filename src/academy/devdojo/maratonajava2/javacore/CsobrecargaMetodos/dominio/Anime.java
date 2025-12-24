package academy.devdojo.maratonajava2.javacore.CsobrecargaMetodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int eps;
    private String genero;

    public void init(String nome, String tipo, int eps) {
        this.nome = nome;
        this.tipo = tipo;
        this.eps = eps;
    }

    public void init(String nome, String tipo, int eps, String genero) {
        this.init(nome, tipo, eps);
        this.genero = genero;
    }

    public void imprimir() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.eps);
        System.out.println(this.genero);
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
