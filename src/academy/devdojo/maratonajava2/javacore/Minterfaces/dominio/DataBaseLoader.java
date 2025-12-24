package academy.devdojo.maratonajava2.javacore.Minterfaces.dominio;

public class DataBaseLoader implements DataLoader, DataRemover {
    // private -> default -> protected -> public

    @Override
    public void load() {
        System.out.println("Carregando dados do Banco de Dados");
    }

    public void remove() {
        System.out.println("Removendo do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no banco de dados");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na DataBaseLoader");
    }
}
