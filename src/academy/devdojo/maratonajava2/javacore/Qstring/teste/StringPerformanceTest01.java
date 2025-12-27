package academy.devdojo.maratonajava2.javacore.Qstring.teste;

public class StringPerformanceTest01 {
    static void main(String[] args) {

        long inicio = System.currentTimeMillis();
        concaString(100000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concaStringBuiler(1000000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuilder: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concaStringBuffer(1000000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuffer: " + (fim - inicio) + "ms");
    }

    private static void concaString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;

        }
    }

    private static void concaStringBuiler(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);

        }
    }

    private static void concaStringBuffer(int tamanho) {
        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);

        }
    }
}
