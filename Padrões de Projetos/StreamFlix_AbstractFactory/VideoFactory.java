import java.util.ArrayList;

interface VideoFactory{
    
    Video criarVideo(String titulo, String diretor, int anoLancamento, String genero, ArrayList<String> listaAtoresPrincipais);
    
}