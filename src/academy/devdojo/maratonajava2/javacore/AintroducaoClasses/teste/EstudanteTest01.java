package academy.devdojo.maratonajava2.javacore.AintroducaoClasses.teste;

import academy.devdojo.maratonajava2.javacore.AintroducaoClasses.dominio.Estudante;

public class EstudanteTest01 {
    public void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Lucas";
        estudante.idade = 18;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante);
    }
}
