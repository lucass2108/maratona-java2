package academy.devdojo.maratonajava2.javacore.Qstring.teste;

public class StringBuilderTest01 {
    static void main(String[] args) {
        String nome = "Lucas Silva";
        nome.concat(" Corrêa");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder(16);
        sb.append("Lucas Silva");
        sb.append(" Corrêa").append(", \"Crakus\"");
        sb.substring(0, 5);
        sb.reverse();
        System.out.println(sb);
    }
}
