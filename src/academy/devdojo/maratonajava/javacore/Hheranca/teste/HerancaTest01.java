package academy.devdojo.maratonajava.javacore.Hheranca.teste;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("37517-000");

        Pessoa pessoa = new Pessoa("Lucas");
        pessoa.setCpf("128.554.386-67");
        pessoa.setEndereco(endereco);

        pessoa.imprimir();

        System.out.println("-------------");

        Funcionario funcionario = new Funcionario("Crakus");
        funcionario.setCpf("111.222.333-44");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(3562.78);

        funcionario.imprimir();
        funcionario.relatorioDePagamento();
    }
}
