package estados;

import java.util.Date;

import dados.BaseDados;
import estadoBase.EstadoBase;

public class NewAdmin extends EstadoAdapter {

	public NewAdmin(BaseDados baseDados) {
		super(baseDados);

	}
	
	@Override
	public EstadoBase setNewAdmin(String nome, String sobreNome, Date dataNascimento) {
		
		baseDados.SetNewAdmin(nome, sobreNome, dataNascimento);

		return new MenuPrincipal(baseDados);
		
	}
}
