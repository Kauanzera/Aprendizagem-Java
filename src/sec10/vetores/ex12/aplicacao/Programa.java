package sec10.vetores.ex12.aplicacao;

import java.util.Scanner;

import sec10.vetores.ex12.entidades.Reserva;

public class Programa {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos quartos serão reservados: ");
		int n = sc.nextInt();
		
		Reserva[] r = new Reserva[10];
		
		for (int i = 1; i <= n; i++) {
			System.out.printf("\nReserva #%d\n", i);
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			
			System.out.print("Quarto: ");
			int numeroQuarto = sc.nextInt();
			
			r[numeroQuarto] = new Reserva(nome, email);
			
		}
		
		System.out.printf("\nQuartos Reservados: \n");
		for (int i = 0; i < 10; i++) {
			if (r[i] != null) {
				System.out.printf("%d: %s", i, r[i]);
			}
		}
		
		sc.close();
	}

}
