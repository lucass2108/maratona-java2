package academy.devdojo.maratonajava2.javacore.Lclassesabstratas.dominio;

public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calcularBonus();
    }

    @Override
    public void imprime() {
        System.out.println("Imprime");
    }

    public abstract void calcularBonus();
}
