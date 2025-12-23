package academy.devdojo.maratonajava2.javacore.BintroducaoMetodos.teste;

import academy.devdojo.maratonajava2.javacore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoeaTest01 {
    public void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.somaDoisNumeros();
        calculadora.subtrairDoisNumeros();
        System.out.println("Finalizando CalculadoraTeste01");
    }
}
