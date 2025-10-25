package sec13.abstacao.ex02.entidades;

public final class PesFisica extends Pessoa {
	
	private Double gastoSaude;
	
	public PesFisica() { super(); }
	public PesFisica(String nome, Double gastoAnual, Double gastoSaude) {
		super(nome, gastoAnual);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}
	
	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}
	
	@Override
	public final Double imposto() {
		Double imposto;

		if (gastoAnual < 20000) {
			imposto = gastoAnual * 0.15;
		}
		else {
			imposto = gastoAnual * 0.25;
		}

		if (gastoSaude > 0.0) {
			imposto -= gastoSaude * 0.5;
		}
		
		return imposto;
	}

}
