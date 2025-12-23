package academy.devdojo.maratonajava2.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = (int) 10000000000L;
        long numeroGrande = 100000;
        double salarioDouble = 2000.0D;
        float salarioFloat = 2500.0F;
        byte idadeByte = -128;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        String nome = "Lucas";

        System.out.println("A idade é " + idade + " anos");
        System.out.println(falso);
        System.out.println("char " + caractere);
        System.out.println("Oi meu nome é " + nome);
    }
}
