package academy.devdojo.maratonajava2.javacore.Minterfaces.Npolimorfismo.servico;

import academy.devdojo.maratonajava2.javacore.Minterfaces.Npolimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no Banco de Dados");
    }
}
