package errado.application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double xA, xB, xC, yA, yB, yC, Xarea, Yarea, p;
		String ma;
		
		System.out.println("Entre com as medidas do triângulo X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Entre com as medidas do triângulo Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		p = (xA + xB + xC) / 2;
		Xarea = Math.sqrt(p * (p-xA) * (p-xB) * (p-xC));
		
		p = (yA + yB + yC) / 2;
		Yarea = Math.sqrt(p * (p-yA) * (p-yB) * (p-yC));
		
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
