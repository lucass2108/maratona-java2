package academy.devdojo.maratonajava2.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    static void main(String[] args) {
        divisao(1, 0);
        System.out.println("Código finalizado");
    }

    /**
     *
     * @param a
     * @param b não pode ser zero
     * @return
     * @throws IllegalArgumentException caso b seja 0
     */

    private static int divisao(int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento ilegal, divisor não pode ser zero");
        }
        return a / b;
    }
}
