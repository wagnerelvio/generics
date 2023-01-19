package br.com.welc.programa;

public class Carro {
	private String nome;

	
	public Carro(String nome) {
	//	super();
		this.nome = nome;
	}
	
	
	
	

	@Override
	public String toString() {
		return " Carro [Modelo=" + nome + "]";
	}





	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
