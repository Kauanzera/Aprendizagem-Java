package sec9.ex01.aplicacao;

import java.util.Scanner;
import sec9.ex01.entidades.Banco;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Banco bc;

		System.out.print("Informe o número da sua conta: "); 
		int numConta = sc.nextInt();
		
		System.out.print("Informe seu nome: ");
		sc.nextLine();
		String nome = sc.nextLine();
				
		System.out.print("Deseja realizar um depósito inicial? (s/n) → ");
		String di = sc.next();
		
		if (di.equals("s")) {
			System.out.print("Insira um valor inicial: R$ ");
			double depInicial = sc.nextDouble();
			bc = new Banco(numConta, nome, depInicial);		//SOBRECARGA
		} else {
			bc = new Banco(numConta, nome);					//SOBRECARGA
		}
		
		System.out.print(bc);
		
		System.out.print("\nEntre com o valor do depósito: → ");
		double valDeposito = sc.nextDouble();
		bc.deposito(valDeposito);
		
		System.out.print("\nDADOS ATUALIZADOS" + bc);
		
		System.out.print("\nEntre com o valor do saque: → ");
		double valSaque = sc.nextDouble();
		bc.saque(valSaque);
		
		System.out.print("\nDADOS ATUALIZADOS" + bc);
				
		sc.close();
	}

}
