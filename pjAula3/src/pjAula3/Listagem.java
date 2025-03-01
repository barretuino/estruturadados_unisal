package pjAula3;

import java.util.ArrayList;
import java.util.List;

/**
 * Exemplo de List<String>
 * Prof. Paulo Barreto
 * Data 25/02/2025
 */
public class Listagem {
	public static void main(String[] args) {
		//Declarando a Lista
		List<String> listTermos = new ArrayList<String>();
		
		//Checar a quantidade de elementos
		System.out.println("Tamanho " + listTermos.size());
		System.out.println(listTermos.isEmpty());
		
		//Inserção de Valores Exemplo
		for(int i=0; i<30_000_000;i++) {
			listTermos.add("Elemento " + i);
		}
		
		/** Exemplo de Localização
		 *  Usando interação de looping
		 */
		long inicio = System.currentTimeMillis();
		for(int i=0;i<30_000_000;i++) {
			if(listTermos.get(i).equals("Elemento 975636")) {
				System.out.println("Localizado 1");
				break;
			}
		}
		System.out.println("Tempo " 
		             + (System.currentTimeMillis() - inicio));
		
		//Melhoria 1
		inicio = System.currentTimeMillis();
		for(String s : listTermos) {
			if(s.equals("Elemento 975636")) {
				System.out.println("Localizado 2");
				break;
			}
		}
		System.out.println("Tempo " 
	             + (System.currentTimeMillis() - inicio));
		
		//Melhoria 2
		inicio = System.currentTimeMillis();
		if(listTermos.contains("Elemento 975636")) {
			System.out.println("Localizado 3");
		}
		System.out.println("Tempo " 
	             + (System.currentTimeMillis() - inicio));
		
		//Melhoria 4
		inicio = System.currentTimeMillis();
		if(listTermos.stream().anyMatch(i-> i.equals("Elemento 975636"))) {
			System.out.println("Localizado 4");
		}
		System.out.println("Tempo " 
	             + (System.currentTimeMillis() - inicio));
		
		/**Remoção estilo array
		 * Usando For
		 */
		inicio = System.currentTimeMillis();
		for(int i=0; i<30_000_000; i++) {
			if(listTermos.get(i).equals("Elemento 975636")) {
				listTermos.remove(i);
				break;
			}
		}
		System.out.println("Remoção Tempo " 
	             + (System.currentTimeMillis() - inicio));
		
		inicio = System.currentTimeMillis();
		listTermos.removeIf(i-> i.equals("Elemento 975636"));
		System.out.println("Remoção Tempo " 
	             + (System.currentTimeMillis() - inicio));
		
		inicio = System.currentTimeMillis();
		listTermos = new ArrayList<String>();
		System.out.println("Remoção total Tempo " 
	             + (System.currentTimeMillis() - inicio));
		
	}
}
