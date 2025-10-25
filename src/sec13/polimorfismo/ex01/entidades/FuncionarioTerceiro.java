package sec13.polimorfismo.ex01.entidades;

public class FuncionarioTerceiro extends Funcionario {
	
	private Double despesaAdicional;

	public FuncionarioTerceiro() { super(); }
	public FuncionarioTerceiro(String nome, Integer horas, Double valPorHora, Double despesaAdicional) {
			super(nome, horas, valPorHora);
		this.despesaAdicional = despesaAdicional;
	}
	
	public Double getDespesaAdicional() {
		return despesaAdicional;
	}
	
	public void setDespesaAdicional(Double despesaAdicional) {
		this.despesaAdicional = despesaAdicional;
	}
	
	@Override
	public final Double pagamento() {
		return super.pagamento() + despesaAdicional * 1.1;
	}

}
