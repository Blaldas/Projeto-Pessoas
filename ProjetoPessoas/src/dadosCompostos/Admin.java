package dadosCompostos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dadosBase.Dados;
import dadosBase.Relacoes;

public class Admin implements Serializable{
	
	//inalteraveis
	private String id;
	private String nome;
	private String sobrenome;
	private Date dataNascimento;
	
	//alteraveis
	private List<Dados> logDados;
	private List<Dados> pensamentos;
		
	
	public Admin(String nome, String sobrenome, Date dataNascimento) {
		
		id = new String("ADMIN#0");
		this.dataNascimento = dataNascimento;
		this.nome = nome;
		this.sobrenome = sobrenome;
		
		logDados = new ArrayList<Dados>();
		pensamentos = new ArrayList<Dados>();
		
	}
	
	//devolve nome e sobrenome
	public String getNome() {
		return nome + sobrenome;
	}
	
	//devolve data de nascimento
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public String id() {
		return id;
	}
	
	//adiciona a dado ao historico
	public void addLogDados(String dado) {
		logDados.add(new Dados(dado));
	}	

	//adiciona a pensamento ao historico
	public void addPensamentos( String pensamento) {
		pensamentos.add(new Dados(pensamento));
	}		
}
