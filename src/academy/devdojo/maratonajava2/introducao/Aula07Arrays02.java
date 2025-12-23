package academy.devdojo.maratonajava2.introducao;

public class Aula07Arrays02 {
    static void main(String[] args) {
        // byte, short, int, long, float e double 0
        // char '\u0000'
        // boolean false
        // String null

        String[] nomes = new String[4];
        nomes[0] = "Maria";
        nomes[1] = "Lucas";
        nomes[3] = "José";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        nomes = new String[5];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i] + "n");
        }

    }
}
