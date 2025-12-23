package academy.devdojo.maratonajava2.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 10;
        boolean isAutorizado = idade >= 18;
        if (isAutorizado) {
            System.out.println("Pode comprar");
        }

        if (!isAutorizado) {
            System.out.println("Não pode comprar");
        }

        if (isAutorizado != false) {
            System.out.println("Pode 2");
        } else {
            System.out.println("Não pode 2");
        }

        System.out.println("Fora do if");
    }
}
