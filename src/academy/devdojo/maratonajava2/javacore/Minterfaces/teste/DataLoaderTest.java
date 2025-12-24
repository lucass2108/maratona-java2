package academy.devdojo.maratonajava2.javacore.Minterfaces.teste;

import academy.devdojo.maratonajava2.javacore.Minterfaces.dominio.DataBaseLoader;
import academy.devdojo.maratonajava2.javacore.Minterfaces.dominio.DataLoader;
import academy.devdojo.maratonajava2.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest {
    static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        dataBaseLoader.load();
        fileLoader.load();

        dataBaseLoader.remove();
        fileLoader.remove();

        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        dataBaseLoader.retrieveMaxDataSize();
    }
}
