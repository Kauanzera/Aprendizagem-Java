package sec11.data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DataHora_GlobalLocal {
	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.parse("2022-07-20");
		LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d03 = Instant.parse("2022-07-20T01:30:25Z");
		
		System.out.printf("%s\n%s\n%s\n", d01, d02, d03);

		LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));
		
		System.out.printf("\nLocalDate (Global para Fuso Horário Local - GMT-3): %s\n", r1);
		System.out.printf("LocalDate (Global para Fuso Horário Portugal - GMT+1): %s\n", r2);
		System.out.printf("LocalDateTime (Global para Fuso Horário Local - GMT-3): %s\n", r3);
		System.out.printf("LocalDateTime (Global para Fuso Horário Portugal - GMT+1): %s\n", r4);
		
		System.out.printf("\nDia do Mês: %s\n", d01.getDayOfMonth());
		System.out.printf("Mês Data: %s\n", d01.getMonthValue());
		System.out.printf("Mês Extenso: %s\n", d01.getMonth());
		System.out.printf("Ano: %s\n", d01.getYear());
		System.out.printf("Hora: %s\n", d02.getHour());
		System.out.printf("Minuto: %s\n", d02.getMinute());
		
		System.out.printf("\nData Formatada: %s \\ %s / %s\n", d01.getDayOfMonth(), d01.getMonthValue(), d01.getYear());
		System.out.printf("Hora Formatada: %sh %sm\n", d02.getHour(), d02.getMinute());
				
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
