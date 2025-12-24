package academy.devdojo.maratonajava2.javacore.Gassociacao.dominio;

public class ProfessorEX {
    private String nome;
    private String especializacao;
    private Seminario[] seminarios;

    public ProfessorEX(String nome, String especializacao) {
        this.nome = nome;
        this.especializacao = especializacao;
    }

    public void imprime(){
        System.out.println("Nome: " + nome);
        System.out.println("Especialista em: " + especializacao);
        System.out.print("Ministrando os seminários: ");
        for (Seminario seminario : seminarios){
            System.out.print(seminario.getTitulo() + " ");
        }
        System.out.println(" ");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
