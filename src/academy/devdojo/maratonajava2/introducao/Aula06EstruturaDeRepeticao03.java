package academy.devdojo.maratonajava2.introducao;

public class Aula06EstruturaDeRepeticao03 {
    // Imprima os 25 primeiros números de um dado valor. Por exemplo 50
    static void main(String[] args) {
        int valormax = 50;
        for (int i = 0; i < valormax; i++) {
            if (i > 25)
                break;
            System.out.println("Número: " + i);
            System.out.println("i: " + i);
        }
    }
}
