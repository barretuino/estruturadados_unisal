package pjAula2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TesteColecao {
	public static void main(String[] args) {
		Set colecao = new TreeSet();
		colecao.add("Paulo");
		colecao.add("João");
		colecao.add("Maria");
		colecao.add("Vinicius");
		colecao.add("Ana");
		colecao.add("João");
		colecao.add(String.valueOf(123));
		
		System.out.println(colecao);
		
		colecao.remove("Ana");
		System.out.println(colecao);
		
		Set colecao2 = new TreeSet();
		colecao2.add("Rui");
		colecao2.add("Oclair");
		System.out.println(colecao2);
		
		colecao2.addAll(colecao);
		System.out.println(colecao2);
		colecao2.remove("Oclair");
		
		//<Codicao> ? Verdadeiro : Falso
		System.out.println(colecao2.contains("Oclair") 
				? "Localizado" : "Não localizado");
		
	}
}
