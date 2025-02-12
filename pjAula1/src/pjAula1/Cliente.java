package pjAula1;

public class Cliente {
	//Atributos
	int codigo;
	float faturamento;
	
	//Métodos
	public void incluir(int codigo, float faturamento) {
		this.codigo = codigo;
		this.faturamento = faturamento;
	}
	public String escreve() {
		return "Codigo " + codigo + " faturamento " + faturamento; 
	}
}