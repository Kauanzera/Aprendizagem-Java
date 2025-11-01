package sec14.excecoes.blocoFinally;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		File file = new File("C:\\temp\\in.txt");		//Classe File para localizar arquivos em um endereço expecífico
		Scanner sc = null;		//Declarando um Scanner vazio
		
		try {
			sc = new Scanner(file);		//O Scanner consegue ler arquivos de texto também, caso existam no endereço onde foi informado
			while (sc.hasNextLine()) {	//Enquanto tiver informação na próxima linha, execute...
				System.out.println(sc.nextLine());		//O Scanner lê o conteúdo do arquivo e já logo imprime, por estar dentro de um 'sysout'
			}
		}
		catch (FileNotFoundException e) {
			System.out.printf("Erro ao abrir arquivo: %s\n", e.getMessage());		//Tratamento caso o arquivo não seja encontrado, imprimindo o motivo da exceção
		}
		
		finally {	//Garante que a condição dentro de seu escopo ocorra, mesmo que dispare uma exceção
			if (sc != null) {		//Se o Scanner NÃO estiver vazio (null), finalize o Scanner
				sc.close();
			}
			System.out.println("Finally executado com sucesso!");
		}
	}

}
