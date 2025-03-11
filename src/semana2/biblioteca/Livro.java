package semana2.biblioteca;

import java.io.Serializable;

public class Livro implements Serializable {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponivel;

    public Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponivel = true;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", ISBN: " + isbn + ", Disponível: " + disponivel);
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void emprestar() {
        this.disponivel = false;
    }

    public void devolver() {
        this.disponivel = true;
    }

    public String getIsbn() {
        return isbn;
    }
}

