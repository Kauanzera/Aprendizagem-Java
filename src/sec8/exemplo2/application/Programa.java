package exemplo2.application;

import java.util.Scanner;
import exemplo2.entities.Produto;

public class Programa {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Produto p = new Produto();
		
		System.out.println("Entre com os dados desejados do Produto: ");
		
		System.out.print("Nome: ");
		p.nome = sc.next();
		
		System.out.print("Preço: ");
		p.preco = sc.nextDouble();
		
		System.out.print("Quantidade: ");
		p.quantidade = sc.nextInt();
		
		System.out.printf("\n" + p);
		
		System.out.print("\nEntre com a quantidade que será adicionada no estoque: ");
		p.AddProdutos(sc.nextInt());
		
		System.out.printf("\n(ATUALIZADO) " + p);
		
		System.out.print("\nEntre com a quantidade que será retirada do estoque: ");
		p.RemoverProdutos(sc.nextInt());
		
		System.out.printf("\n(ATUALIZADO) " + p);
		
		sc.close();
	}

}
