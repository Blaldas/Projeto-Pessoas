package dados;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import dadosCompostos.Admin;
import dadosCompostos.Conhecimento;
import dadosCompostos.Pessoa;

public class BaseDados implements Serializable {
	
	Date dataCriacao;
	Date datadeUltimaModificacao;
	
	Admin admin;
	List<Pessoa> listaPessoas;
	Conhecimento listaConheimento;				
	//List<Outro> listaOutro;
	
	public BaseDados() {
		dataCriacao = new java.util.Date();
		datadeUltimaModificacao = new java.util.Date();
		
		admin = null;
		listaPessoas = new ArrayList<Pessoa>();
		listaConheimento = new Conhecimento();
		
		
	}
	
	public Date getdataCriacao() {
		return dataCriacao;
	}
	
	//return datda de ultima modificacao
	public Date getdataUltimaModificacao() {
		return datadeUltimaModificacao;
	}
	
	//cria o admin-> apenas usar no estado NewAdmin
	public void SetNewAdmin(String nome, String sobrenome, Date dataNascimento) {
		admin = new Admin(nome, sobrenome, dataNascimento);
	}
	
	/*
	 * adiciona pessoa:
	 * ve se pessoa existe, se exitir não adiciona a lista
	 * se não existir cria e adicona a lista
	 */
	public void adicionarPessoa(String nome, String sobrenome, Date dataNascimento, String relacaoAtual) {
		Pessoa p = new Pessoa(nome, sobrenome, dataNascimento, relacaoAtual);
		
		if(listaPessoas.contains(p))
			return;
		
		listaPessoas.add(p);
	}
	
	
	public void adicionarConhecimento(String area, String conhecimento) {
		listaConheimento.adicionarConhecimento(area, conhecimento);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
