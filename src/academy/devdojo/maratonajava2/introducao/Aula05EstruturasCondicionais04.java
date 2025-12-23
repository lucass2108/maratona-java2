package academy.devdojo.maratonajava2.introducao;

public class Aula05EstruturasCondicionais04 {
    static void main(String[] args) {
        double salarioAnual = 80000.00D;
        double imposto;

        if (salarioAnual <= 34712) {
            imposto = salarioAnual * 0.097;
            System.out.println("Você deve pagar 9,7% de imposto, totalizando " + imposto + " Euros");
        } else if (salarioAnual > 34712 && salarioAnual <= 68507) {
            imposto = salarioAnual * 0.3735;
            System.out.println("Você deve pagar 37,35% de imposto, totalozando " + imposto + " Euros");
        } else {
            imposto = salarioAnual * 0.495;
            System.out.println("Você deve pagar 49.5% de imposto, totalizando " + imposto + " Euros");
        }
    }
}
