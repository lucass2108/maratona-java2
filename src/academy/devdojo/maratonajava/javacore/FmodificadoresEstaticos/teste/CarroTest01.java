package academy.devdojo.maratonajava.javacore.FmodificadoresEstaticos.teste;

import academy.devdojo.maratonajava.javacore.FmodificadoresEstaticos.dominio.Carro;

public class CarroTest01 {
    static void main(String[] args) {
        Carro.setVelocidadeLimite(180);

        Carro carro1 = new Carro("BMW", 280);
        Carro carro2 = new Carro("Mercedes", 275);
        Carro carro3 = new Carro("Audi", 290);

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
