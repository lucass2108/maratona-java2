package academy.devdojo.maratonajava2.testes.ex02_ControleDeAlunos.dominio;

public class Sala {
    private String turma;

    public Sala(String turma) {
        this.turma = turma;
    }

    private Aluno[] alunos = new Aluno[5];

    public void adicionarAluno(Aluno aluno, int pos) {
        if (pos < 0 || pos > 4) {
            System.out.println("Posição inválida");
            return;
        }
        if (aluno.getNome() == null) {
            System.out.println("Para adicionar um aluno ele deve ter um nome");
            return;
        }
        alunos[pos] = aluno;
    }

    public void exibirAlunos() {
        System.out.println("Alunos da turma");
        for (Aluno estudante : alunos) {
            if (estudante == null)
                continue;
            ;
            if (estudante.getNome() == null) {
                continue;
            }
            System.out.println("Nome do(a) aluno(a): " + estudante.getNome());
        }
    }

    public void mediaDaSala() {
        double soma = 0;
        int quant = 0;
        for (Aluno estudante : alunos) {
            if (estudante == null)
                continue;
            quant += 3;
            for (double notas : estudante.getNotas()) {
                soma += notas;
            }
        }
        System.out.println("Média da sala é: " + (soma / quant));
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
}
