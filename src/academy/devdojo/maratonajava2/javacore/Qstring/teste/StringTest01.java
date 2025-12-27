package academy.devdojo.maratonajava2.javacore.Qstring.teste;

public class StringTest01 {
    static void main(String[] args) {
        String nome = "Lucas"; // String constant pool
        String nome2 = "Lucas";
        nome = nome.concat(" Silva");
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Lucas");
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());

        //Strings são imutaveis
    }
}
