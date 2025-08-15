import java.util.ArrayList;

public class Livro {
    private String titulo;
    private int anoPublicacao;
    private ArrayList<Autor> autor;

    public Livro(String titulo, int anoPublicacao, ArrayList autor) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
    }


    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public ArrayList<Autor> getAutor() {
        return autor;
    }
}
