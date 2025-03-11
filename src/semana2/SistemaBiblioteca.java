import java.util.ArrayList;
import java.util.Scanner;

public class SistemaBiblioteca {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        int opcao;

        do {
            System.out.println("\nBem-vindo ao Sistema de Gerenciamento de Biblioteca! Escolha uma opção:");
            System.out.println("1. Cadastrar livro");
            System.out.println("2. Cadastrar usuário");
            System.out.println("3. Realizar empréstimo");
            System.out.println("4. Realizar devolução");
            System.out.println("5. Exibir livros disponíveis");
            System.out.println("6. Sair\n");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título do livro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Digite o ISBN do livro: ");
                    String isbn = scanner.nextLine();
                    biblioteca.cadastrarLivro(new Livro(titulo, autor, isbn));
                    break;
                case 2:
                    System.out.print("Digite o nome do usuário: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o ID do usuário: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    biblioteca.cadastrarUsuario(new Usuario(nome, id));
                    break;
                case 3:
                    System.out.print("Digite o ISBN do livro: ");
                    String isbnEmprestimo = scanner.nextLine();
                    System.out.print("Digite o ID do usuário: ");
                    int idUsuario = scanner.nextInt();
                    biblioteca.realizarEmprestimo(isbnEmprestimo, idUsuario);
                    break;
                case 4:
                    System.out.print("Digite o ISBN do livro: ");
                    String isbnDevolucao = scanner.nextLine();
                    System.out.print("Digite o ID do usuário: ");
                    int idUsuarioDev = scanner.nextInt();
                    biblioteca.realizarDevolucao(isbnDevolucao, idUsuarioDev);
                    break;
                case 5:
                    biblioteca.exibirLivrosDisponiveis();
                    break;
                case 6:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 6);

        scanner.close();
    }
}
