package academy.devdojo.maratonajava2.introducao;

public class Aula05EstruturasCondicionais02 {
    // idade < 15 categoria infantil
    // idade >= 15 && idade < 18 categoria juvenil
    // idade > 18 categoria adulta
    static void main(String[] args) {
        int idade = 18;
        String categoria;

        if (idade < 15) {
            System.out.println("Categoria infantil");
            categoria = "Categforia Infantil";
        } else if (idade >= 15 && idade < 18) {
            System.out.println("Categoria juvenil");
            categoria = "Categoria Juvenil";
        } else {
            System.out.println("Categoria adulta");
            categoria = "Categoria Adulta";
        }

        String categoria2;
        categoria2 = idade < 15 ? "Categoria Infantil" : idade >= idade && idade < 18 ? "Categoria Infantil" : "Categoria Adulta";

        System.out.println(categoria);
        System.out.println(categoria2);
    }
}
