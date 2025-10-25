package sec13.sobreposicao.aula1.entidades;

public class ContaEmpresarial extends Conta {
	
	private Double creditoLimite;
	
	public ContaEmpresarial () {}
	public ContaEmpresarial(Integer numero, String titular, Double saldo, Double creditoLimite) {
		super(numero, titular, saldo);
		this.creditoLimite = creditoLimite;
	}

	public Double getCreditoLimite() {
		return creditoLimite;
	}

	public void setCreditoLimite(Double creditoLimite) {
		this.creditoLimite = creditoLimite;
	}
	
	public void credito(Double montante) {
		if (montante <= creditoLimite) {
			saldo += montante - 10.0;
		}
	}
	
	@Override
	public void saque(Double montante) {
		super.saque(montante);		//É possível reutilizar a lógica de outro método usando o super
		saldo -= 2.0;
	}
	
}
