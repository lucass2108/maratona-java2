package academy.devdojo.maratonajava2.javacore.Vio.teste;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest01 {
    static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created " + isCreated);
            System.out.println("path " + file.getPath());
            System.out.println("path absolute " + file.getAbsolutePath());
            System.out.println("Is directory " + file.isDirectory());
            System.out.println("Is file " + file.isFile());
            System.out.println("Is hidden " + file.isHidden()); // oculto
            System.out.println("las modified " + new Date(file.lastModified()));

            boolean exists = file.exists();
            if (exists) {
                System.out.println("Deleted " + file.delete());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
