package academy.devdojo.maratonajava2.javacore.Uregex.teste;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PetterMatcherTest05 {
    static void main(String[] args) {
        // \d = todos os digitos
        // \D = tudo oq nn for digito
        // \s = todos os espaçoes em branco ( \t \n \f \r)
        // \S = todos os caracteres excluindos os espaços
        // \w = a-z A-Z, digitos, _
        // \W = tudo oq nn for incluso no \w
        // []
        // ? Zero ou ums
        // * zero ou mais
        // + uma ou mais
        // {n,m} de n até m
        // () agrupamento
        // | a(v|c)o ovo/oco
        // $ fim da linha
        // . 1.3 caractere coringa
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "frieren@hotmail.com, 123tanjiro@gmail.com, #@!kaguya@mail.br, teste@gmail.com.br, fern@mail";
        System.out.print("Email válido: ");
        System.out.println("#@!kaguya@mail.br".matches(regex));
        System.out.println(Arrays.toString(texto.split(",")));
        System.out.println(texto.split(",")[1].trim());

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println(texto);
        System.out.println("texto: 0123456789");
        System.out.println("regex " + regex);
        System.out.println("Posicoes encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
