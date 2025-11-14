package sec15.arquivos.file.Manipulacao_Pastas;

import java.io.File;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira um diretório: ");
		String strDir = sc.nextLine();
		
		File dir = new File(strDir);
		
		File[] pastas = dir.listFiles(File::isDirectory);	//Verifica se o item da lista é um diretório (Pasta), usando expressão LAMBDA
		
		System.out.println("\nDIRETÓRIOS:");
		for (File f : pastas) {
			System.out.println(f);	//Imprime cada diretório dentro do caminho passado pelo usuário
		}
		
		File[] arquivos = dir.listFiles(File::isFile);		//Verifica se o item da lista é um arquivo, usando expresão LAMBDA
		
		System.out.println("\nARQUIVOS:");
		for (File f : arquivos) {
			System.out.println(f);	//Imprime cada arquivo dentro do caminho passado pelo usuário
		}
		
		boolean sucesso = new File(strDir + "\\URUBU DU PIX").mkdir();	//Cria um novo diretório no endereço indicado concatenado com o novo diretório
		if (sucesso) {
			System.out.printf("\n** Diretório \"URUBU DU PIX\" criado com sucesso!! **");	//Imprime se o diretório foi criado (true) ou não (false)
		}
		
		sc.close();
	}

}
