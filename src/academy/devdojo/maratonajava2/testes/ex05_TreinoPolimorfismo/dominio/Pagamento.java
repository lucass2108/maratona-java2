package academy.devdojo.maratonajava2.testes.ex05_TreinoPolimorfismo.dominio;

public abstract class Pagamento {
    protected double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public abstract void processarPagamento();
}
