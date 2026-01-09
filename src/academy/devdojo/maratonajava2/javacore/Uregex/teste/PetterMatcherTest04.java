package academy.devdojo.maratonajava2.javacore.Uregex.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PetterMatcherTest04 {
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
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println(texto);
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
