import java.util.HashMap;

public class Gerenciador_Funcionario {

    private static Gerenciador_Funcionario instance = null;

    public static Gerenciador_Funcionario getInstance(){
        if (instance == null)
            instance = new Gerenciador_Funcionario();
        return instance;
    }

    private Gerenciador_Funcionario(){
    }

	public void alterarDados(Funcionario funcionario, HashMap dados) {
        funcionario.alterarDados(dados);
	}

}
