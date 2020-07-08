package dadosCompostos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dadosBase.Dados;
import recursos.Constantes;





public class Conhecimento implements Serializable, Constantes{

	
	List<String> areasConhecimento;
	Map<String, List<Dados>> map;
	
	
	public Conhecimento() {

		areasConhecimento = new ArrayList();
		map = new HashMap<>();
	}
	
	
	/*
	 * adiciona conhecimento:
	 * -verifica se a area ja existe, se sim adiciona o conhecimento ao map usando o arrayList ja existente
	 * se não, adiciona a area, cria uma lista e adiciona ao map
	 * 
	 * as KEYS/AREAS DE CONHECIMENTO já estao uniformizadas
	 */
	public void adicionarConhecimento(String area, String conhecimento) {
		
		area = area.toUpperCase();
		
		if(areasConhecimento.contains(area)) {
			
			
			List<Dados> d = map.get(area);
			d.add(new Dados(conhecimento));
			
			map.put(area, d);
			
		}
		else {
			areasConhecimento.add(area);
			
			List<Dados> d = new ArrayList<Dados>();
			d.add(new Dados(conhecimento));
			
			map.put(area, d);
					
		}
	}
	
	
	
	public List<String> getListaAreasDeConhecimento(){
		return areasConhecimento;
	}
	
	
	/*
	 * verifica se area existe
	 * devolve 0 se não existir
	 * devolve >0 numero de Strings de conhecimento se existir
	 */
	public int getNumDadosArea(String area) {
		
		if(!areasConhecimento.contains(area))
			return 0;
		
		return map.get(area).size();
		
	}
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
}
