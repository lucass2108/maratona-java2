package academy.devdojo.maratonajava2.testes.ex04_CadastroDeVeiculos.dominio;

public class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;
    protected TipoCombustivel combustivel;

    static {
        System.out.println("Classe Veículo Carregada");
    }

    {
        System.out.println("Criando um novo veículo");
    }

    public Veiculo() {

    }

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Veiculo(String marca, String modelo, int ano, TipoCombustivel combustivel) {
        this(marca, modelo);
        this.ano = ano;
        this.combustivel = combustivel;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", combustivel=" + combustivel +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public TipoCombustivel getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(TipoCombustivel combustivel) {
        this.combustivel = combustivel;
    }
}
