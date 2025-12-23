package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    static void main(String[] args) {
        Professor professor1 = new Professor("Big Boy");
        Professor professor2 = new Professor("Mônica");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("EENSL - Ginásio", professores);

        escola.imprime();

    }
}
