package academy.devdojo.maratonajava2.javacore.Lclassesabstratas.teste;

import academy.devdojo.maratonajava2.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava2.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest {

    //teste

    static void main(String[] args) {
        Gerente gerente = new Gerente("Tanjiro", 5000);
        System.out.println(gerente);

        Desenvolvedor desenvolvedor = new Desenvolvedor("Einsen", 12000);
        System.out.println(desenvolvedor);

        System.out.println("Teste");

    }
}
