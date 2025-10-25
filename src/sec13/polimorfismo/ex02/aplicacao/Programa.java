package sec13.polimorfismo.ex02.aplicacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import sec13.polimorfismo.ex02.entidades.Produto;
import sec13.polimorfismo.ex02.entidades.ProdutoImportado;
import sec13.polimorfismo.ex02.entidades.ProdutoUsado;

public class Programa {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");	//Formatação da data que será inserida
		List<Produto> list = new ArrayList<>();		//Instânciação da lista com o tipo Produto
		
		System.out.print("Quantidade de produtos: ");
		int n = sc.nextInt();
		
		//Laço de repetição for para cadastro dos 'n' itens
		for (int i = 0; i < n; i++) {
			System.out.printf("Dados Produto #%d:\n", i + 1);
			System.out.print("Comum, importado ou usado (c/i/u): ");
			char tipo = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Preço: ");
			double preco = sc.nextDouble();
			sc.nextLine();

			//Laço de condição if para verificar para onde o item cadastrado será armazenado, efetuando o polimorfismo
			if (tipo == 'i') {
				System.out.print("Custo Importação: ");
				double importacao = sc.nextDouble();
				sc.nextLine();
				//Polimorfismo: variável do tipo Produto, sendo instânciada em outra classe com formatações de dados diferentes
				list.add(new ProdutoImportado(nome, preco, importacao));
			}
			else if (tipo == 'u') {
				System.out.print("Data de Fabricação (dd/mm/aaaa): ");
				LocalDate data = LocalDate.parse(sc.next(), fmt);
				sc.nextLine();
				Produto prod = new ProdutoUsado(nome, preco, data);			//Polimorfismo: variável do tipo Produto, sendo instânciada em outra classe com formatações de dados diferentes
				list.add(prod);
			}
			else {
				Produto prod = new Produto(nome, preco);
				list.add(prod);
			}
			
		}
		
		//Impressão das informações dos itens
		System.out.println("\nEtiqueta: ");
		for (Produto p : list) {
			System.out.println(p);
		}
		
		sc.close();
	}

}
