package academy.devdojo.maratonajava2.javacore.BintroducaoMetodos.dominio;

public class Funcionario {
    private String nome = null;
    private int idade = 0;
    private double[] salarios = null;
    private double media;

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.print("Salários: ");
        if (salarios == null) {
            System.out.println("Sem salários registrados para o período");
            return;
        }
        for (double i : salarios) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        mediaSalarial();

    }

    public void mediaSalarial() {
        if (salarios == null) {
            System.out.println("Sem salários registrados para o período");
            return;
        }

        for (double i : this.salarios) {
            media += i;
        }
        media /= salarios.length;
        System.out.println("Média salarial: " + media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getMedia() {
        return media;
    }
}
