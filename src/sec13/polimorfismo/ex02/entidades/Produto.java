package sec13.polimorfismo.ex02.entidades;

//Classe mãe / SuperClasse
public class Produto {
	
	//Modificador de acesso protected para as classes filhas poderem visualizarem as variáveis
	protected String nome;
	protected Double preco;
	
	public Produto() { super(); }
	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}
	
	//Método principal de formatação da etiqueta, caso o produto seja 'comum'
	public String etiquetaPreco() {
		return String.format("%s - R$ %.2f", nome, preco);
	}
	
	//Impressão do método da etiqueta
	@Override
	public final String toString() {
		return etiquetaPreco();
	}
	
}
