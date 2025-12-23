package academy.devdojo.maratonajava2.javacore.Gassociacao.dominio;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void imprime() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Trabalhando em: " + seminario.getTitulo());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSeminario() {
        return seminario.getTitulo();
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
