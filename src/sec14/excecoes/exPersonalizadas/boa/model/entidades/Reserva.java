package sec14.excecoes.exPersonalizadas.boa.model.entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import sec14.excecoes.exPersonalizadas.boa.model.exceptions.ExecaoDominio;

public final class Reserva {
	
	private Integer numQuarto;
	private LocalDate checkin;
	private LocalDate checkout;
	
	public static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Reserva() { super(); }
	public Reserva(Integer numQuarto, LocalDate checkin, LocalDate checkout) {
		
		//Laço condicional para caso ao passar os argumentos para o contrutor, se tiver algo errado ele poderá lançar uma exceção
		if (!checkout.isAfter(checkin)) {
			throw new ExecaoDominio("A data de Check-Out deve ser posterior a de Check-In!");
		}
		
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
	
	public void atualizarData(LocalDate checkin, LocalDate checkout) {
		
		if (checkin.isBefore(LocalDate.now()) || checkout.isBefore(LocalDate.now())) {
			throw new ExecaoDominio("A data de reserva para atualização deve ser data futura!");
		}
		if (!checkout.isAfter(checkin)) {
			throw new ExecaoDominio("A data de Check-Out deve ser posterior a de Check-In!");		
		}
		
		this.checkin = checkin;
		this.checkout = checkout;
	}
	
	@Override
	public String toString() {
		return String.format("Quarto: %d, Check-In: %s, Check-Out: %s, %d noites.", numQuarto, checkin.format(fmt), checkout.format(fmt), duracao());
	}
	

}
