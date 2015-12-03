import java.util.ArrayList;
import java.util.List;

public class Gerenciador_Autor {

    private static Gerenciador_Autor instance = null;
    public List<Autor> autores;

    public static Gerenciador_Autor getInstance() {
        if (instance == null)
            instance = new Gerenciador_Autor();
        return instance;
    }

    private Gerenciador_Autor() {
        this.autores = new ArrayList<>();
    }

    public void criarAutor(Autor autor) {

        if (autores
                .stream()
                .filter( a -> a.getNome().equals(autor.getNome()))
                .count() == 0
                ) {
            autores.add(autor);
        }

    }

    public List<Autor> getAutores() {
        return autores;
    }
}
