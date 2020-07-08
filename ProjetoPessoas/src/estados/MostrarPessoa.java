package estados;

import dados.BaseDados;
import estadoBase.EstadoBase;

public class MostrarPessoa extends EstadoAdapter{

	public MostrarPessoa(BaseDados baseDados) {
		super(baseDados);

	}
	
	
	//voltar
	@Override
	public EstadoBase PesquisarPessoas() {
		return new PesquisarPessoa(baseDados);
	}
	
	

}
