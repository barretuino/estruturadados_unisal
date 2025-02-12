package pjAula1;

public class Teste {
	public static void main(String[] args) {
		Cliente novo = new Cliente();
		novo.incluir(765, -0.000_1000f);		
		System.out.println(novo.escreve());
	}
}
