package academy.devdojo.maratonajava2.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava2.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em Memória");
    }
}
