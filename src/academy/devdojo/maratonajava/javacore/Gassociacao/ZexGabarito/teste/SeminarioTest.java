package academy.devdojo.maratonajava.javacore.Gassociacao.ZexGabarito.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.ZexGabarito.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.ZexGabarito.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.ZexGabarito.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.ZexGabarito.dominio.Seminario;

public class SeminarioTest {
    static void main(String[] args) {
        Local local = new Local("UNIFEI- Universidade Federal de Itajubá");
        Aluno aluno1 = new Aluno("CORRÊA, Lucas Silva", 18);
        Aluno aluno2 = new Aluno("BERNABÉ, Tryza Lavinia Viera", 18);
        Professor professor = new Professor("Carlos", "JAVA");
        Aluno[] alunos = {aluno1, aluno2};

        Seminario seminario1 = new Seminario("CCO em sociedade", alunos, local);

        Seminario[] seminarios = {seminario1};

        professor.setSeminarios(seminarios);

        professor.imprimir();
    }
}
