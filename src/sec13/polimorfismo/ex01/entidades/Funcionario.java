package sec13.polimorfismo.ex01.entidades;

public class Funcionario {
	
	private String nome;
	private Integer horas;
	private Double valPorHora;
	
	public Funcionario() {}
	public Funcionario(String nome, Integer horas, Double valPorHora) {
		this.nome = nome;
		this.horas = horas;
		this.valPorHora = valPorHora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public Double getValPorHora() {
		return valPorHora;
	}

	public void setValPorHora(Double valPorHora) {
		this.valPorHora = valPorHora;
	}
	
	
	public Double pagamento() {
		return valPorHora * horas;
	}
	

}
