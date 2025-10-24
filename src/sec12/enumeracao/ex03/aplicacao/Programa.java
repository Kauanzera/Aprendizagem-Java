package sec12.enumeracao.ex03.aplicacao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import sec12.enumeracao.ex03.entidades.Cliente;
import sec12.enumeracao.ex03.entidades.Pedido;
import sec12.enumeracao.ex03.entidades.PedidoItem;
import sec12.enumeracao.ex03.entidades.Produto;
import sec12.enumeracao.ex03.entidades.enums.StatusPedido;

public class Programa {
	public static void main(String[] args) {
		
		LocalDateTime momentoAtual = LocalDateTime.now();
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira os dados do Cliente: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Aniversário (dd/mm/aaaa): ");
		LocalDate aniversario = LocalDate.parse(sc.next(), fmt);
		
		Cliente cliente = new Cliente(nome, email, aniversario);
		
		System.out.println("Insira os dados do pedido: ");
		System.out.print("Status: ");
		StatusPedido statusPedido = StatusPedido.valueOf(sc.next().trim().toUpperCase());	//.trim().toUpperCase() → Eleva todas as letras para maiúsculo

		Pedido pedido = new Pedido(momentoAtual, statusPedido, cliente);

		System.out.print("Quantos itens nesse pedido: ");
		int cont = sc.nextInt(); 
		sc.nextLine();
		
		for (int i = 0; i < cont; i++) {
			System.out.printf("Insira os dados do #%d item: \n", i + 1);
			
			System.out.print("Nome do produto: ");
			String prodNome = sc.nextLine();
			
			System.out.print("Valor do produto: R$ ");
			double valProduto = sc.nextDouble();
			sc.nextLine();
			
			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();
			sc.nextLine();
			
			Produto produto = new Produto(prodNome, valProduto);
			PedidoItem pi = new PedidoItem(quantidade, valProduto, produto);
			
			pedido.addItem(pi);
			
		}
		
		System.out.println(pedido);
	
		sc.close();
	}

}
