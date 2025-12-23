package academy.devdojo.maratonajava2.introducao;

public class Aula04Operadores {
    static void main(String[] args) {
        // + - / *
        int num1 = 10;
        int num2 = 20;
        double resultado = num1 / (double) num2;
        System.out.println("Valor " + num2 + num1);
        System.out.println(num2 + num1 + "valor");
        System.out.println(num2 / num1);
        System.out.println(resultado);

        // %
        int resto = 21 % 7;
        System.out.println(resto);

        // < > <= >= == != (retornam boolean)
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println("Dez é maior que vinte? " + isDezMaiorQueVinte);
        boolean isDezDiferenteDeVinte = 10 != 20;
        System.out.println("Dez é diferente de vinte? " + isDezDiferenteDeVinte);
        boolean isDezIgualADez = 10 == 10.00;
        System.out.println("Dez é igual à dez? " + isDezIgualADez);

        //  && (e) || (ou) ! (não)
        int idade = 29;
        float salario = 3500f;
        boolean isDentroDaLeiMaiorQue30 = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQue30 = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQue30 " + isDentroDaLeiMaiorQue30);
        System.out.println("IsDentroDaLeiMenorQue30 " + isDentroDaLeiMenorQue30);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000;
        boolean isPlaystationCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCompravel " + isPlaystationCompravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        System.out.println(bonus);

        int contador = 0;
        contador++;
        System.out.println(contador);
        System.out.println(contador++); // pondo antes adiciona depois da execução
        System.out.println(contador);
        System.out.println(++contador); // pondo depois primieor adiciona depois executa
    }
}
