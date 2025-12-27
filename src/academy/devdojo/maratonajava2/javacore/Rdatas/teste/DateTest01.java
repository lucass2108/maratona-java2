package academy.devdojo.maratonajava2.javacore.Rdatas.teste;

import java.util.Date;

public class DateTest01 {
    static void main(String[] args) {
        Date date = new Date(1766875863657L);
        System.out.println(date);
        Date date2 = new Date();
        System.out.println(date2.getTime());
    }
}
