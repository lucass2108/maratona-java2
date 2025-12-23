package academy.devdojo.maratonajava2.introducao;

public class Aula06EstruturaDeRepeticao05 {
    // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // O valor da parcela tem que ser maior ou igual a 1000
    static void main(String[] args) {
        double precoCarro = 2000;

        for (int i = (int) precoCarro; i >= 1; i--) {
            double parcela = precoCarro / i;
            if (parcela < 1000)
                continue;
            System.out.println("Parcela " + i + " R$" + parcela);

        }
    }
}
