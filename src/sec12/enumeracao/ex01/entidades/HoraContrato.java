package sec12.enumeracao.ex01.entidades;

import java.time.LocalDate;

public class HoraContrato {
	
	private LocalDate date;
	private Double valHora;
	private Integer horas;
	
	public HoraContrato() {}
	
	public HoraContrato(LocalDate date, Double valHora, Integer horas) {
		this.date = date;
		this.valHora = valHora;
		this.horas = horas;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getValHora() {
		return valHora;
	}

	public void setValHora(Double valHora) {
		this.valHora = valHora;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	
	public Double valTotal() {
		return valHora * horas;
	}

}
