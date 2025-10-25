package sec13.sobreposicao.aula1.entidades;

public /*final*/ class ContaPoupanca extends Conta {	//Classes 'final' não podem ser herdadas
	
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
	
	//Sobreposição
	@Override		//Serve para avisar ao compilador que está ocorrendo uma sobreposição, fazendo com que o compilador alarme caso o nome do método esteja errado 
	public final void saque(Double montante) {
		saldo -= montante;
	}
	
	/*	Quando usar: É uma boa prática aplicar o final em um método sobreposto, para evitar mais sobreposições uma em cima da outra
	 * 	Performance: Métodos atribuidos como 'final' são analisados mais rapidamente, em seu tempo de execução
	*/

	//Atualização do saldo da conta com a taxa de juros
	public void atualizarSaldo() {
		saldo += saldo * taxaJuros;
	}
	
}
