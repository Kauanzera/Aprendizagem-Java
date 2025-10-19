package sec10.listas.exercicio.aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import sec10.listas.exercicio.entidades.Funcionario;

public class Programa {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		Instânciei uma lista usando a classe 'Funcionario' como o tipo dela, para incluir dados na lista de forma dinâmica
		List<Funcionario> list = new ArrayList<>();
		
		System.out.print("Quantos funcionários serão registrados: ");
		int func = sc.nextInt();
		
		for (int i = 0; i < func; i++) {
			System.out.printf("\nFuncionário #%d:\n", i+1);
			
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			
			while(existeId(list, id)) {
				System.out.print("O id digitado já existe, tente novamente: ");
				id = sc.nextInt();
			}
			
			sc.nextLine();	//Consumir a quebra de linha
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Salário: R$ ");
			Double sal = sc.nextDouble();
			
//			Inserindo dados na classe funcionario, passando os argumentos do construtor
			Funcionario f = new Funcionario(id, nome, sal);			
			
//			Inserindo os dados da classe 'funcionario' toda em um único espaço da lista (Inicialmente na posição 0, no próximo loop na 1...)
			list.add(f);
			
		}
		
		System.out.print("Insira o Id do funcionário que receberá aumento: ");
		int idAumento = sc.nextInt();
		
		//Método usando o .stream() para verificar se o id digitado existe na lista
		Funcionario fun = list.stream().filter(x -> x.getId() == idAumento).findFirst().orElse(null);
		//Acionando o stream na list e filtrando, verifico se existe esse ID usando expressões LAMBDA, e determino o que sera inserido na váriavel 'fun'
		
		if (fun == null) {
			System.out.println("Esse id não existe!");
		}
		else {
			System.out.print("Digite a porcentagem: ");
			double porcentagem = sc.nextDouble();
			fun.aumentoSal(porcentagem);
		}
		
		System.out.println("\nLista de Funcionários");
		for (Funcionario f : list) {
			System.out.print(f);
		}
		
		sc.close();
	}
	
	
	//Classe auxiliar: Verificará se o id inserido no cadastro já existe, e se caso já exista, retornará com valor lógico 'false'
	public static boolean existeId(List<Funcionario> list, int id) {
		
		Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		//Retorna uma condição com um valor lógido, como se fosse um if retornando 'true' ou 'false'
		return func != null;
		
	}

}
