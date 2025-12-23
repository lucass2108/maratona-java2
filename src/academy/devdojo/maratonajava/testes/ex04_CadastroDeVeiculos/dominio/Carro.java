package academy.devdojo.maratonajava2.testes.ex04_CadastroDeVeiculos.dominio;

public class Carro extends Veiculo {
    private int portas;
    private boolean automatico;

    public Carro(String marca, String modelo, int ano, TipoCombustivel combustivel, int portas, boolean automatico) {
        super(marca, modelo, ano, combustivel);
        this.portas = portas;
        this.automatico = automatico;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "combustivel=" + combustivel +
                ", ano=" + ano +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", automatico=" + automatico +
                ", portas=" + portas +
                '}';
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public boolean isAutomatico() {
        return automatico;
    }

    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }
}
