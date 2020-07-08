package dadosCompostos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dadosBase.Dados;
import dadosBase.Relacoes;
import recursos.Constantes;

public class Pessoa implements Serializable, Constantes{

	//identificadores
	private static int idNumber = 1;
	private final String id;
	
	//n�o alteraveis
	private String nome;
	private String sobreNome;
	private Date dataNascimento;
	
	//alteraveis
	private List<Dados> logDados;
	
	private String rela��oAtual;
	private List<Relacoes> historicoRelacoes;

	
	
	public Pessoa(String nome, String sobrenome, Date dataNascimento, String relacaoAtual) {
		id = new String(PREFIX_PESSOA + Integer.toString(idNumber)); 
		idNumber++;
		
		this.nome = nome;
		this.sobreNome = sobrenome;
		this.dataNascimento = dataNascimento;
		
		this.rela��oAtual = relacaoAtual;
		historicoRelacoes = new ArrayList<>();
		this.addHistoricoRelacoes();	
		
	}

	//adiciona a rela��o ao historico
	private void addHistoricoRelacoes() {
		historicoRelacoes.add(new Relacoes(rela��oAtual));
		
	}
	
	//modifica relacao atual e adiciona a nova relacao ao historico de relacoes
	public void modificarRelacaoAtual(String novaRelacao) {

		this.rela��oAtual = novaRelacao;
		this.addHistoricoRelacoes();	
	}
	
	//devolve nome completo
	public String getNome() {
		return nome + sobreNome;
	}
	
	//devolve data de nascimento
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	//devolve relacao atual
	public String getRelacaoAtual() {
		return rela��oAtual;
	}
	
	//devolve id
	public String getId() {
		return id;
	}
	
	//devolve numero total de Pessoas
	public int getTotalId() {
		return idNumber;
	}

	
	
	
	
	
	
	
	
	
	
	
}
