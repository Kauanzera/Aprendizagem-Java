package sec13.abstacao.ex02.entidades;

public final class PesJuridica extends Pessoa {
	
	private Integer numFuncionarios;
	
	public PesJuridica() { super(); }
	public PesJuridica(String nome, Double gastoAnual, Integer numFuncionarios) {
		super(nome, gastoAnual);
		this.numFuncionarios = numFuncionarios;
	}

	public Integer getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(Integer numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}

	@Override
	public final Double imposto() {
		if (numFuncionarios > 10) {
			return gastoAnual * 0.14;
		}
		else {
			return gastoAnual * 0.16;
		}
	}

}
