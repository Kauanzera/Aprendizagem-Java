package sec10.vetores.vet01;

import java.util.Scanner;

public class Vet01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a quantidade de alturas que serão inseridas: ► ");
		int n = sc.nextInt();
		
		double[] altura = new double[n];
		double media = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.print("Insira a altura: ► ");
			altura[i] = sc.nextDouble();
			media += altura[i];
		}
		
		System.out.printf("Média total: %.2f m", media / n);
		
		sc.close();
	}

}
