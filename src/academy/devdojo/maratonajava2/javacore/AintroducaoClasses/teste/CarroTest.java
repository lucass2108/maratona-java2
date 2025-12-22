package academy.devdojo.maratonajava2.javacore.AintroducaoClasses.teste;

import academy.devdojo.maratonajava2.javacore.AintroducaoClasses.dominio.Carro;

public class CarroTest {
    static void main(String[] args) {
        Carro carro = new Carro();
        carro.nome = "Ford";
        carro.modelo = "Ka";
        carro.ano = 2010;

        Carro carro2 = new Carro();
        carro2.nome = "Honda";
        carro2.modelo = "Corola";
        carro2.ano = 2011;

        carro = carro2;

        System.out.println("Nome: " + carro.nome + ", modelo: " + carro.modelo + ", ano: " + carro.ano);
        System.out.println("---------------------------------------");
        System.out.println("Nome: " + carro2.nome + ", modelo: " + carro2.modelo + ", ano: " + carro2.ano);

    }
}
