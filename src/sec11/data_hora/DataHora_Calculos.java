package sec11.data_hora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DataHora_Calculos {
	public static void main(String[] args) {
		
		LocalDate d1 = LocalDate.now();
		LocalDateTime d2 = LocalDateTime.now();
		Instant d3 = Instant.parse("2022-07-20T01:30:25Z");
		
		LocalDate semanaPassadaLocalDate = d1.minusDays(7);
		LocalDate semanaQueVemLocalDate = d1.plusDays(7);
		
		System.out.printf("Semana passada (LocalDate): %s\n", semanaPassadaLocalDate);
		System.out.printf("Hoje (LocalDate): %s\n", d1);
		System.out.printf("Semana que vem (LocalDate): %s\n", semanaQueVemLocalDate);
		
		LocalDateTime semanaPassadaLocalDateTime = d2.minusDays(7);
		LocalDateTime semanaQueVemLocalDateTime = d2.plusDays(7);
		
		System.out.printf("\nSemana passada (LocalDateTime): %s\n", semanaPassadaLocalDateTime);
		System.out.printf("Hoje (LocalDateTime): %s\n", d2);
		System.out.printf("Semana que vem (LocalDateTime): %s\n", semanaQueVemLocalDateTime);
		
		Instant semanaPassadaInstant = d3.minus(7, ChronoUnit.DAYS);
		Instant semanaQueVemInstant = d3.plus(7, ChronoUnit.DAYS);
		

		System.out.printf("\nSemana passada (Instant): %s\n", semanaPassadaInstant);
		System.out.printf("Hoje (Instant): %s\n", d3);
		System.out.printf("Semana que vem (Instant): %s\n", semanaQueVemInstant);
		
		Duration t1 = Duration.between(d1.atStartOfDay(), semanaQueVemLocalDate.atStartOfDay());	//Por conta da falta de hora no LocalDate, é necessário o uso de complementos passando horário
		Duration t2 = Duration.between(d2, semanaQueVemLocalDateTime);
		Duration t3 = Duration.between(d3, semanaQueVemInstant);
		Duration t4 = Duration.between(semanaQueVemInstant, semanaPassadaInstant);
		
		System.out.printf("\nDiferença (LocalDate): %s dias\n", t1.toDays());
		System.out.printf("Diferença (LocalDateTime): %s dias\n", t2.toDays());
		System.out.printf("Diferença (Instant): %s dias\n", t3.toDays());
		System.out.printf("Diferença (Negativo): %s dias\n", t4.toDays());
		
	}

}
