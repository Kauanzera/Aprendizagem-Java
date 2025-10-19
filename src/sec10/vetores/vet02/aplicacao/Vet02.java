package sec10.vetores.vet02.aplicacao;

import java.util.Scanner;
import sec10.vetores.vet02.entidades.Produto;

public class Vet02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos produtos serão inseridos? ► ");
		int n = sc.nextInt();
		
		Produto[] prod = new Produto[n];		//Instânciando um vetor do tipo Produto
		
		for (int i = 0; i < prod.length; i++) {
			System.out.print("Nome do Produto: ");
			sc.nextLine();
			String nome = sc.nextLine();
		
			System.out.print("Preço: ");
			double preco = sc.nextDouble();
			
			prod[i] = new Produto(nome, preco);	//Inserção dos valores no construtor da classe Produto
		}
		
		double media = 0;
		for (int i = 0; i < prod.length; i++) {
			media += prod[i].getPreco();		//Calculo da média dos produtos direto pelo vetor
		}
		
		System.out.printf("Média total dos %d Produto(s): R$ %.2f\n", prod.length, media / prod.length);
		
		sc.close();
	}
}
