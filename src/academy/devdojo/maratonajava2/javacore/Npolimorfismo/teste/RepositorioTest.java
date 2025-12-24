package academy.devdojo.maratonajava2.javacore.Npolimorfismo.teste;

import academy.devdojo.maratonajava2.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava2.javacore.Npolimorfismo.servico.RepositorioArquivo;
import academy.devdojo.maratonajava2.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import academy.devdojo.maratonajava2.javacore.Npolimorfismo.servico.RepositorioMemoria;

public class RepositorioTest {
    static void main(String[] args) {
        Repositorio repositorio1 = new RepositorioBancoDeDados();
        repositorio1.salvar();

        Repositorio repositorio2 = new RepositorioMemoria();
        repositorio2.salvar();

        Repositorio repositorio3 = new RepositorioArquivo();
        repositorio3.salvar();
    }
}
