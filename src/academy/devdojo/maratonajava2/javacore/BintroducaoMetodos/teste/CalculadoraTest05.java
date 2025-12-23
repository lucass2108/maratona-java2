package academy.devdojo.maratonajava2.javacore.BintroducaoMetodos.teste;

import academy.devdojo.maratonajava2.javacore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest05 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1, 2, 3, 4, 5};
        calculadora.somaArray(numeros);

        System.out.println("-------");

        calculadora.somaVarArgs(numeros);
        calculadora.somaVarArgs(1, 2, 3, 4, 5, 6, 7);

    }
}
