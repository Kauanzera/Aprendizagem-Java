package sec10.vetores.ex10;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serão digitados: ");
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		double[] media1 = new double[n];
		double[] media2 = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Digite nome e notas do %dº aluno: \n", i+1);
			sc.nextLine();
			nome[i] = sc.nextLine();

			media1[i] = sc.nextDouble();
			media2[i] = sc.nextDouble();	
		}
		
		System.out.println("Alunos Aprovados: ");
		for (int i = 0; i < n; i++) {
			if ((media1[i] + media2[i]) / 2 >= 6.0) {
				System.out.println(nome[i]);
			}
		}
		
		sc.close();
	}

}
