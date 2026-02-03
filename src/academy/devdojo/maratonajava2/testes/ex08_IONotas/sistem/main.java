package academy.devdojo.maratonajava2.testes.ex08_IONotas.sistem;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("1- Adicionar | 2- Ler | 3- Sair");
            try {
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        adicionarNota();
                        System.out.println("Arquivo salvo com sucesso");
                        break;
                    case 2:
                        lerArquivo();
                        break;
                    case 3:
                        break;
                    default:
                        opcao = 0;
                }

            } catch (Exception e) {
                System.out.println("Opção inválida! Dígite um número");
                scanner.nextLine();
                opcao = 0;
            }
        } while (opcao != 3);
    }

    static void adicionarNota() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do(a) aluno(a): ");
        String nome = scanner.nextLine().trim();

        System.out.println("Digite a disciplina: ");
        String disciplina = scanner.nextLine().trim();

        double nota = 0;
        try {
            int i = 0;
            while (i == 0) {
                System.out.println("Digite a nota do(a) aluno(a) nesta disciplina(0-10): ");
                nota = scanner.nextDouble();
                if (nota >= 0 && nota <= 10) {
                    i = 1;
                }
            }
        } catch (RuntimeException e) {
            System.out.println("Erro ao obter nota do(a) aluno(a)\nOBS: use \",\" para fazer a divisão entre as casas decimais e inteiras");
        }

        String res;
        if (nota < 6) {
            res = String.valueOf(nota) + "(REPROVADO)";
        } else {
            res = String.valueOf(nota) + "(APROVADO)";
        }

        File file = new File("C:\\Users\\corre\\OneDrive\\Documentos\\maratona-java2\\src\\academy\\devdojo\\maratonajava2\\testes\\ex08_IONotas\\arquivos\\notas.txt");
        try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.write("Nome: " + nome + "\nDisciplina: " + disciplina + "\nNota: " + res + "\n\n");
        } catch (IOException e) {
            System.out.println("O arquivo nao pode ser criado\\escrito");
        }
    }

    static void lerArquivo() {
        File file = new File("C:\\Users\\corre\\OneDrive\\Documentos\\maratona-java2\\src\\academy\\devdojo\\maratonajava2\\testes\\ex08_IONotas\\arquivos\\notas.txt");
        try (FileReader fileReader = new FileReader(file)) {
            int i;
            while ((i = fileReader.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println("O arquivo referenciado nao foi encontrado\nTente novamente ou tente escrever algo para depois ler o arquivo");
        }
    }
}
