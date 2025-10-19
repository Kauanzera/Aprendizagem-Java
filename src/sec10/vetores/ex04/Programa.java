package sec10.vetores.ex04;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você deseja inserir: ");
		int n = sc.nextInt();
		
		int[] num = new int[n];
		int cont = 0;
		
		for (int i = 0; i < num.length; i++) {
			System.out.print("Digite o número: ");
			num[i] = sc.nextInt();
		}
		
		System.out.printf("\nNúmeros Pares:\n");
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				System.out.printf("%d  ", num[i]);
				cont += 1;
			}
		}
		System.out.printf("\nQuantidade de pares: %d", cont);		
		
		sc.close();
	}

}
