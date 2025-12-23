package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;
    private ProfessorEX professorEX;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public void imprime() {
        System.out.println("Título: " + titulo);
        if (alunos == null) {
            System.out.println("Sem alunos cadastrados nesse seminário");
        } else {
            getAlunos();
        }
        if (getLocal() == null) {
            System.out.println("Sem local definido");
        } else {
            System.out.println(getLocal());
        }
        if (getProfessorEx() == null) {
            System.out.println("Sem professor orientador");
        } else {
            System.out.println("Professor Orientador: " + getProfessorEx());
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void getAlunos() {
        for (Aluno alunos : alunos) {
            System.out.println("Aluno(a): " + alunos.getNome());
        }
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getLocal() {
        return local.getEndereco();
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public String getProfessorEx() {
        return professorEX.getNome();
    }

    public void setProfessorEx(ProfessorEX professorEx) {
        this.professorEX = professorEx;
    }
}
