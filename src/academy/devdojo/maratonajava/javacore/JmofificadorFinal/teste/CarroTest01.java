package academy.devdojo.maratonajava2.javacore.JmofificadorFinal.teste;

import academy.devdojo.maratonajava2.javacore.JmofificadorFinal.dominio.Carro;
import academy.devdojo.maratonajava2.javacore.JmofificadorFinal.dominio.Ferrari;

public class CarroTest01 {
    static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Stark");
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprimir();
    }
}
