package estados;

import java.util.Date;

import dados.BaseDados;
import estadoBase.EstadoBase;

public class MenuConhecimento extends EstadoAdapter {

	public MenuConhecimento(BaseDados baseDados) {
		super(baseDados);
	}
	
	//adicionar conhecimento
	@Override
	public EstadoBase menuAdicionarConhecimento() {
		return new AdicionarConhecimento(baseDados);
	}

	
	//voltar
	@Override 
	public EstadoBase menuPrincipal() {
		return new MenuPrincipal(baseDados);
	}
	
	
	@Override
	public EstadoBase PesquisarConhecimento() {
		return new PesquisarConhecimento(baseDados);
	}
	


}
