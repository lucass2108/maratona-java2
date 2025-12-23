package academy.devdojo.maratonajava2.testes.ex02_ControleDeAlunos.teste;

import academy.devdojo.maratonajava2.testes.ex02_ControleDeAlunos.dominio.Aluno;
import academy.devdojo.maratonajava2.testes.ex02_ControleDeAlunos.dominio.Sala;

public class teste {
    static void main(String[] args) {
        Aluno aluno1 = new Aluno("Lucas", 18);
        aluno1.setNotas(10, 5, 7);
        aluno1.exibirInfo();

        Aluno aluno2 = new Aluno("Yuri");
        aluno2.setNotas(0, 5, 5);
        aluno2.exibirInfo("Aluno Tranferido");

        Aluno aluno3 = new Aluno("Tryza");
        aluno3.setNotas(8, 6, 10);

        Sala sala = new Sala("3º4- Terceiro Ano Quatro");
        sala.adicionarAluno(aluno1, 0);
        sala.adicionarAluno(aluno2, 2);
        sala.adicionarAluno(aluno3, 4);

        sala.exibirAlunos();

        sala.mediaDaSala();

    }
}
