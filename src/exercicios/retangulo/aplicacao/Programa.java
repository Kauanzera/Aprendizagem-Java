package exercicios.retangulo.aplicacao;

import java.util.Scanner;
import exercicios.retangulo.entidades.Retangulo;

public class Programa {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Retangulo r = new Retangulo();
		
		System.out.println("Insira a altura e a largura do retângulo: ");
		
		r.altura = sc.nextDouble();
		r.largura = sc.nextDouble();
		
		System.out.print(r);
		
		sc.close();
	}

}
