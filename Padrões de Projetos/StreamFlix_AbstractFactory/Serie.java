import java.util.*;;

// Classe Série
class Serie extends Video {

    int numTemporada;

    // Construtor
    public Serie(String titulo, String diretor, int anoLancamento, String genero, ArrayList<String> listaAtoresPrincipais) {
        super(titulo, diretor, anoLancamento, genero, listaAtoresPrincipais);
    }

    // Método toString
    public String toString() {
        return super.toString();
    }

    public int getNumTemporada() {
        return numTemporada;
    }

    public void setNumTemporada(int numTemporada) {
        this.numTemporada = numTemporada;
    }

}