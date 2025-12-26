package academy.devdojo.maratonajava2.testes.ex07_isPrimo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimoTest {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isPrimo = true;
        int num = 0;

        System.out.println("Digite o número: ");
        try {
            num = scanner.nextInt();
            if (num <= 0) {
                throw new InputMismatchException();
            }

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0){
                    isPrimo= false;
                    break;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Inválido");
        }

        if (isPrimo){
            System.out.println("O número " + num + " é primo");
        } else {
            System.out.println("O número " + num + " não é primo");
        }
    }
}
