package sec13.abstacao.ex01.aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import sec13.abstacao.ex01.entidades.Circulo;
import sec13.abstacao.ex01.entidades.Forma;
import sec13.abstacao.ex01.entidades.Retangulo;
import sec13.abstacao.ex01.entidades.enums.Cor;

public class Programa {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Forma> list = new ArrayList<>();
		
		System.out.print("Quantidades de figuras: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.printf("Dados da #%d figura: ", i);
			System.out.print("Retângulo ou Circulo (c/r): ");
			char f = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Cor (Preto/Azul/Vermelho): ");
			Cor cor = Cor.valueOf(sc.next());
			sc.nextLine();
			
			if (f == 'c') {
				System.out.print("Raio: ");
				double raio = sc.nextDouble();
				sc.nextLine();
				list.add(new Circulo(cor, raio));
			} else {
				System.out.print("Altura: ");
				double altura = sc.nextDouble();
				sc.nextLine();
				System.out.print("Largura: ");
				double largura = sc.nextDouble();
				sc.nextLine();
				list.add(new Retangulo(cor, altura, largura));
			}
		}
		
		System.out.println("\nÁrea da(s) forma(s): ");
		for (Forma f : list) {
			System.out.printf("%.2f\n", f.area());
		}
		
		sc.close();
	}

}
