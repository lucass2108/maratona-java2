package academy.devdojo.maratonajava2.javacore.Sformatacao.test01;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest02 {
    static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localePT = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIt = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[]{NumberFormat.getCurrencyInstance(), NumberFormat.getCurrencyInstance(localeJP),
                NumberFormat.getCurrencyInstance(localePT), NumberFormat.getCurrencyInstance(localeIt)};
        double valor = 10_000.2190;
        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(valor));
        }
    }
}
