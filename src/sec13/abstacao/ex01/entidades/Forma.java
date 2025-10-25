package sec13.abstacao.ex01.entidades;

import sec13.abstacao.ex01.entidades.enums.Cor;

public abstract class Forma {
	
	private Cor cor;

	public Forma() { super(); }
	public Forma(Cor cor) {
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}
	
	//Método Abstrato - Existe somente para ser manipulado por outras classes, usando assim do polimorfismo.
	public abstract double area();
		

}
