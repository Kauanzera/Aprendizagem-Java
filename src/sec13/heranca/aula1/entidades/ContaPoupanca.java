package sec13.heranca.aula1.entidades;

public class ContaPoupanca extends Conta {
	
	private Double taxaJuros;
	
	public ContaPoupanca() { super(); }
	public ContaPoupanca(Integer numero, String titular, Double saldo, Double taxaJuros) {
		super(numero, titular, saldo);
		this.taxaJuros = taxaJuros;
	}
	
	
	public Double getTaxaJuros() {
		return taxaJuros;
	}
	
	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	//Atualização do saldo da conta com a taxa de juros
	public void atualizarSaldo() {
		saldo += saldo * taxaJuros;
	}
	
}
