package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{
    private double salario;
    static {
        System.out.println("Dentro do bloco de inicialização estático de Funcionário");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Funcionário 1 ");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Funcionário 2 ");
    }


    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de Funcionário");
    }

    public void imprimir() {
        super.imprimir();
        System.out.println(salario);
    }

    public void relatorioDePagamento() {
        System.out.println("Eu, " + nome + ", recebi o salário de R$" + salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
