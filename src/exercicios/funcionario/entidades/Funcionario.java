package exercicios.funcionario.entidades;

public class Funcionario {
	
	public String nome;
	public double SalBruto;
	public double Imposto;
	
	public double SalLiquido() {
		return SalBruto - Imposto;
	}
	
	public void SalAumento(double porcentagem) {
		SalBruto += porcentagem / 100 * SalBruto;
	}

	public String toString() {
		return String.format("Funcionário: %s, R$%.2f\n", nome, SalLiquido());
	}
	
}
