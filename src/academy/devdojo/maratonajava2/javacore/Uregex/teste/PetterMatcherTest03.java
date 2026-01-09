package academy.devdojo.maratonajava2.javacore.Uregex.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PetterMatcherTest03 {
    static void main(String[] args) {
        // \d = todos os digitos
        // \D = tudo oq nn for digito
        // \s = todos os espaçoes em branco ( \t \n \f \r)
        // \S = todos os caracteres excluindos os espaços
        // \w = a-z A-Z, digitos, _
        // \W = tudo oq nn for incluso no \w
        // []
//        String regex = "[a-zA-Z]";
        String regex = "0[xX][0-9a-fA-F]";
//        String texto = "abaaba";
        String texto2 = "12 0x 0x 0xFFAB 0x109 0x1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);

        System.out.println(texto2);
        System.out.println("texto: 0123456789");
        System.out.println("regex " + regex);
        System.out.println("Posicoes encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }

        int numeroHex = 0xDFA;
        System.out.println(numeroHex);
    }
}
