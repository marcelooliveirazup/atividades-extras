
import java.util.ArrayList;

public class Usuario {

    private String nome;
    private int id;
    private ArrayList<Livro> livrosEmprestados;

    public Usuario(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.livrosEmprestados = new ArrayList<>();
    }

    public void exibirDetalhes() {
        System.out.println("Usuário: " + nome + ", ID: " + id);
    }

    public boolean adicionarLivro(Livro livro) {
        if (livrosEmprestados.size() < 3) {
            livrosEmprestados.add(livro);
            return true;
        }
        return false;
    }

    public boolean removerLivro(Livro livro) {
        return livrosEmprestados.remove(livro);
    }

    public int getId() {
        return id;
    }
}

