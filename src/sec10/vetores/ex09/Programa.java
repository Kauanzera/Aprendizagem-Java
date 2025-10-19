package sec10.vetores.ex09;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String maisVelho = "";
		int idadeMaisVelho = 0;
		
		System.out.print("Quantas pessoas você irá digitar: ");
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Nome: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			
			if (idade[i] > idadeMaisVelho) {
				idadeMaisVelho = idade[i];
				maisVelho = nome[i];
			}
			
		}
		
		System.out.printf("Mais Velho: %s", maisVelho);
		
		sc.close();
	}

}
