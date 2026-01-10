package academy.devdojo.maratonajava2.javacore.Uregex.teste;

import java.util.Scanner;

public class ScannerTest02 {
    static void main(String[] args) {
        String texto = "Aether, Clorinde, Sandrone, true, 200";
        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(", ");
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println("int " + i);
            } else if (scanner.hasNextBoolean()) {
                boolean b = scanner.nextBoolean();
                System.out.println("boolean " + b);
            } else {
                System.out.println(scanner.next());
            }
        }
    }
}
