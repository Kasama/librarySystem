public class Usuario {

    private static int CODIGO_ATUAL = 0;
	private String nome;
	private String sobrenome;
	private String RG;
	private int CIC;
	private int telefone;
	private String endereco;
	private char sexo;
	private String profissao;
	private int codigo_usuario;

    public Usuario(
            String nome, String sobrenome, String RG, int CIC, int telefone,
            String endereco,
            char sexo,
            String profissao
                  ) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.RG = RG;
        this.CIC = CIC;
        this.telefone = telefone;
        this.endereco = endereco;
        this.sexo = sexo;
        this.profissao = profissao;
        this.codigo_usuario = ++CODIGO_ATUAL;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public int getCIC() {
        return CIC;
    }

    public void setCIC(int CIC) {
        this.CIC = CIC;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public int getCodigo_usuario() {
        return codigo_usuario;
    }
}
