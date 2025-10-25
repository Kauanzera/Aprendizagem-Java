package sec13.heranca.aula1.entidades;

public class Conta {
	
	private Integer numero;
	private String titular;
	protected Double saldo;		//O modificador de acesso protected é um private que autoriza o acesso de subclasses (classes filhas que extendem a classe mãe)
	
	
	public Conta() {}
	public Conta(Integer numero, String titular, Double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	
	public Integer getNumero() {
		return numero;
	}
	
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	public void saque(Double montante) {
		saldo -= montante + 5;
	}
	
	public void deposito(Double montate) {
		saldo += montate;
	}
	

}
