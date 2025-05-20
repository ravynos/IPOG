import java.util.*;

// Classe pai para Filmes e Séries
public abstract class Video {
    private String titulo;
    private String diretor;
    private int anoLancamento;
    private String genero;
    private ArrayList<String> listaAtoresPrincipais;

    // Construtor
    public Video(String titulo, String diretor, int anoLancamento, String genero, ArrayList<String> listaAtoresPrincipais) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.anoLancamento = anoLancamento;
        this.genero = genero;
        this.listaAtoresPrincipais = listaAtoresPrincipais;
    }

    // Métodos de acesso
    public String getTitulo() {
        return titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public String getGenero() {
        return genero;
    }

    public ArrayList<String> getListaAtoresPrincipais() {
        return listaAtoresPrincipais;
    }

    // Método toString
    public String toString() {
        return "Título: " + titulo + "\nDiretor: " + diretor + "\nAno de Lançamento: " + anoLancamento +
                "\nGênero: " + genero + "\nAtores Principais: " + listaAtoresPrincipais.toString();
    }
}
