package estados;

import java.util.Date;

import dados.BaseDados;
import estadoBase.EstadoBase;

public class AdicionarPessoas extends EstadoAdapter{

	public AdicionarPessoas(BaseDados baseDados) {
		super(baseDados);

	}
	
	@Override
	public EstadoBase adicionarPessoa(String nome, String sobrenome, Date dataNascimento, String relacaoAtual) {
		
		baseDados.adicionarPessoa( nome,  sobrenome,  dataNascimento,  relacaoAtual);
		
		return this;
	}
	
	
	//cancelar
	@Override
	public EstadoBase menuPessoas() {
		return new MenuPessoas(baseDados);
	}
	
	

}
