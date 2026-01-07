package academy.devdojo.maratonajava2.javacore.Tresourcebundle.teste;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    static void main(String[] args) {
        System.out.println(Locale.getDefault());

        ResourceBundle bundle = ResourceBundle.getBundle("mensagem", new Locale("en", "US"));
        boolean sasa = bundle.containsKey("sasa");
        System.out.println(sasa);
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));

        bundle = ResourceBundle.getBundle("mensagem", new Locale("pt", "BR"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));

        System.out.println(bundle.getString("hi"));
    }
}
