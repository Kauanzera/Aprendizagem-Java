package sec9.ex01.entidades;

public class Banco {
	
	private int numeroConta;
	private String nome;
	private double saldo;
	
	// Métodos Contrutores	
	public Banco(int numeroConta, String nome) {
		this.numeroConta = numeroConta;
		this.nome = nome;
	}
	
	public Banco(int numeroConta, String nome, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		deposito(depositoInicial);
	}	
	
	//Métodos Acessores
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}
	
	//Métodos de operação
	public void deposito(double deposito) {
		saldo += deposito;
	}
	
	public void saque(double saque) {
		saldo -= (saque + 5);
	}

	public String toString() {
		return String.format("\nDados da Conta: \nNúmero: %d, Titular: %s, Saldo: R$ %.2f\n", getNumeroConta(), getNome(), saldo);
	}

}
