package sec14.excecoes.exPersonalizadas.boa.aplicacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
//import java.util.InputMismatchException;
import java.util.Scanner;

import sec14.excecoes.exPersonalizadas.boa.model.entidades.Reserva;
import sec14.excecoes.exPersonalizadas.boa.model.exceptions.ExecaoDominio;

public final class Programa {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		try {
			System.out.print("Número do Quarto: ");
			int numQuarto = sc.nextInt();
			System.out.print("Data do Check-in (DD/MM/AAAA): ");
			LocalDate checkin = LocalDate.parse(sc.next(), dtf);
			System.out.print("Data do Check-out (DD/MM/AAAA): ");
			LocalDate checkout = LocalDate.parse(sc.next(), dtf);
			
			Reserva r = new Reserva(numQuarto, checkin, checkout);
			System.out.println(r);
			
			System.out.println("Nova Reserva: ");
			System.out.print("Número do Quarto: ");
			numQuarto = sc.nextInt();
			System.out.print("Data do Check-in (DD/MM/AAAA): ");
			checkin = LocalDate.parse(sc.next(), dtf);
			System.out.print("Data do Check-out (DD/MM/AAAA): ");
			checkout = LocalDate.parse(sc.next(), dtf);
			
			r.atualizarData(checkin, checkout);
			System.out.print(r);
		}
		catch(DateTimeParseException e) {
			System.out.println("FORMATO DE DATA INVÁLIDO!!");
		}
		catch(ExecaoDominio e) {
			System.out.printf("Erro na reserva -> %s", e.getMessage());
}
		catch(RuntimeException e /*InputMismatchException e*/) {
			System.out.println("ERRO INESPERADO, FINALIZANDO PROGRAMA!");
		}
		sc.close();
	}

}
