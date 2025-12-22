package academy.devdojo.maratonajava2.javacore.Minterfaces.Npolimorfismo.teste;

import academy.devdojo.maratonajava2.javacore.Minterfaces.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava2.javacore.Minterfaces.Npolimorfismo.servico.RepositorioArquivo;
import academy.devdojo.maratonajava2.javacore.Minterfaces.Npolimorfismo.servico.RepositorioBancoDeDados;
import academy.devdojo.maratonajava2.javacore.Minterfaces.Npolimorfismo.servico.RepositorioMemoria;

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
