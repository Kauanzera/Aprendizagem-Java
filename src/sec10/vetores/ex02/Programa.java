package sec10.vetores.ex02;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números cê vai digitar: ");
		int n = sc.nextInt();
		
		double[] num = new double[n];
		double soma = 0, media;
		
		for (int i = 0; i < num.length; i++) {
			System.out.print("Digite o número: ");
			num[i] = sc.nextDouble();
			soma += num[i];
		}
		
		media = soma / n;
		
		System.out.print("\nValores:");
		
		for (int i = 0; i < num.length; i++) {
			System.out.printf(" %.2f ", num[i]);
		}
		System.out.printf("\nSoma: %.2f \nMédia: %.2f", soma, media);
		
		
		sc.close();
	}

}
