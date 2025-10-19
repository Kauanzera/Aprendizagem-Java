package sec10.listas.exercicio.entidades;

public class Funcionario {
	
	private Integer id;
	private String nome;
	private Double sal;
	
	//Construtor
	public Funcionario() {}
	
	public Funcionario(Integer id, String nome, Double sal) {
		this.id = id;
		this.nome = nome;
		this.sal = sal;
	}

	//Métodos Acessores
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}
	
	//Calcular Porcentagem de aumento salarial
	public void aumentoSal(Double porcentagem) {
		sal += sal * porcentagem / 100;
	}
	
	
	@Override
	public String toString() {
		return String.format("%d - %s - R$ %.2f\n", id, nome, sal);
	}
	

}
