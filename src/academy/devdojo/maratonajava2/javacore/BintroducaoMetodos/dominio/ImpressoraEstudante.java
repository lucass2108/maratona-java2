package academy.devdojo.maratonajava2.javacore.BintroducaoMetodos.dominio;

public class ImpressoraEstudante {
    public void imprimeEstudante(Estudante estudante) {

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        System.out.println("-----------");

        estudante.nome = "Gohan";
    }
}
