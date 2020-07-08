package estados;

import dados.BaseDados;
import estadoBase.EstadoBase;

public class EstadoInicial extends EstadoAdapter{
	
	public EstadoInicial(BaseDados baseDados) {
		super(baseDados);
		
	}

	@Override
	public EstadoBase LoadBaseDados(BaseDados newBaseDados) {
		
		//this.baseDados = baseDados;
		return new MenuPrincipal(newBaseDados);
	}

	@Override
	public EstadoBase Iniciar() {
		return new NewAdmin(baseDados);
	}
	
	
	
	
	

}
