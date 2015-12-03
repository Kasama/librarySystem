import java.util.ArrayList;
import java.util.List;

public class Gerenciador_Editora {

    private static Gerenciador_Editora instance = null;
    private List<Editora> editoras;

    public static Gerenciador_Editora getInstance(){
        if (instance == null)
            instance = new Gerenciador_Editora();
        return instance;
    }

	private Gerenciador_Editora(){
        editoras = new ArrayList<>();
    }

	public void criarEditora(Editora editora) {

        if(editoras
                .stream()
                .filter(e -> e.getNome().equals(editora.getNome()))
                .count() == 0
                ){
            editoras.add(editora);
        }
	}

    public List<Editora> getEditoras() {
        return editoras;
    }
}
