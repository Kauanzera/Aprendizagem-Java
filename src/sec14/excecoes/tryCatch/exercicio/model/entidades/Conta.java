package sec14.excecoes.tryCatch.exercicio.model.entidades;

import sec14.excecoes.tryCatch.exercicio.model.execoes.execaoDominio;

public final class Conta {
	
	private Integer numero;
	private String titular;
	private Double saldo;
	private Double limiteSaque;
	
	public Conta() { super(); }
	public Conta(Integer numero, String titular, Double saldo, Double limiteSaque) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
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

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void deposito(Double montante) {
		this.saldo += montante;
	}

	public void saque(Double montante) {
		verificacaoLimite(montante);
		saldo -= montante;
	}
	
	//Método de verificação para lançamento de exeção personalizada, caso condição seja verdadeira
	public void verificacaoLimite(Double valor) {
		if (valor > getLimiteSaque()) {
			throw new execaoDominio("A quantia excede o limite de saque!");
		}
		if(valor > getSaldo()) {
			throw new execaoDominio("Saldo Insuficiente!");
		}
	}

}
