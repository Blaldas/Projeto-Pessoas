package estadoBase;

import java.io.Serializable;

import dados.BaseDados;
import java.util.Date;

public interface EstadoBase extends Serializable{

		//estados de inicialização
		public EstadoBase LoadBaseDados(BaseDados baseDados);
		public EstadoBase Iniciar();
		public EstadoBase setNewAdmin(String nome, String sobreNome, Date dataNascimento);
		
		
		//entre estados
		public EstadoBase menuPrincipal();
		
		public EstadoBase menuAdmin();
		public EstadoBase menuPessoas();
		public EstadoBase menuConhecimento();
		public EstadoBase menuAdicionarConhecimento();
		public EstadoBase menuAdicionarPessoas();
		public EstadoBase PesquisarPessoas();
		public EstadoBase PesquisarConhecimento();
		public EstadoBase MostrarPessoa();
		
		//estado menupessoas
		public EstadoBase adicionarPessoa(String nome, String sobrenome, Date dataNascimento, String relacaoAtual);
		
		//estado menuConhecimento
		public EstadoBase adicionarConhecimento(String area, String conhecimento);
		

}
