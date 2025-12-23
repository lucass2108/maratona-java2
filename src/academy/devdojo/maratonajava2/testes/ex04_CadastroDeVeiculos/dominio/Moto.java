package academy.devdojo.maratonajava2.testes.ex04_CadastroDeVeiculos.dominio;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int ano, TipoCombustivel combustivel, int cilindradas) {
        super(marca, modelo, ano, combustivel);
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "cilindradas=" + cilindradas +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", combustivel=" + combustivel +
                '}';
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}
