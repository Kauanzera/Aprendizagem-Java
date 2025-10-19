package sec10.vetores.ex08;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int par = 0, media = 0;
		
		System.out.print("Quantos elementos o vetor terá: ");
		int n = sc.nextInt();
		
		int[] num = new int[n];
		
		for (int i = 0; i < num.length; i++) {
			System.out.print("Digite um número: ");
			num[i] = sc.nextInt();
			
			if (num[i] % 2 == 0) {
				par += num[i];
				media += 1;
			}else {
				media = 1;
			}
		}
		
		par /= media;
		
		if (par != 0) {
			System.out.printf("Soma dos números pares: %d", par);			
		}
		else {
			System.out.print("NENHUM NÚMERO PAR!");				
		}
		
		sc.close();
	}

}
