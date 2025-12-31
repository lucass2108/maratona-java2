package academy.devdojo.maratonajava2.javacore.Rdatas.teste;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.parse("2030-01-15");
        LocalTime time = LocalTime.of(19, 00, 00);
        System.out.println(localDateTime);
        System.out.println(date);
    }
}
