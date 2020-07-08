package estados;

import java.util.Date;

import dados.BaseDados;
import estadoBase.EstadoBase;

public class MenuAdmin extends EstadoAdapter {

	public MenuAdmin(BaseDados baseDados) {
		super(baseDados);

	}

	@Override 
	public EstadoBase menuPrincipal() {
		return new MenuPrincipal(baseDados);
	}


}
