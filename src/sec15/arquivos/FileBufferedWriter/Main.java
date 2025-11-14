package sec15.arquivos.FileBufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		
		String[] linhas = new String[] { "Bom dia!", "Boa Tarde!", "Boa Noite!" };
		String pasta = "C:\\temp\\out.txt";
		
		//Trata os métodos que, se não existir o arquivo declarado, cria um novo, e se existir, atualiza o atual, MODIFICANDO os dados existentes
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(pasta))){
		//Trata os métodos que EXISTEM e atualiza, ADICIONANDO os dados existentes
		//try (BufferedWriter bw = new BufferedWriter(new FileWriter(pasta, true))){
			
			for (String l : linhas) {
				bw.write(l);	//Escreva o valor passado como argumento, no arquivo passado como argumento na instanciação do try
				bw.newLine();	//Pula pra próxima linha
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		//stream básica de escrita de caracteres em arquivos
		
	}

}
