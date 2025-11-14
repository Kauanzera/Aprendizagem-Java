package sec15.arquivos.FileBufferedReader.TryWithResources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		
		//Passando o local do arquivo para uma variável 
		String pasta = "C:\\temp\\in.txt";
		
/*		Try-With-Resources -> Ao invés de realizar aqueles blocos gigantes e bagunçados, simplesmente é só declarar junto do try, 
*		como se fossem argumentos para nosso tratamento de exeções
*/
		try (BufferedReader br = new BufferedReader(new FileReader(pasta))) {			
			String line = br.readLine();
		
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch (IOException e){
			System.out.printf("Erro: %s", e.getMessage());
		}
		
	}

}
