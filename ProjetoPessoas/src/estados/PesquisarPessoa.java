package estados;

import dados.BaseDados;
import estadoBase.EstadoBase;

public class PesquisarPessoa extends EstadoAdapter{

	public PesquisarPessoa(BaseDados baseDados) {
		super(baseDados);
	}

	
	
	
	
	//voltar
	@Override
	public EstadoBase menuPessoas() {
		return new MenuPessoas(baseDados);
	}
	
	
	
	
	
	
	
	
	
}
