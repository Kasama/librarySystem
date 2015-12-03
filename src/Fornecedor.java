public class Fornecedor {

	private static int CODIGO_ATUAL = 0;
	private String nome;
	private String razao_social;
	private String endereco;
	private int telefone;
	private String nome_representante;
	private int telefone_representante;
	private int codigo_fornecedor;

	public Fornecedor(
			String nome, String razao_social, String endereco, int telefone,
			String nome_representante,
			int telefone_representante
					 ) {
		this.nome = nome;
		this.razao_social = razao_social;
		this.endereco = endereco;
		this.telefone = telefone;
		this.nome_representante = nome_representante;
		this.telefone_representante = telefone_representante;
		this.codigo_fornecedor = ++CODIGO_ATUAL;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRazao_social() {
		return razao_social;
	}

	public void setRazao_social(String razao_social) {
		this.razao_social = razao_social;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getNome_representante() {
		return nome_representante;
	}

	public void setNome_representante(String nome_representante) {
		this.nome_representante = nome_representante;
	}

	public int getTelefone_representante() {
		return telefone_representante;
	}

	public void setTelefone_representante(int telefone_representante) {
		this.telefone_representante = telefone_representante;
	}

	public int getCodigo_fornecedor() {
		return codigo_fornecedor;
	}
}
