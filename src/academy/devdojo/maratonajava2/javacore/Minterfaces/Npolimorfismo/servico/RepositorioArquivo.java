package academy.devdojo.maratonajava2.javacore.Minterfaces.Npolimorfismo.servico;

import academy.devdojo.maratonajava2.javacore.Minterfaces.Npolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo");
    }
}
