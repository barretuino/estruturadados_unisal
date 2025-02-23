package pjAula2;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
	public static void main(String[] args) {
		List<Produto> lista = new ArrayList<Produto>();
		
		Produto caderno = new Produto();
		caderno.setCodigo(123);
		caderno.setDescricao("Caderno Universitário 200 Folhas");
		caderno.setValor(50);
		
		lista.add(caderno);
		
		Produto lapis = new Produto();
		lapis.setCodigo(756);
		lapis.setDescricao("Lapis HB2");
		lapis.setValor(3);
		
		lista.add(lapis);
		System.out.println(lista);
		
		for(int i=0; i<lista.size(); i++) {
			System.out.println(lista.get(i).getDescricao());
			System.out.println(lista.get(i).hashCode());
		}
		
		System.out.println("Tamanho " + lista.size());
		System.out.println(caderno.hashCode());
		System.out.println(lista.contains(caderno));
	}
}
