package sec15.arquivos.FileBufferedReader.try_Finally;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		
		//Modo "Gambiarra" de se realizar o seguinte código
		
		//Declarando as variáveis que serão usadas, passando seus valores
		String pasta = "C:\\temp\\in.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		//Tratando as exeções, normalmente
		try {
			fr = new FileReader(pasta);	//Estabeleço uma sequência de leitura a partir de um arquivo, navegando pela stream, se necessário ler o arquivo
			br = new BufferedReader(fr);//Utilizando o Buffer de memória, otimiza a leitura do arquivo passado como argumento
			
			String line = br.readLine();//Lê uma linha do arquivo, se estiver no final do arquivo, retorna 'null'
		
			//Condição para caso o arquivo tenha terminado
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch (IOException e){
			System.out.printf("Erro: %s", e.getMessage());
		}
		//Forçando a finalização dos leitores de arquivos
		finally {	
			//Tratamento de erros, pois as condições podem lançar exeções
			try {
				if (fr != null) {
					fr.close();
				}
				if (br != null) {
					br.close();
				}
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
