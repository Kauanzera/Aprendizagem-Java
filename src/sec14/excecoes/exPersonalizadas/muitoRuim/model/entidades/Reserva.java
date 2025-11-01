package sec14.excecoes.exPersonalizadas.muitoRuim.model.entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reserva {
	
	private Integer numQuarto;
	private LocalDate checkin;
	private LocalDate checkout;
	
	public static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Reserva() { super(); }
	public Reserva(Integer numQuarto, LocalDate checkin, LocalDate checkout) {
		this.numQuarto = numQuarto;
		this.checkin = checkin;
		this.checkout = checkout;
	}
	
	public Integer getNumQuarto() {
		return numQuarto;
	}
	
	public void setNumQuarto(Integer numQuarto) {
		this.numQuarto = numQuarto;
	}
	
	public LocalDate getCheckin() {
		return checkin;
	}
	
	public LocalDate getCheckout() {
		return checkout;
	}
	
	public long duracao() {
		return checkout.getDayOfYear() - checkin.getDayOfYear();
	}
	
	public void attData(LocalDate checkin, LocalDate checkout) {
		this.checkin = checkin;
		this.checkout = checkout;
	}
	
	@Override
	public String toString() {
		return String.format("Quarto: %d, Check-In: %s, Check-Out: %s, %d noites.", numQuarto, checkin.format(fmt), checkout.format(fmt), duracao());
	}
	

}
