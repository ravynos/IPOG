import java.util.*;


// Classe Filme
public class Filme extends Video {
    
    int duracaoMin;
    
    // Construtor
    public Filme(String titulo, String diretor, int anoLancamento, String genero, ArrayList<String> listaAtoresPrincipais) {
        super(titulo, diretor, anoLancamento, genero, listaAtoresPrincipais);
    }

    // Método toString
    public String toString() {
        return super.toString();
    }

    public int getDuracaoMin() {
        return duracaoMin;
    }

    public void setDuracaoMin(int duracaoMin) {
        this.duracaoMin = duracaoMin;
    }

}