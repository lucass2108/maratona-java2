package academy.devdojo.maratonajava2.javacore.BintroducaoMetodos.teste;

import academy.devdojo.maratonajava2.javacore.BintroducaoMetodos.dominio.Pessoa;

public class PessoaTest01 {
    static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jiraya");
        pessoa.setIdade(70);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
