package sec13.polimorfismo.ex01.aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import sec13.polimorfismo.ex01.entidades.Funcionario;
import sec13.polimorfismo.ex01.entidades.FuncionarioTerceiro;

public class Programa {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insirá o número de funcionários: ");
		int cont = sc.nextInt();
		
		//Lista com os funcionários que serão inseridos
		List<Funcionario> list = new ArrayList<>();
		
		//Dados do funcionário
		for (int i = 0; i < cont; i++) {
			System.out.printf("\nDados do Funcionário #%d: \n", i + 1);
			System.out.print("Funcionário Tercerizado (s/n): ");
			char ch = sc.next().charAt(0);	//Pega o primeiro digito
			sc.nextLine();	//Recolhe o buffer (\n) deixado pelo sc.next()
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Horas: ");
			int horas = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Valor por hora: ");
			double valporhora = sc.nextDouble();
			sc.nextLine();
			
			//Verifica se o funcionário é tercerizado ou não
			if (ch == 's') {
				System.out.print("Taxa adicional: ");
				double adicional = sc.nextDouble();
				//Se for, a variável do tipo Funcionario, será instânciada dentro na classe FuncionarioTerceiro, pois ele receberá adicional
				Funcionario func = new FuncionarioTerceiro(nome, horas, valporhora, adicional);
				list.add(func);
			}
			else {
				//Se não for, a variável do tipo Funcionario será instânciada na classe Funcionario mesmo, por não haver adicional nenhum
				Funcionario func = new Funcionario(nome, horas, valporhora);
				list.add(func);
			}
		}
		
		//Impressão dos funcionários inseridos anteriormente
		System.out.print("\nPagamentos: \n");
		for (Funcionario f : list) {
			System.out.printf("%s - R$ %.2f\n", f.getNome(), f.pagamento());
			
		}
		
		sc.close();
	}

}
