package sec10.vetores.ex03;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int menorIdade = 0;
		double altMedia = 0;
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %dª pessoa:\n", i+1);
			
			System.out.print("Nome: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
			
			altMedia += altura[i];
			
			if (idade[i] < 16) {
				menorIdade += 1;
			}
		}
		
		System.out.printf("\nAltura Média: %.2f", altMedia / n);
		System.out.printf("\nPessoas com menos de 16 anos: %d%%", menorIdade * 100 / n);
		
		for (int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				System.out.printf("\n%s", nome[i]);
			}
		}
		
		
		sc.close();
	}

}
