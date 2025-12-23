package academy.devdojo.maratonajava2.introducao;

public class Aula05EstruturasCondicionais06 {
    //Dados valores de 1 a 7, imptima se é dia útil ou final de semana
    //Considerando 1 como Domingo

    static void main(String[] args) {
        byte dia = 1;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Dia inválido");
        }

        // Agora tem esse jeito tbm

        switch (dia) {
            case 1, 7 -> System.out.println("Fim de semana"); // pode ser : e break tbm
            case 2, 3, 4, 5, 6 -> System.out.println("Dia útil");
            default -> System.out.println("Opção inválida");
        }
    }
}
