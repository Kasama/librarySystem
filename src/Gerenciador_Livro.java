import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Gerenciador_Livro {

    private static Gerenciador_Livro instance;
    private List<Livro> livros;

    public static Gerenciador_Livro getInstance() {
        if (instance == null)
            instance = new Gerenciador_Livro();
        return instance;
    }

    private Gerenciador_Livro() {
        livros = new ArrayList<>();
    }

    public void inserirLivro(HashMap dados) {

        Autor autor = (Autor) dados.get("autor");
        Editora editora = (Editora) dados.get("editora");
        local_de_publicacao local_de_publicacao = (local_de_publicacao) dados.get(
                "local_de_publicacao");
        String titulo = (String) dados.get("titulo");
        String volume = (String) dados.get("volume");
        int numero_paginas = (int) dados.get("numero_paginas");
        int numero_edicao = (int) dados.get("numero_edicao");
        int ano = (int) dados.get("ano");
        int numero_registro_livro = (int) dados.get("numero_registro_livro");

        Livro l = new Livro(
                autor, editora, local_de_publicacao, titulo, volume,
                numero_paginas, numero_edicao, ano, numero_registro_livro
        );

        Gerenciador_Autor.getInstance().criarAutor(autor);
        Gerenciador_Editora.getInstance().criarEditora(editora);
        Gerenciador_Local_de_Publicacao.getInstance()
                .criarLocal_de_Publicacao(local_de_publicacao);

        livros.add(l);

    }

}
