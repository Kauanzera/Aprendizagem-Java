package sec14.excecoes.exPersonalizadas.muitoRuim.aplicacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import sec14.excecoes.exPersonalizadas.muitoRuim.model.entidades.Reserva;

public class Programa {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.print("Número do Quarto: ");
		int numQuarto = sc.nextInt();
		System.out.print("Data do Check-in (DD/MM/AAAA): ");
		LocalDate checkin = LocalDate.parse(sc.next(), dtf);
		System.out.print("Data do Check-out (DD/MM/AAAA): ");
		LocalDate checkout = LocalDate.parse(sc.next(), dtf);
		
		if (!checkout.isAfter(checkin)) {
			System.out.println("ERRO NA RESERVA! -> A data de Check-Out deve ser posterior à de Check-In!");
		}
		else {
			Reserva r = new Reserva(numQuarto, checkin, checkout);
			System.out.println(r);
			
			System.out.print("Número do Quarto: ");
			numQuarto = sc.nextInt();
			System.out.print("Data do Check-in (DD/MM/AAAA): ");
			checkin = LocalDate.parse(sc.next(), dtf);
			System.out.print("Data do Check-out (DD/MM/AAAA): ");
			checkout = LocalDate.parse(sc.next(), dtf);
			
			if (checkin.isBefore(LocalDate.now()) || checkout.isBefore(LocalDate.now())) {
				System.out.println("ERRO NA RESERVA! -> A data de reserva para atualização deve ser data futura!");
			}
			else if (!checkout.isAfter(checkin)) {
				System.out.println("ERRO NA RESERVA! -> A data de Check-Out deve ser posterior à de Check-In!");				
			}
			else {
				Reserva r2 = new Reserva(numQuarto, checkin, checkout);
				System.out.println(r2);
			}
			
		}
		
		sc.close();
	}

}
