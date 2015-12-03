import java.util.ArrayList;
import java.util.List;

public class Gerenciador_Local_de_Publicacao {

    private static Gerenciador_Local_de_Publicacao instance = null;
    private List<local_de_publicacao> locais_de_publicacao;

    public static Gerenciador_Local_de_Publicacao getInstance() {
        if (instance == null)
            instance = new Gerenciador_Local_de_Publicacao();
        return instance;
    }

    private Gerenciador_Local_de_Publicacao() {
        locais_de_publicacao = new ArrayList<>();
    }

    public void criarLocal_de_Publicacao(local_de_publicacao loc) {

        if (locais_de_publicacao
                .stream()
                .filter(e -> e.getEndereco().equals(loc.getEndereco()))
                .count() == 0
                ) {
            locais_de_publicacao.add(loc);
        }
    }

    public List<local_de_publicacao> getLocais_de_publicacao() {
        return locais_de_publicacao;
    }
}

