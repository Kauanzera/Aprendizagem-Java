package sec13.abstacao.ex02.entidades;

public abstract class Pessoa {
	
	protected String nome;
	protected Double gastoAnual;
	
	public Pessoa() { super(); }
	public Pessoa(String nome, Double gastoAnual) {
		this.nome = nome;
		this.gastoAnual = gastoAnual;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getGastoAnual() {
		return gastoAnual;
	}
	
	public void setGastoAnual(Double gastoAnual) {
		this.gastoAnual = gastoAnual;
	}
	
	public abstract Double imposto();

}
