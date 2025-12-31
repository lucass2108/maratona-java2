package academy.devdojo.maratonajava2.javacore.Rdatas.teste;

import java.time.LocalTime;

public class LocaleTest01 {
    static void main(String[] args) {
        LocalTime localTime = LocalTime.of(23, 32, 12);
        LocalTime timeNow = LocalTime.now();
        System.out.println(localTime);
        System.out.println(timeNow);
    }
}
