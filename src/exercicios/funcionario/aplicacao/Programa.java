package exercicios.funcionario.aplicacao;

import java.util.Scanner;

import exercicios.funcionario.entidades.Funcionario;

public class Programa {

	public static void main(String[] args) {

		Scanner sc =  new Scanner(System.in);
		Funcionario f = new Funcionario();
		
		System.out.println("Insira os dados do funcinário: ");
		
		System.out.print("Nome: ");
		f.nome = sc.nextLine();
		
		System.out.print("Salário Bruto: R$ ");
		f.SalBruto = sc.nextDouble();
		
		System.out.print("Impostos: R$ ");
		f.Imposto = sc.nextDouble();
		
		System.out.printf("\n" + f);
		
		System.out.print("\nQual a porcentagem do aumento de salário: ");
		f.SalAumento(sc.nextInt());
		
		System.out.printf("\n(Dados Atualizados) " + f);
				
		sc.close();
	}

}
