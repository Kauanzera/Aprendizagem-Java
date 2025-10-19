package sec10.vetores.ex06;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Quantos valores cada vetor terá: ");
		int n = sc.nextInt();

		int[] vet1 = new int[n];
		int[] vet2 = new int[n];
		int[] vet3 = new int[n];
		
		System.out.println("Digite os valores do vetor A:");
		for (int i = 0; i < vet1.length; i++) {
			vet1[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:");
		for (int i = 0; i < vet2.length; i++) {
			vet2[i] = sc.nextInt();
		}
		
		System.out.println("Vetor Resultante:");
		for (int i = 0; i < vet3.length; i++) {
			vet3[i] = vet1[i] + vet2[i];
			System.out.printf("%d\n", vet3[i]);
		}
		
		sc.close();
	}

}
