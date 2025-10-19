package sec10.matriz.exercicio;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Tamanho da matriz (linhas - colunas): ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		//Criação da matriz, declarando seus respectivos tamanhos
		int[][] mat = new int[n][m];
		
		//Obtenção dos valores da matriz
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("\nNúmero desejado encontrar a posição: ");
		int pos = sc.nextInt();
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				
				//Verifica a posição do valor desejado
				if (pos == mat[i][j]) {
					System.out.printf("Posição de %d: %d, %d", pos, i, j);
					
					if (j > 0) {
						System.out.printf("\nEsquerda de %d: %d", pos, mat[i][j - 1]);	//Coluna - 1						
					}
					if (i > 0) {
						System.out.printf("\nAcima de %d: %d", pos, mat[i - 1][j]);		//Linha - 1
					}
					if (j < mat[i].length - 1) {
						System.out.printf("\nDireira de %d: %d", pos, mat[i][j + 1]);	//Coluna + 1
					}
					if (i < mat.length - 1) {
						System.out.printf("\nAbaixo de %d: %d\n", pos, mat[i + 1][j]);	//Linha + 1
					}
					
				}
				
				
			}
		}
		
		
//		for (int i = 0; i < mat.length; i++) {
//			for (int j = 0; j < mat[i].length; j++) {
//				System.out.printf("%d ", mat[i][j]);
//			}
//		}
		
		
				
		sc.close();
	}

}
