import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class AppBiblioteca {
    public static void main(String[] args) {
        Autor a1 = new Autor("Mark Twain", "estadunidense ");
        Autor a2 = new Autor("Júlio Verne", "francês");

        ArrayList<Autor> autoresLivro1 = new ArrayList<>();
        autoresLivro1.add(a1);
        Livro l1 = new Livro("As Aventuras de Tom Sawyer", 1876, autoresLivro1);

        ArrayList<Autor> autoresLivro2 = new ArrayList<>();
        autoresLivro2.add(a2);
        Livro l2 = new Livro("A Volta ao Mundo em 80 Dias", 1873, autoresLivro2);

        System.out.println("Título do livro: " + l1.getTitulo() + ", ano de publicacao: " + l1.getAnoPublicacao()
                + ", Autor do livro: " + l1.getAutor());
        System.out.println("Título do livro: " + l2.getTitulo() + ", ano de publicacao: " + l2.getAnoPublicacao()
                + ", Autor do livro: " + l2.getAutor());
    }
}