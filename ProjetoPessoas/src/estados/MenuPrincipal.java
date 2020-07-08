package estados;

import java.util.Date;

import dados.BaseDados;
import estadoBase.EstadoBase;

public class MenuPrincipal extends EstadoAdapter {

	public MenuPrincipal(BaseDados baseDados) {
		super(baseDados);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public EstadoBase menuAdmin() {
		return new MenuAdmin(baseDados);
	}
	
	@Override
	public EstadoBase menuPessoas() {
		return new MenuPessoas(baseDados);
	}
	
	@Override
	public EstadoBase menuConhecimento() {
		return new MenuConhecimento(baseDados);
	}
	
	
}
