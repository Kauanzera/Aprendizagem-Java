package sec15.arquivos.exercicios.aplicacao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import sec15.arquivos.exercicios.entidades.Produto;

public class Programa {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Arquivo de onde se deseja realizar as próximas ações
		System.out.print("Informe o caminho desejado: ");	// C:\\temp\\ManipulaçãoPastas\\Arquivos\\input.csv
		String caminho = sc.next();

		File arq = new File(caminho);		//Cria a variável de tipo File, passando o caminho informado anteriormente
		String pasta = arq.getParent();		//Extrai somente o caminho do arquivo de onde deseja-se manipular as informações e salva como String
		
		//Evitar aviso de tipo 'unused'
		@SuppressWarnings("unused")
		boolean sucesso = new File(pasta + "\\out").mkdir();		//Cria uma pasta no mesmo local do arquivo informado anteriormente
		String destino = pasta + "\\out\\Summary.csv";			//Salva o local com o arquivo que será criado, para onde as informações vão
		
		List<Produto> list = new ArrayList<>();

		//TryWithResources - Passando a capacidade de leitura dos dados do arquivo passado como argumento
		try (BufferedReader br = new BufferedReader(new FileReader(arq))) {
			
			//Salva a linha atual dentro da variável informada para ser manipulada
			String linha = br.readLine();
			while (linha != null) {	//Enquanto a linha que está sendo lida, não estiver vazia
				String[] dados = linha.split(",");	//Separa os dados da linha a cada vírgula, dentro de um vetor de tipo String

				//Separando as informações do vetor em variáveis distintas, para melhor manipulação
				String nomeProd = dados[0];	
				double valProd = Double.parseDouble(dados[1]);	//Métodos necessários, pois não se é possível fazer um Casting de String pra double/int
				int qtdProd = Integer.parseInt(dados[2]);
				
				//Atribuição de valores pro objeto e pra lista
				Produto prod = new Produto(nomeProd, valProd, qtdProd);
				list.add(prod);
				
				//Próxima linha
				linha = br.readLine();
			}
			
			//TryWithResources - Passando a capacidade de impressão dos dados no arquivo informado como argumento
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(destino))){
				
				//Laço pra impressão dos dados
				for (Produto p : list) {
					bw.write(p.getNome() + String.format(", %.2f", p.total()));		//Escreve as informações na linha vigente
					bw.newLine();		//Próxima linha
				}
				
				//Se não retornar erro, essa mensagem será impressa
				System.out.printf("%s criado com sucesso!", destino);
				
			}
			
			catch(IOException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		sc.close();
	}

}
