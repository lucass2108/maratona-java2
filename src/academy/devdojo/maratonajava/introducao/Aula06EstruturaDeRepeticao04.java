package academy.devdojo.maratonajava2.introducao;

public class Aula06EstruturaDeRepeticao04 {
    // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // O valor da parcela tem que ser maior ou igual a 1000
    static void main(String[] args) {
        double precoCarro = 10000;

        for (int i = 1; i < precoCarro; i++) {
            double parcela = precoCarro / i;
            if (parcela >= 1000) {
                System.out.println(i + " parcelas de R$" + parcela);
            } else {
                break;
            }
        }
    }
}
