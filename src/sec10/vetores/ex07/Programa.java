package sec10.vetores.ex07;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números serão digitados: ");
		int n = sc.nextInt();
		
		double media = 0;
		double[] num = new double[n];
		
		for (int i = 0; i < num.length; i++) {
			System.out.print("Digite um número: ");
			num[i] = sc.nextDouble();
			media += num[i];
		}
		
		media /= n;
		
		System.out.printf("\nMédia do vetor = %.3f", media);
		
		System.out.println("\nElementos abaixo da média:");
		for (int i = 0; i < num.length; i++) {
			if (media > num[i]) {
				System.out.printf("%.1f\n", num[i]);
			}
		}
		
		sc.close();
	}

}
