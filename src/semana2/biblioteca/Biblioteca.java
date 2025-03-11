package semana2.biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros;
    private ArrayList<Usuario> usuarios;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void realizarEmprestimo(String isbn, int idUsuario) {
        Livro livro = buscarLivro(isbn);
        Usuario usuario = buscarUsuario(idUsuario);

        if (livro != null && usuario != null && livro.isDisponivel()) {
            if (usuario.adicionarLivro(livro)) {
                livro.emprestar();
                System.out.println("Empréstimo realizado com sucesso!");
            } else {
                System.out.println("Usuário já atingiu o limite de 3 livros emprestados.");
            }
        } else {
            System.out.println("Empréstimo não pode ser realizado.");
        }
    }

    public void realizarDevolucao(String isbn, int idUsuario) {
        Livro livro = buscarLivro(isbn);
        Usuario usuario = buscarUsuario(idUsuario);

        if (livro != null && usuario != null) {
            if (usuario.removerLivro(livro)) {
                livro.devolver();
                System.out.println("Devolução realizada com sucesso!");
            } else {
                System.out.println("Este usuário não pegou este livro emprestado.");
            }
        } else {
            System.out.println("Devolução não pode ser realizada.");
        }
    }

    public void exibirLivrosDisponiveis() {
        System.out.println("Livros disponíveis:");
        for (Livro livro : livros) {
            if (livro.isDisponivel()) {
                livro.exibirDetalhes();
            }
        }
    }

    private Livro buscarLivro(String isbn) {
        for (Livro livro : livros) {
            if (livro.getIsbn().equals(isbn)) {
                return livro;
            }
        }
        return null;
    }

    private Usuario buscarUsuario(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }
}

