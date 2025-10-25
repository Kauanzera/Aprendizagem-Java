package sec13.abstacao.ex02.aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import sec13.abstacao.ex02.entidades.PesFisica;
import sec13.abstacao.ex02.entidades.PesJuridica;
import sec13.abstacao.ex02.entidades.Pessoa;

public final class Programa {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Pessoa> list = new ArrayList<>();
		
		System.out.print("Quantas pessoas serão verificadas: ");
		int n = sc.nextInt();
		
		System.out.println("** IMPOSTÔMETRO **");
		for (int i = 1; i <= n; i++) {
			System.out.printf("Dados do #%d bobão: \n", i);
			System.out.print("Pessoa Física ou Jurídica (j/f): ");
			char tipo = sc.next().toLowerCase().charAt(0);
			sc.nextLine();
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();

			System.out.print("Gastos anuais: ");
			Double gastos = sc.nextDouble();
			sc.nextLine();
			
			if (tipo == 'f') {
				System.out.print("Gastos com Saúde: ");
				Double gastoSaude = sc.nextDouble();
				sc.nextLine();
				list.add(new PesFisica(nome, gastos, gastoSaude));
			}
			else {
				System.out.print("Quantidade de funcionários: ");
				Integer qntd = sc.nextInt();
				sc.nextLine();
				list.add(new PesJuridica(nome, gastos, qntd));
			}
		}
		
		Double total = 0.0;
		System.out.println("\nIMPOSTOS PAGOS: ");
		for (Pessoa p : list) {
			System.out.printf("%s: R$ %.2f\n", p.getNome(), p.imposto());
			total += p.imposto();
		}
		
		System.out.printf("\nTOTAL PAGO EM IMPOSTO: R$ %.2f\n", total);
						
		sc.close();
	}
}
