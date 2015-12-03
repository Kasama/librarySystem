import java.util.HashMap;

public class Sistema {

	public void inserirLivro(HashMap dados) {
		Gerenciador_Livro.getInstance().inserirLivro(dados);
	}

	public void alterarDadosFuncionario(Funcionario funcionario, HashMap dados){
		Gerenciador_Funcionario.getInstance().alterarDados(funcionario, dados);
	}

	public Usuario buscarUsuario(String codigo_RG_CIC) {
		return Gerenciador_Usuario.getInstance().buscarUsuario(codigo_RG_CIC);
	}

	public void excluirFornecedor(Fornecedor fornecedor){
        Gerenciador_Fornecedor.getInstance().excluirFornecedor(fornecedor);
	}

}
