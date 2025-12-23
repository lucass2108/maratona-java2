package academy.devdojo.maratonajava2.introducao;

public class Aula06EstruturaDeRepeticao02 {
    static void main(String[] args) {
        //Imprima todos os números pares de 0 até 100.000

        for (int i = 0; i <= 1000000; i++) {
            int resto = i % 2;
            if (resto == 0) {
                System.out.println("Número: " + i);
            }
        }
    }
}
