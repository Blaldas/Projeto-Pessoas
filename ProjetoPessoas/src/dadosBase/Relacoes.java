package dadosBase;

import java.io.Serializable;
import java.util.Date;



/*
*gurada data de indicação da relacao e o "nome" da relação.
*
*ex: NAMORADA // 26/01/2991
*/

public class Relacoes implements Serializable {
	
	private Date data;
	private String relacao;
	
	public Relacoes(String relacao) {
		
		this.relacao = relacao;
		data = new java.util.Date();
	
	}

	//devolve o dado
	public String getRelacao() {
		return relacao;
	}
	
	//devolve data do dado
	public Date getDate() {
		return data;
	}


}
