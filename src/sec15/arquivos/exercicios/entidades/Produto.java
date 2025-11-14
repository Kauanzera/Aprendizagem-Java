package sec15.arquivos.exercicios.entidades;

public final class Produto {
	
	private String nome;
	private Double valor;
	private Integer qntd;
	
	public Produto() { super(); }
	public Produto(String nome, Double valor, Integer qntd) {
		this.nome = nome;
		this.valor = valor;
		this.qntd = qntd;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getValor() {
		return valor;
	}
	
	public Integer getQntd() {
		return qntd;
	}
	
	public void setQntd(Integer qntd) {
		this.qntd = qntd;
	}
		
	public Double total() {
		return valor * qntd;
	}
	
	@Override
	public String toString() {
		return String.format("%s, R$ %.2f\n", getNome(), total());
	}

}
