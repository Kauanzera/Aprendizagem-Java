package sec9.ex01.aplicacao;

import java.util.Scanner;
import sec9.ex01.entidades.Banco;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Banco bc = new Banco();

		System.out.print("Informe o número da sua conta: "); 
		bc.setNumeroConta(sc.nextInt());
		
		sc.nextLine();
		System.out.print("Informe seu nome: ");
		bc.setNome(sc.nextLine());
				
		System.out.print("Deseja realizar um depósito inicial? (s/n) → ");
		String di = sc.next();
		
		if (di.equals("s")) {
			System.out.print("Insira um valor inicial: R$ ");
			bc.setDepositoInicial(sc.nextDouble());
			bc.setDeposito(bc.getDepositoInicial());
		}
		
		System.out.print(bc);
		
		System.out.print("\nEntre com o valor do depósito: → ");
		bc.setDeposito(sc.nextDouble());
		bc.deposito(bc.getDeposito());
		
		System.out.print("\nDADOS ATUALIZADOS" + bc);
		
		System.out.print("\nEntre com o valor do saque: → ");
		bc.setSaque(sc.nextDouble());
		bc.sacar(bc.getSaque());
		
		System.out.print("\nDADOS ATUALIZADOS" + bc);
				
		sc.close();
	}

}
