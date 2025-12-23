package academy.devdojo.maratonajava2.javacore.BintroducaoMetodos.teste;

import academy.devdojo.maratonajava2.javacore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest03 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.dividirDoisNumeros(20, 14);
        System.out.println(result);
    }
}
