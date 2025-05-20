import java.util.*;

// Classe Usuário
class Usuario {
    private String nome;
    private String email;
    private String senha;
    private ArrayList<Video> listaFavoritos;

    // Construtor
    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.listaFavoritos = new ArrayList<>();
    }

    // Métodos de acesso
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    // Adicionar filme/série à lista de favoritos
    public void adicionarFavorito(Video video) {
        listaFavoritos.add(video);
    }

    // Remover filme/série da lista de favoritos
    public void removerFavorito(Video video) {
        listaFavoritos.remove(video);
    }

    // Listar todos os filmes/séries favoritos
    public void listarFavoritos() {
        System.out.println("Lista de Filmes/Séries Favoritos de " + nome + ":");
        for (Video video : listaFavoritos) {
            System.out.println(video);
        }
    }
}
