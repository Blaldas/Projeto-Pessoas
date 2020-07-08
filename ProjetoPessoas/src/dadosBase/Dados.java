package dadosBase;

import java.io.Serializable;
import java.util.Date;

import recursos.Constantes;

/*
 * guarda string com o dado e a data desse dado, contem tambem um id para identificar e contabilizar os dados
 */
public class Dados implements Serializable, Constantes {
	
	private static int idNumber = 1;
	private final String id;
	private Date data;
	private String dado;
	
	public Dados(String dado) {
		id = new String(PREFIX_DADOS + Integer.toString(idNumber)); 
		idNumber++;
		data = new java.util.Date();
		this.dado = dado;
		
	}
	
	//devolve o dado
	public String getDado() {
		return dado;
	}
	
	//devolve data do dado
	public Date getDate() {
		return data;
	}
	
	//devolve id do dado
	public String getId() {
		return id;
	}
	
	//devolve numero total de Dados
	public int getTotalId() {
		return idNumber;
	}

	
	
	
}
