package pjAula3;

import java.util.HashMap;
import java.util.Map;

public class Mapas {
	public static void main(String[] args) {
		//Declarando um Mapa
		Map<Integer, String> mapValores = new HashMap<Integer, String>();
		
		mapValores.put(1, "Lápis");
		mapValores.put(2, "Caneta");
		
		for(int i=0; i<10_000_000;i++) {
			mapValores.put(i, "Objeto " + i);
		}
		
		long inicio = System.currentTimeMillis();
		String retorno = mapValores.get(8_765_123);
		if(retorno != null) {
			System.out.println("Localizado");
		}
		System.out.println("Tempo " 
		             + (System.currentTimeMillis() - inicio));
		
		/*
		for(Integer chave : mapValores.keySet()) {
			System.out.println(mapValores.get(chave));
		}*/
	
		System.out.println("Tamanho " + mapValores.keySet().size());
	}
}
