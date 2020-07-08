package estados;

import dados.BaseDados;
import estadoBase.EstadoBase;

public class AdicionarConhecimento extends EstadoAdapter{

	public AdicionarConhecimento(BaseDados baseDados) {
		super(baseDados);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public EstadoBase adicionarConhecimento(String area, String conhecimento) {
		
		baseDados.adicionarConhecimento(area, conhecimento);
		return this;
	}


}
