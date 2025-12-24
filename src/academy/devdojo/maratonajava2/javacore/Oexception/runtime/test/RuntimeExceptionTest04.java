package academy.devdojo.maratonajava2.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    /**
     *Deve ser ressaltado que as excessões são objetos com herança,
     * por isso pode-se usar uma excessão mais genérica.
     * Por exemplo: a ArrayIndexOutBoundsException é filha de RuntimeException, assim quando se trata a
     * RuntimeException tbm se trata a ArrayIndexOutBoundsExceptions e outros filhos e netos e por assim segue.
     */

    static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e){
            System.out.println("Dentro do IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro do IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("Dentro do ArithmeticException");
        } catch (RuntimeException e){
            System.out.println("Dentro do RuntimeException");
        }

        try {
            talvezLanceException();
        } catch (Exception e){

        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException {

    }
}
