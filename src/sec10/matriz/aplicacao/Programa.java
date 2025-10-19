package sec10.matriz.aplicacao;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.printf("%s ", mat[i][j]);
			}
		}
		
		System.out.print("\nDiagonal Principal: ");
		for (int i = 0; i < mat.length; i++) {
			System.out.printf("%s ", mat[i][i]);
		}
		
		int cont = 0;
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					cont++;
				}
			}
		}
		
		System.out.printf("\nQuantidades de números negativos: %d", cont);
		
		sc.close();
	}

}
