package academy.devdojo.maratonajava2.javacore.Qstring.teste;

public class StringTest02 {
    static void main(String[] args) {
        String nome = "              Frieren";
        String num = "012345";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("e", "a"));
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(num.length());
        System.out.println(num.substring(0, 3)); // 0 2 3
        System.out.println(nome.trim());
    }
}
