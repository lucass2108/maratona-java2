package academy.devdojo.maratonajava2.testes.ex02_ControleDeAlunos.dominio;

public class Aluno {
    private String nome;
    private int idade;
    private static double mediaMinima = 6;
    private double[] notas = new double[3];

    static {
        System.out.println("Classe Aluno Criada");
    }

    public Aluno() {
    }

    public Aluno(String nome) {
        this.nome = nome;
    }

    public Aluno(String nome, int idade) {
        this(nome);
        this.idade = idade;
    }

    public double calcularMedia() {
        return (notas[0] + notas[1] + notas[2]) / 3;
    }

    public void exibirInfo() {
        System.out.println("Nome do(a) aluno(a): " + nome);
        System.out.println("Idade do(a) aluno(a): " + idade);
        System.out.print("Notas do(a) aluno(a): ");
        for (double nota : notas) {
            System.out.print(nota + " ");
        }
        System.out.println(" ");
        System.out.println("Média do aluno: " + calcularMedia());
        System.out.println("-----------");
    }

    public void exibirInfo(String dadosExtras) {
        exibirInfo();
        System.out.println(dadosExtras);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static double getMediaMinima() {
        return mediaMinima;
    }

    public static void setMediaMinima(double mediaMinima) {
        Aluno.mediaMinima = mediaMinima;
    }

    public void setNotas(double n1, double n2, double n3) {
        if (n1 > 10 || n2 > 10 || n3 > 10) {
            System.out.println("Nota máxima é 10");
            return;
        }
        if (n1 < 0 || n2 < 0 || n3 < 0) {
            System.out.println("Nota mínima é 0");
            return;
        }
        this.notas[0] = n1;
        this.notas[1] = n2;
        this.notas[2] = n3;
    }

    public double[] getNotas() {
        return notas;
    }
}
