package exemplo2.entities;

public class Produto {
	
	public String nome;
	public double preco;
	public int quantidade;
	
	public double ValorTotalEstoque() {
		return quantidade * preco;
	}
	
	public void AddProdutos(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void RemoverProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return String.format("Dados do Produto: %s - R$%.2f - %s unidades. Valor Total em Estoque: R$%.2f\n", 
				nome, preco, quantidade, ValorTotalEstoque());
	}

}
