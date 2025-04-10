package pjAula9;

import java.util.List;

public class Fila {
	public void insere(List<Tarefa> lista, Tarefa t) {
		lista.add(t);
	}
	
	public void remove(List<Tarefa> lista) {
		lista.remove(0);
	}
	
	public Tarefa consulta(List<Tarefa> lista, Posicao p) {
		if(p.equals(Posicao.FIRST)) {
			return lista.get(0);
		}else {
			return lista.get(lista.size()-1);
		}
	}
}
