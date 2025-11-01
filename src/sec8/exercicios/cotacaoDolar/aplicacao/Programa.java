package exercicios.cotacaoDolar.aplicacao;

import java.util.Scanner;
import exercicios.cotacaoDolar.entidades.ConversaoReal;

public class Programa {
	
//	Métodos criados na mesma classe do método main, precisam ser estáticos para serem enxergados por ela.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o valor atual do Dolar: R$ ");
		double d = sc.nextDouble();
		System.out.print("Quantidade que deseja comprar: $ ");
		double q = sc.nextDouble();
		
		System.out.printf("R$ %.2f", ConversaoReal.conv(d, q));	
//		Por conta da instância da variável imposto, e do método de conversão serem estáticos, não é 
//		necessário a instânciação da classe como um objeto, dentro do método main.
		
		sc.close();
	}

}
