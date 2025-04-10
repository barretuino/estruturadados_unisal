package pjAula9;

public class Tarefa {
	//Atributos
	private int id;
	private String nome;
	private Situacao situacao;
	private float duracao;
	
	//Métodos Construtor
	public Tarefa() {
	}	
	public Tarefa(int id, String nome, Situacao situacao, float duracao){
		super();
		this.id = id;
		this.nome = nome;
		this.situacao = situacao;
		this.duracao = duracao;
	}
	
	//Metodos
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Situacao getSituacao() {
		return situacao;
	}
	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}
	public float getDuracao() {
		return duracao;
	}
	public void setDuracao(float duracao) {
		this.duracao = duracao;
	}	
	
	@Override
	public String toString() {
		return "<<ID: " + getId()
			+ " Nome: " + getNome()
			+ " Situação: " + getSituacao()
			+ " Duração: " + getDuracao() + "<<";
	}
}
