package academy.devdojo.maratonajava2.javacore.Hheranca.dominio;

public class Pessoa {
    /**
     * protected permite que qualquer classe dentro do mesmo pacote tenha acesso.
     * No entanto, o modificador protected estende a visibilidade a qualquer classe filha,
     * mesmo aquelas fora do pacote
     */
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("Dentro do bloco de inicialização estático de Pessoa");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Pessoa 1 ");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Pessoa 2 ");
    }

    public Pessoa(String nome) {
        System.out.println("Dentro do construtor de Pessoa");
        this.nome = nome;
    }

    public Pessoa(String nome, String cpf) {
        this(nome);
        this.cpf = cpf;
    }

    public void imprimir() {
        System.out.println(nome);
        System.out.println(cpf);
        System.out.println(endereco.getRua() + " " + endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
