package sec11.data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHora {
	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");			//Formata o formato para instânciação da data
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2023-01-14");
		LocalDateTime d05 = LocalDateTime.parse("2023-01-14T12:15:14");
		Instant d06 = Instant.parse("2023-01-14T12:15:14Z");
		Instant d07 = Instant.parse("2023-01-14T12:15:14-03:00");
		
		LocalDate d08 = LocalDate.parse("14/01/2004", fmt1);					//Permite ser somente instânciado, com a formatação do segundo argumento (fmt1), não imprime com a formatação
		LocalDateTime d09 = LocalDateTime.parse("14/01/2004 13:45", fmt2);
		
		LocalDate d10 = LocalDate.of(1979, 07, 05);		
		LocalDateTime d11 = LocalDateTime.of(1979, 07, 05, 14, 54);
		
		System.out.printf("LocalDate = %s\n", d01);
		System.out.printf("LocalDateTime = %s\n", d02);
		System.out.printf("Instant = %s\n", d03);
		System.out.printf("\nLocalDate (Formatado) = %s\n", d04);
		System.out.printf("LocalDateTime (Formatado) = %s\n", d05);
		System.out.printf("Instant (Formatado) = %s\n", d06);
		System.out.printf("Instant (Formatado GMT-3) = %s\n", d07);
		System.out.printf("\nLocalDate (Instânciado com argumento) = %s\n", d08);
		System.out.printf("LocalDateTime (Instânciado com argumento) = %s\n", d09);
		System.out.printf("\nLocalDate (Formatado .of) = %s\n", d10);
		System.out.printf("LocalDateTime (Formatado .of) = %s\n", d11);
		
		
				
	}

}


/*
 * PADRÃO DE HORÁRIO ISO 8601:
 * 
 * Data-[Hora] Local
 * 2025-10-19
 * 2025-10-19T12:54
 * 2025-10-19T12:54:09
 * 2025-10-19T12:54:09.5420
 * 
 * Data-[Hora] Global
 * 2025-10-19T12:54:09Z				(Zulu Time / UTC - Horário de Londres)
 * 2025-10-19T12:54:09.542015Z		(Zulu Time / UTC - Horário de Londres com Fração de Segundo)
 * 2025-10-19T12:54:09-03:00 		(Fuso Horário GMT-3 - Horário de São Paulo)
 * 
 */