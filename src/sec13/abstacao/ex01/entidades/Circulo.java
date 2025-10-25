package sec13.abstacao.ex01.entidades;

import sec13.abstacao.ex01.entidades.enums.Cor;

public final class Circulo extends Forma {

	private Double raio;
	
	public Circulo() { super(); }
	public Circulo(Cor cor, Double raio) {
		super(cor);
		this.raio = raio;
	}
	
	public Double getRaio() {
		return raio;
	}
	
	public void setRaio(Double raio) {
		this.raio = raio;
	}
	
	@Override
	public final double area() {
		return Math.PI * Math.pow(raio, 2);
	}
	
}
