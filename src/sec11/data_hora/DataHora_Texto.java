package sec11.data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataHora_Texto {
	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.parse("2004-01-14");
		LocalDateTime d02 = LocalDateTime.parse("2004-01-14T01:30:35");
		Instant d03 = Instant.parse("2004-01-14T01:30:35Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());	//Pega o Fuso Horário local da máquina (ZoneId.systemDefault())
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		System.out.printf("LocalDate (fmt1 - 1): %s\n", d01.format(fmt1));
		System.out.printf("LocalDate (fmt1 - 2): %s\n", fmt1.format(d01));											//Ambas as 3 formas de formatação funcionam
		System.out.printf("LocalDate (fmt1 - 3): %s\n", d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.printf("\nLocalDateTime (fmt1): %s\n", d02.format(fmt1));
		System.out.printf("LocalDateTime (fmt2): %s\n", d02.format(fmt2));
		System.out.printf("LocalDateTime (ISO_DATE_TIME): %s\n", d02.format(fmt4));
		
		System.out.printf("\nInstant (fmt3 - Fuso Horário Londres): %s\n", d03);
		System.out.printf("Instant (fmt3 - Fuso Horário Local): %s\n", fmt3.format(d03));
		System.out.printf("Instant (ISO_INSTANT): %s\n", fmt5.format(d03));
		
				
		
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
