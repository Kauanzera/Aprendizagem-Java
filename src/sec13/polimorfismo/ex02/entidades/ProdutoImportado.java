package sec13.polimorfismo.ex02.entidades;

//Classe filha / SubClasse
public final class ProdutoImportado extends Produto {
	
	private Double custoImportacao;

	public ProdutoImportado() { super(); }
	public ProdutoImportado(String nome, Double preco, Double custoImportacao) {
		super(nome, preco);
		this.custoImportacao = custoImportacao;
	}
	
	public Double getcustoImportacao() {
		return custoImportacao;
	}

	//Método de calculo do valor total com o valor da importação incluso
	public final Double precoTotal() {	
		return preco + custoImportacao;
	}
	
	//POLIMORFISMO: Formatando o método da classe mãe com informações diferentes
	@Override
	public final String etiquetaPreco() {
		return String.format("%s - R$ %.2f (Custo Importação: %.2f)", nome, precoTotal(), custoImportacao);
	}
	
}
