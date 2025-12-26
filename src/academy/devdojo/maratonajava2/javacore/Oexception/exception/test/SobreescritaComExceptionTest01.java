package academy.devdojo.maratonajava2.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava2.javacore.Oexception.exception.dominio.Funcionario;
import academy.devdojo.maratonajava2.javacore.Oexception.exception.dominio.LoginInvalidoException;
import academy.devdojo.maratonajava2.javacore.Oexception.exception.dominio.Pessoa;

public class SobreescritaComExceptionTest01 {
    static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
}
