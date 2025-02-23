package pjAula2;

public class Produto {
	//Atributos
	private int codigo;
	private String descricao;
	private float valor;

	//Métodos
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return "Código " + getCodigo()
			+ " Descrição " + getDescricao()
			+ " Valor " + getValor();
	}
}
