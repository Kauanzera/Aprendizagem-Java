package sec10.vetores.ex11;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas: ");
		int n = sc.nextInt();
		
		int qtdMulher = 0, qtdHomem = 0;
		double alturaMaior = 0, alturaMenor = 3, mediaMulher = 0;
		
		double[] altura = new double[n];
		char[] gen = new char[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Altura da %dª pessoa: ", i + 1);
			altura[i] = sc.nextDouble();
			
			System.out.printf("Gênero da %d pessoa: ", i + 1);
			gen[i] = sc.next().charAt(0);
			
			if (alturaMaior < altura[i]) {
				alturaMaior = altura[i];
			} 
			else if (alturaMenor > altura[i]) {
				alturaMenor = altura[i];
			}
			
			if (gen[i] == 'f') {
				qtdMulher += 1;
				mediaMulher += altura[i];
			} else {
				qtdHomem += 1;
			}
			
		}
		
		System.out.printf("Maior Altura: %.2f\n", alturaMaior);
		System.out.printf("Menor Altura: %.2f\n", alturaMenor);
		System.out.printf("Média de altura das mulheres: %.2f\n", mediaMulher / qtdMulher);
		System.out.printf("Quantidade de homens: %d\n", qtdHomem);
		
		
		sc.close();
	}

}
