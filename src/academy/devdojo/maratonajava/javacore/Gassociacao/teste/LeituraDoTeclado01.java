package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import java.util.Scanner;

public class LeituraDoTeclado01 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = input.nextLine();
        System.out.println(nome);
        System.out.println("Digite sua idade:");
        int idade = input.nextInt();
        System.out.println(idade);
        System.out.println("Digite M ou F para seu sexo:");
        char sexo = input.next().charAt(0);
        System.out.println(sexo);

        System.out.println("---------------");
        System.out.println("Nome: " + nome + ", idade: " + idade + ", sexo: " + sexo);
    }
}
