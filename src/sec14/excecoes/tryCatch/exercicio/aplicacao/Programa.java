package sec14.excecoes.tryCatch.exercicio.aplicacao;

import java.util.Scanner;

import sec14.excecoes.tryCatch.exercicio.model.entidades.Conta;
import sec14.excecoes.tryCatch.exercicio.model.execoes.execaoDominio;

public final class Programa {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Bloco de coleta de dados e declaração de contrutor
			System.out.println("Informe os dados da conta:");
			System.out.print("Número: ");
			int num = sc.nextInt();
			sc.nextLine();	//Buffer
			System.out.print("Titular: ");
			String titular = sc.nextLine();
			System.out.print("Saldo Inicial: R$ ");
			double salInicial = sc.nextDouble();
			System.out.print("Limite de saque: R$ ");
			double limiteSaque = sc.nextDouble();
			
			Conta conta = new Conta(num, titular, salInicial, limiteSaque);
			
			System.out.print("\nInforme uma quantia para saque: R$ ");
			double saque = sc.nextDouble();
			
		try {
			//Executa o saque, se ocorrer alguma exeção, o próprio método já tratará
			conta.saque(saque);
			System.out.printf("Novo Saldo: R$ %.2f", conta.getSaldo());	//Exibe o novo saldo, caso não lance exeção
		}
		//Saque excedente ao limite da conta / Saldo Insuficiente
		catch(execaoDominio e) {
			//Imprime a mensagem padrão para exeções, e a mensagem descrita conforme a condição que gerou a exeção
			System.out.printf("ERRO DE SAQUE! -> %s", e.getMessage());
		}
				
		sc.close();
	}

}
