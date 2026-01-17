package academy.devdojo.maratonajava2.javacore.Vio.teste;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("Testando write em arquivo\nteste\n");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
