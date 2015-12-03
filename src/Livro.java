public class Livro {

    private static int CODIGO_ATUAL = 0;
    private Autor autor;
    private Editora editora;
    private local_de_publicacao local_de_publicacao;
    private String titulo;
    private int numero_registro_livro;
    private String volume;
    private int numero_paginas;
    private int numero_edicao;
    private int ano;
    private int codigo_livro;

    public Livro(
            Autor autor, Editora editora,
            local_de_publicacao local_de_publicacao, String titulo,
            String volume, int numero_paginas, int numero_edicao, int ano,
            int numero_registro_livro
                ) {
        this.autor = autor;
        this.editora = editora;
        this.local_de_publicacao = local_de_publicacao;
        this.titulo = titulo;
        this.volume = volume;
        this.numero_paginas = numero_paginas;
        this.numero_edicao = numero_edicao;
        this.ano = ano;
        this.numero_registro_livro = numero_registro_livro;
        this.codigo_livro = ++CODIGO_ATUAL;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public local_de_publicacao getLocal_de_publicacao() {
        return local_de_publicacao;
    }

    public void setLocal_de_publicacao(
            local_de_publicacao local_de_publicacao
                                      ) {
        this.local_de_publicacao = local_de_publicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumero_registro_livro() {
        return numero_registro_livro;
    }

    public void setNumero_registro_livro(int numero_registro_livro) {
        this.numero_registro_livro = numero_registro_livro;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public int getNumero_paginas() {
        return numero_paginas;
    }

    public void setNumero_paginas(int numero_paginas) {
        this.numero_paginas = numero_paginas;
    }

    public int getNumero_edicao() {
        return numero_edicao;
    }

    public void setNumero_edicao(int numero_edicao) {
        this.numero_edicao = numero_edicao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getCodigo_livro() {
        return codigo_livro;
    }
}
