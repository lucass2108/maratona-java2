package academy.devdojo.maratonajava2.introducao;

public class Aula05EstruturasCondicionais03 {
    static void main(String[] args) {
        double salario = 6500;
        String doar = "Irei dooar";
        String naoDoar = "Não irei doar";
        // (condicao) ? verdadeiro : falso
        String resultado = salario > 5000 ? doar : naoDoar;
        boolean possoDoar = salario > 5000;
        System.out.println(resultado);
    }
}
