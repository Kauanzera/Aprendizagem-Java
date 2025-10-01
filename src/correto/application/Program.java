package correto.application;

import java.util.Scanner;
import correto.entities.Triangulo;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Triangulo x, y;
		String ma;
		
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Entre com as medidas do triângulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Entre com as medidas do triângulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double Xarea = x.area();
		double Yarea = y.area();
		
		if (Xarea > Yarea) {
			ma = "X";
		} else if (Yarea > Xarea){
			ma = "Y";
		} else {
			ma = "Mesma Área";
		}
		
		System.out.printf("Área do Triângulo X: %.2f\n", Xarea);
		System.out.printf("Área do Triângulo Y: %.2f\n", Yarea);
		System.out.printf("Maior Área: %s", ma);
		
		sc.close();
	}

}
