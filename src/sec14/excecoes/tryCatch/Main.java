package sec14.excecoes.tryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		metodo1();
		
		System.out.println("Fim do Programa!");
		
	}
	
	
	public static void metodo1() {
		System.out.println("*** Ínicio do Método 1 ***");
		metodo2();
		System.out.println("*** Fim do Método 1 ***");
	}
	
	
	public static void metodo2() {
		System.out.println("*** Ínicio do Método 2 ***");
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int pos = sc.nextInt();
			System.out.println(vect[pos]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("POSIÇÃO INVÁLIDA, JUMENTO!");
		}
		catch (InputMismatchException e) {
			System.out.println("ERA PRA INSERIR UM NÚMERO, SEU BURRO!");
		}
		
		sc.close();
		System.out.println("*** Fim do Método 2 ***");
		
	}

}
