package academy.devdojo.maratonajava2.javacore.Uregex.teste;

public class ScannerTest01 {
    static void main(String[] args) {
        String texto = "Aether, Clorinde, Sandrone, true, 200";
        String[] nomes = texto.split(",");
        for (String nome : nomes) {
            System.out.println(nome.trim());
        }
    }
}
