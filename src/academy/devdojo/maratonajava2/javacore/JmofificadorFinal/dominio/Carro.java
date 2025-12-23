package academy.devdojo.maratonajava2.javacore.JmofificadorFinal.dominio;

public class Carro {
    // Podemos deixar uma classe final, tornando-a inacessivel na herança
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    public final void imprimir() {
        // Podemos deixar um metodo final, deixando-o impossivel de ser sobrescrito em casos de herença
        System.out.println(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
