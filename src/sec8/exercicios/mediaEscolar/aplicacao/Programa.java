package exercicios.mediaEscolar.aplicacao;

import java.util.Scanner;
import exercicios.mediaEscolar.entidades.Aluno;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);		
		Aluno tri = new Aluno();
		
		System.out.print("Aluno: ");
		tri.nome = sc.nextLine();
		
		tri.a = sc.nextInt();
		tri.b = sc.nextInt();
		tri.c = sc.nextInt();
		
		System.out.println(tri);
		
		sc.close();
	}

}
