import java.util.ArrayList;
import java.util.List;

public class Gerenciador_Fornecedor {

	private static Gerenciador_Fornecedor instance = null;
    private List<Aquisicao> aquisicoes;
    private List<Fornecedor> fornecedores;

    public static Gerenciador_Fornecedor getInstance(){
        if (instance == null)
            instance = new Gerenciador_Fornecedor();
        return instance;
    }

    private Gerenciador_Fornecedor(){
        aquisicoes = new ArrayList<>();
        fornecedores = new ArrayList<>();
    }

	public void excluirFornecedor(Fornecedor fornecedor) {
        if (aquisicoes.stream()
                .filter(a -> a.getFornecedor().getCodigo_fornecedor()
                                 == fornecedor.getCodigo_fornecedor()
                ).count() == 0){
            fornecedores.remove(fornecedor);
        }
	}

}
