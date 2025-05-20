import java.util.ArrayList;

public class StreamFlix_AbstractFactory{

    public static void main(String[] args) {

        //Criando as instâncias das fábricas de filmes e séries, baseadas ainda na fabrica abstrata VideoFactory
        VideoFactory filmeFactory = new FilmeFactory();
        VideoFactory serieFactory = new SerieFactory();

        //Criar a lista de atores princiais
        ArrayList<String> atoresFilme1 = new ArrayList<>();
        atoresFilme1.add("Marlon Brando"); 
        atoresFilme1.add("Harrison Ford"); 

        ArrayList<String> atoresFilme2 = new ArrayList<>();
        atoresFilme2.add("Brigite Bardot"); 
        atoresFilme2.add("Margot Robbie"); 

        Video filme1 = filmeFactory.criarVideo("Filme 1", "Diretor 1", 2023, "Ação", atoresFilme1);
        Video filme2 = filmeFactory.criarVideo("Filme 2", "Diretor 2", 1998, "Aventura", atoresFilme2);


        //Criar a lista de atores princiais
        ArrayList<String> atoresSerie1 = new ArrayList<>();
        atoresSerie1.add("Arnold Swartz"); 
        atoresSerie1.add("Leonardo Dicaprio"); 

        ArrayList<String> atoresSerie2 = new ArrayList<>();
        atoresSerie2.add("Sandra Bullock"); 
        atoresSerie2.add("Lupita Nyong'o"); 

        
        Video serie1 = serieFactory.criarVideo("Serie 1", "Diretor Serie 1", 2024, "Romance", atoresSerie1);
        Video serie2 = serieFactory.criarVideo("Serie 2", "Diretor Serie 2", 1914, "Suspense", atoresSerie2);


        //Imprimir os dados do filme1
        System.out.println(filme1.toString());
        System.out.println();

        //Imprimir os dados do filme2
        System.out.println(filme2.toString());
        System.out.println();

        //Imprimir os dados do Serie1
        System.out.println(serie1.toString());
        System.out.println();

        //Imprimir os dados do Serie2
        System.out.println(serie2.toString());
        System.out.println();

    }

}