package estados;

import java.util.Date;

import dados.BaseDados;
import estadoBase.EstadoBase;

public class MenuPessoas extends EstadoAdapter {

	public MenuPessoas(BaseDados baseDados) {
		super(baseDados);
		// TODO Auto-generated constructor stub
	}

	
	@Override 
	public EstadoBase menuPrincipal() {
		return new MenuPrincipal(baseDados);
	}

	@Override
	public EstadoBase PesquisarPessoas() {
		return new PesquisarPessoa(baseDados);
	}
	
	
	@Override
	public EstadoBase menuAdicionarPessoas() {
		return new AdicionarPessoas(baseDados);
	}
}
