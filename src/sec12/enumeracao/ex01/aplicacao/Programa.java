package sec12.enumeracao.ex01.aplicacao;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import sec12.enumeracao.ex01.entidades.Trabalhador;
import sec12.enumeracao.ex01.entidades.Departamento;
import sec12.enumeracao.ex01.entidades.HoraContrato;
import sec12.enumeracao.ex01.entidades.enums.NivelTrabalhador;

public class Programa {
	public static void main(String[] args) {
		
		//Formatando o modo que deve ser inserido a data
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Scanner sc = new Scanner(System.in);
		
		//Cadastro do funcionário
		System.out.print("Informe o departamento: ");
		String depto = sc.nextLine();
		System.out.printf("Dados do trabalhador: \nNome: ");
		String nomeTrabalhador = sc.nextLine();
		System.out.print("Nível do trabalhador: ");
		String nivelTrabalhador = sc.nextLine();
		System.out.print("Salário Base: ");
		double salarioBase = sc.nextDouble();
		
		//Construindo o funcionário passando os argumentos do cadastro
		Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, NivelTrabalhador.valueOf(nivelTrabalhador), salarioBase, new Departamento(depto));
		
		System.out.print("\nQuantos contratos o trabalhador tem: ");
		int cont = sc.nextInt();
		
		//Inserindo os dados em cada contrato
		for (int i = 0; i < cont; i++) {
			System.out.printf("\nInsira os dados do #%d contrato: \n", i + 1);
			
			System.out.printf("Data: (dd/mm/aaaa): ");
			LocalDate dataContrato = LocalDate.parse(sc.next(), dtf);
			System.out.print("Valor por hora: ");
			double valorHora = sc.nextDouble();
			System.out.print("Duração do contrato (horas): ");
			int duracao = sc.nextInt();
			
			HoraContrato contrato = new HoraContrato(dataContrato, valorHora, duracao);
			
			trabalhador.addContrato(contrato);
			
		}
		
		System.out.print("\nInsira o mês e o ano que deseja calcular o salário (MM/AAAA): ");
		String mesAno= sc.next();
		int mes = Integer.parseInt(mesAno.substring(0, 2));
		int ano = Integer.parseInt(mesAno.substring(3));

		System.out.printf("\nDados do Trabalhador:  \nNome: %s \nDepartamento: %s \nNível: %s \nSalário de %s: R$ %.2f", 
				trabalhador.getNome(), trabalhador.getDepartamento().getNome(), trabalhador.getNivel(), mesAno, trabalhador.renda(ano, mes));
		
		
		sc.close();
	}
}
