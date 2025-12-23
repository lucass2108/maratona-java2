package academy.devdojo.maratonajava2.testes.ex04_CadastroDeVeiculos.teste;

import academy.devdojo.maratonajava2.testes.ex04_CadastroDeVeiculos.dominio.Carro;
import academy.devdojo.maratonajava2.testes.ex04_CadastroDeVeiculos.dominio.Moto;
import academy.devdojo.maratonajava2.testes.ex04_CadastroDeVeiculos.dominio.TipoCombustivel;
import academy.devdojo.maratonajava2.testes.ex04_CadastroDeVeiculos.dominio.Veiculo;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaCadastro {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        System.out.println("Quantos veículos deseja cadastrar?");
        int quant = input.nextInt();
        input.nextLine();

        for (int i = 0; i < quant; i++) {
            System.out.println("\n Cadastro do veículo " + (i + 1));

            System.out.println("Tipo de veículo(CARRO/MOTO): ");
            String tipo = input.nextLine().toUpperCase();

            if (tipo.equalsIgnoreCase("Carro") || tipo.equalsIgnoreCase("Moto")) {

                System.out.println("Marca: ");
                String marca = input.nextLine();

                System.out.println("Modelo: ");
                String modelo = input.nextLine();

                System.out.println("Ano de fabricação: ");
                int ano = input.nextInt();
                input.nextLine();

                System.out.println("Combustível(GASOLINA/ETANOL/DIESEL/ELETRICO)");
                String tipoCombs = input.nextLine().toUpperCase();
                TipoCombustivel tipoCombustivel = TipoCombustivel.valueOf(tipoCombs);

                if (tipo.equalsIgnoreCase("Carro")) {
                    System.out.println("Quantidade de portas: ");
                    int portas = input.nextInt();

                    System.out.println("É automatico?(true/false)");
                    boolean automatico = input.nextBoolean();
                    input.nextLine();

                    veiculos.add(new Carro(marca, modelo, ano, tipoCombustivel, portas, automatico));
                } else if (tipo.equalsIgnoreCase("MOTO")) {
                    System.out.println("Quantas cilindradas?");
                    int cilindradas = input.nextInt();
                    input.nextLine();

                    veiculos.add(new Moto(marca, modelo, ano, tipoCombustivel, cilindradas));
                } else {
                    System.out.println("Tipo inválido");
                    i--;
                }
            } else {
                System.out.println("Tipo de veículo inválido");
                i--;
            }
        }

        System.out.println("====Veículos cadastrados=====");
        for (Veiculo v : veiculos) {
            System.out.println("-------------");
            System.out.println(v);
        }
    }
}
