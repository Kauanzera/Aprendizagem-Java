package sec14.excecoes.exPersonalizadas.Ruim.model.entidades;

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
	
	public String atualizarData(LocalDate checkin, LocalDate checkout) {
		
		if (checkin.isBefore(LocalDate.now()) || checkout.isBefore(LocalDate.now())) {
			return "A data de reserva para atualização deve ser data futura!";
		}
		if (!checkout.isAfter(checkin)) {
			return "A data de Check-Out deve ser posterior à de Check-In!";		
		}
		
		this.checkin = checkin;
		this.checkout = checkout;
		return null;
	}
	
	@Override
	public String toString() {
		return String.format("Quarto: %d, Check-In: %s, Check-Out: %s, %d noites.", numQuarto, checkin.format(fmt), checkout.format(fmt), duracao());
	}
	

}
