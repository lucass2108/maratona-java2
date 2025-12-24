package academy.devdojo.maratonajava2.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    static void main(String[] args) {
        System.out.println("Teste1");
        criarNovoArquivo();
        System.out.println("Teste2");
    }

    private static void criarNovoArquivo() {
        File file = new File("arquivo\\teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado: " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Fim");
    }
}
