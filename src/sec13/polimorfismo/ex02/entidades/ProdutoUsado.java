package sec13.polimorfismo.ex02.entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//Classe filha / SubClasse
public final class ProdutoUsado extends Produto {

	private LocalDate dataFab;

	public ProdutoUsado() { super(); }
	public ProdutoUsado(String nome, Double preco, LocalDate dataFab) {
		super(nome, preco);
		this.dataFab = dataFab;
	}
	
	public LocalDate getDataFab() {
		return dataFab;
	}
	
	public void setDataFab(LocalDate dataFab) {
		this.dataFab = dataFab;
	}
	
	//POLIMORFISMO: Formatando o método da classe mãe com informações diferentes
	@Override
	public final String etiquetaPreco() {
		return String.format("%s (usado) - R$ %.2f (Fabricação: %s)", nome, preco, dataFab.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	}
	
}
