package academy.devdojo.maratonajava2.javacore.Vio.teste;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    static void main(String[] args) throws IOException {
        File fileDiretorio = new File("pasta");
        boolean isDeretorioCreated = fileDiretorio.mkdir();
        System.out.println("Pasta criada " + isDeretorioCreated);

//      File arquivoDiretorio = new File("C:\\Users\\corre\\OneDrive\\Documentos\\maratona-java2\\pasta\\arquivo.txt"); ou
        File fileArquivoDiretorio = new File(fileDiretorio, "arquivo.txt");
        boolean isFileCreated = fileArquivoDiretorio.createNewFile();
        System.out.println("File 'arquivo' criado " + isFileCreated);

        File fileRename = new File(fileDiretorio, "arquivo_renomeado.txt");
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRename);
        System.out.println("File 'arquivo' renomeado para 'arquivo_renomeado' " + isRenamed);

        File diretorioRenamed = new File("pasta2");
        boolean isDiretorioRenamed = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println("Pasta 'pasta' renomeada para 'pasta2' " + isDiretorioRenamed);
    }
}
