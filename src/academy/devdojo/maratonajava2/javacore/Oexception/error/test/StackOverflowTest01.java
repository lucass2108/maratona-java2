package academy.devdojo.maratonajava2.javacore.Oexception.error.test;

public class StackOverflowTest01 {
    static void main(String[] args) {
        // Pilha de execução do Java fica sem espaço
        recursividade();
    }

    public static void recursividade(){
        recursividade();
    }
}
