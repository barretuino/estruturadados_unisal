package pjAula9;

import java.util.ArrayList;
import java.util.List;

public class Orquestrador {
	public static void main(String[] args) {
		//Criando a Fila
		List<Tarefa> agenda = new ArrayList<Tarefa>();
		
		//Criando um elemento para Fila
		Tarefa task1 = new Tarefa(1, "Processo A", Situacao.CONCLUIDA, 123f);		
		Tarefa task2 = new Tarefa(2, "Processo B", Situacao.PENDENTE, 10f);
		Tarefa task3 = new Tarefa(3, "Processo C", Situacao.ERRO, 12f);
		Tarefa task4 = new Tarefa(4, "Processo D", Situacao.PENDENTE, 98f);
		Tarefa task5 = new Tarefa(5, "Processo E", Situacao.CONCLUIDA, 75f);
		Tarefa task6 = new Tarefa(6, "Processo F", Situacao.ERRO, 11f);
		Tarefa task7 = new Tarefa(7, "Processo G", Situacao.PENDENTE, 20f);
		Tarefa task8 = new Tarefa(8, "Processo H", Situacao.PENDENTE, 10f);

		//Adicionando um elemento a Fila
		new Fila().insere(agenda, task1);
		new Fila().insere(agenda, task2);
		new Fila().insere(agenda, task3);
		new Fila().insere(agenda, task4);
		new Fila().insere(agenda, task5);
		new Fila().insere(agenda, task6);
		new Fila().insere(agenda, task7);
		new Fila().insere(agenda, task8);
		
		//Consulta tamanho da Fila
		System.out.println("Comprimento da Fila de " + agenda.size());
		System.out.println(agenda);
		
		//Remover filtrando por Situação
		agenda.stream().filter(
				p-> p.getSituacao().equals(Situacao.PENDENTE))
		.forEach(i -> System.out.println(i));
		
		//Remover em massa
		agenda.removeIf(p -> p.getDuracao() == 10f);
		System.out.println(agenda);	
		
		//Gerar uma sub Fila
		agenda.removeIf(p ->!p.getSituacao().equals(Situacao.PENDENTE));
		List<Tarefa> subFila = agenda;
		System.out.println(subFila);
		
		Tarefa taskSearch = new Fila().consulta(subFila, Posicao.FIRST);
		System.out.println(taskSearch);
		
	}
}
