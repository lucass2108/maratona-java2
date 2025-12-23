package academy.devdojo.maratonajava.javacore.Hheranca.teste;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {

    /**
     * <p>Ordem de execução durante a criação de objetos com herança:</p>
     *
     * <ol>
     *   <li>Executa o inicializador estático da superclasse quando a JVM carrega a classe pai.</li>
     *   <li>Executa o inicializador estático da subclasse quando a JVM carrega a classe filha.</li>
     *   <li>É alocado espaço em memória para o objeto da classe pai.</li>
     *   <li>Cada atributo da classe pai é criado e inicializado.</li>
     *   <li>O bloco de inicialização da superclasse é executado na ordem em que aparece.</li>
     *   <li>O construtor da superclasse é executado.</li>
     *   <li>É alocado espaço em memória para o objeto da classe filha.</li>
     *   <li>Cada atributo da classe filha é criado e inicializado.</li>
     *   <li>O bloco de inicialização da subclasse é executado na ordem em que aparece.</li>
     *   <li>O construtor da subclasse é executado.</li>
     * </ol>
     */

    static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Lucas");

    }
}
