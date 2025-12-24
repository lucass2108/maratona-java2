package academy.devdojo.maratonajava2.javacore.BintroducaoMetodos.dominio;

public class Calculadora {
    // void significa que devolve nada
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtrairDoisNumeros() {
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int num1, float num2) {
        System.out.println(num1 * num2);
    }

    // desse modo significa que devolve algo(return), nesse caso um double
    public double dividirDoisNumeros(double num1, double num2) {
        if (num2 == 0)
            return 0;
        return num1 / num2;
    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("num1 " + num1);
        System.out.println("num2 " + num2);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int i : numeros) {
            soma += i;
        }
        System.out.println(soma);
    }
}
