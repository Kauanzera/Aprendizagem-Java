package sec15.arquivos.file.Informacoes_Arquivos;

import java.io.File;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira um diretório de pasta: ");
		String strDir = sc.nextLine();
		
		File path = new File(strDir);
		
		System.out.printf("\nNome do arquivo: getName -> %s\n", path.getName());
		System.out.printf("Endereço até o arquivo: getParent -> %s\n", path.getParent());
		System.out.printf("Endereço completo: getPath -> %s\n", path.getPath());
		
		
		sc.close();
	}

}
