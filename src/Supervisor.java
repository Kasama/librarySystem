public class Supervisor extends Funcionario{

	public Supervisor(
			String nome, String sobrenome, String RG, String CIC,
			double salario,
			String endereco,
			char sexo,
			String formacao_profissional
					 ) {
		super(nome, sobrenome, RG, CIC, salario, endereco, sexo,
				formacao_profissional
			 );
	}
}
