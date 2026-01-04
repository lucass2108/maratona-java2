package academy.devdojo.maratonajava2.javacore.Sformatacao.teste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormaterTest01 {
    static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String format1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String format2 = date.format(DateTimeFormatter.ISO_DATE);
        String format3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(format1);
        System.out.println(format2);
        System.out.println(format3);
        LocalDate parse1 = LocalDate.parse("20260105", DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(parse1);
        LocalDateTime now = LocalDateTime.now();
        String format4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(format4);
        LocalDateTime parse2 = LocalDateTime.parse("2026-01-04T11:56:14.7218575", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse2);
        DateTimeFormatter formatBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatted = LocalDate.now().format(formatBR);
        System.out.println(formatted);
        LocalDate parseBR = LocalDate.parse("04/01/2026", formatBR);
        System.out.println(parseBR);
        DateTimeFormatter dateTimeFormatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyyy", Locale.GERMAN);
        String formatted1 = LocalDate.now().format(dateTimeFormatterGR);
        System.out.println(formatted1);
    }
}
