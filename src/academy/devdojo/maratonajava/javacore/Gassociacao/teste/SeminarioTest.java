package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.ProfessorEX;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class SeminarioTest {
    static void main(String[] args) {
        Seminario seminario01 = new Seminario("CCO na sociedade");
        Local local = new Local("UNIFEI- Universidade Federal de Itajubá");
        ProfessorEX prof = new ProfessorEX("José", "Java");
        Aluno aluno1 = new Aluno("CORRÊA, Lucas Silva", 18);
        Aluno aluno2 = new Aluno("BERNABÉ, Tryza Lavínia Vieira", 18);
        Aluno aluno3 = new Aluno("SANTOS, Ana Lívia Aparecida", 17);

        Seminario seminario02 = new Seminario("CCO no crescimento de técnologia");
        seminario02.setLocal(local);
        seminario02.setProfessorEx(prof);

        Aluno[] alunos = {aluno1, aluno2, aluno3};

        seminario01.setLocal(local);
        seminario01.setAlunos(alunos);

        aluno1.setSeminario(seminario01);
        aluno2.setSeminario(seminario01);
        aluno3.setSeminario(seminario01);
        seminario01.setProfessorEx(prof);

        Seminario[] seminarios = {seminario01, seminario02};
        prof.setSeminarios(seminarios);

        seminario01.imprime();
        System.out.println("--------------------");
        aluno1.imprime();
        System.out.println("--------------------");
        prof.imprime();
        System.out.println("--------------------");
        local.imprime();
        System.out.println("--------------------");
        seminario02.imprime();
    }
}
