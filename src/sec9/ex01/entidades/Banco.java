package sec9.ex01.entidades;

public class Banco {
	
	private int numeroConta;
	private String nome;
	private double depositoInicial;
	private double deposito;
	private double saque;
	
	// Métodos Contrutores
	public Banco() {}
	
	public Banco(int numeroConta, String nome) {
		this.numeroConta = numeroConta;
		this.nome = nome;
	}
	
	//Métodos Acessores
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getDepositoInicial() {
		return depositoInicial;
	}

	public void setDepositoInicial(double depositoInicial) {
		this.depositoInicial = depositoInicial;
	}
	
	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}

	public double getSaque() {
		return saque;
	}

	public void setSaque(double saque) {
		this.saque = saque;
	}

	public void deposito(double deposito) {
		this.deposito = getDepositoInicial() + deposito;
	}
	
	public void sacar(double saque) {
		this.deposito -= (saque + 5);
	}

	public String toString() {
		return String.format("\nDados da Conta: \nNúmero: %d, Titular: %s, Saldo: R$ %.2f\n", getNumeroConta(), getNome(), deposito);
	}

}
