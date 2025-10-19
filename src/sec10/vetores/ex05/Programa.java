package sec10.vetores.ex05;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você irá digitar: ");
		int n = sc.nextInt();
		
		int pos = 0;
		double maior = 0;
		double[] num = new double[n];
		
		for(int i = 0; i < num.length; i++) {
			System.out.print("Digite um número: ");
			num[i] = sc.nextDouble();
			
			if (num[i] > maior) {
				maior = num[i];
				pos = i;
			}
		}
		
		System.out.printf("Maior Valor = %.2f \nPosição = %d", maior, pos);
		
		sc.close();
	}

}
