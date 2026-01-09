package academy.devdojo.maratonajava2.javacore.Uregex.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PetterMatcherTest02 {
    static void main(String[] args) {
        // \d = todos os digitos
        // \D = tudo oq nn for digito
        // \s = todos os espaçoes em branco ( \t \n \f \r)
        // \S = todos os caracteres excluindos os espaços
        // \w = a-z A-Z, digitos, _
        // \W = tudo oq nn for incluso no \w
        String regex = "\\W";
//        String texto = "abaaba";
        String texto2 = "#@b 511_9r\td1B\r65g4d\f9";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);

        System.out.println(texto2);
        System.out.println("texto: 0123456789");
        System.out.println("regex " + regex);
        System.out.println("Posicoes encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
