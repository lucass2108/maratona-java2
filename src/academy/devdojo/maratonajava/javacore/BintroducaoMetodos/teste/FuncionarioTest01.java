package academy.devdojo.maratonajava2.javacore.BintroducaoMetodos.teste;

import academy.devdojo.maratonajava2.javacore.BintroducaoMetodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("José");
        funcionario.setIdade(43);
        funcionario.setSalarios(new double[]{2518.45, 2416.98, 1948.75, 2000});

        funcionario.imprimir();
    }
}
