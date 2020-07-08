package estados;

import java.util.Date;

import dados.BaseDados;
import estadoBase.EstadoBase;

public abstract class EstadoAdapter implements EstadoBase {
	 
	protected BaseDados baseDados;
	
	public EstadoAdapter(BaseDados baseDados) {
		this.baseDados = baseDados;
	}
	 
	

	@Override
	public EstadoBase LoadBaseDados(BaseDados baseDados) {
		return this;
	}

	@Override
	public EstadoBase Iniciar() {
		return this;
	}
	
	@Override
	public EstadoBase setNewAdmin(String nome, String sobreNome, Date dataNascimento) {
		return this;
	}
	
	@Override
	public EstadoBase menuAdmin() {
		return this;
	}
	
	@Override
	public EstadoBase menuPessoas() {
		return this;
	}
	
	@Override
	public EstadoBase menuConhecimento() {
		return this;
	}
	
	@Override 
	public EstadoBase menuPrincipal() {
		return this;
	}
	
	@Override
	public EstadoBase adicionarPessoa(String nome, String sobrenome, Date dataNascimento, String relacaoAtual) {
		return this;
	}
	
	@Override
	public EstadoBase adicionarConhecimento(String area, String conhecimento) {
		return this;
	}
	
	@Override
	public EstadoBase menuAdicionarConhecimento() {
		return this;
	}
	
	@Override
	public EstadoBase menuAdicionarPessoas() {
		return this;
	}

	@Override
	public EstadoBase PesquisarPessoas() {
		return this;
	}
	
	@Override
	public EstadoBase PesquisarConhecimento() {
		return this;
	}
}
