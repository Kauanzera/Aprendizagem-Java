package sec13.abstacao.informativo;

public abstract class Conta {
	
		
	/**
	 * ABSTRAÇÃO: 
	 * 
	 * CLASSES ABSTRATAS: SÃO CLASSES QUE NÃO PODEM SER INSTÂNCIADAS NA CONSTRUÇÃO DO OBJETO, INDEPENDENTEMENTE SE A VARIÁVEL FOR DO MESMO TIPO OU NÃO
	 * 
	 *   EXEMPLO:
	 *   Conta c = new Conta(1001, "Kauan", 350,93);	ERRADO - A ABSTRAÇÃO PROÍBE QUE O 'new Conta()' OCORRA
	 *   Conta c2 = new ContaEmpresarial(1002, "José", 1900,00, 0.01); 	CORRETO - A ABSTRAÇÃO PERMITE QUE O TIPO SEJA DE UMA CLASSE ABSTRATA
	 *   
	 *   POR QUE SIMPLESMENTE NÃO CRIAR AS CLASSES/MÉTODOS NÃO ABSTRATOS?
	 *   Por motivos de reuso e polimorfismo, sem a classe abstrata seria necessário refazer toda a estrutura do código em cada classe
	 *   
	 * MÉTODOS ABSTRATOS: SÃO MÉTODOS QUE NÃO POSSUEM IMPLEMENTAÇÃO EM SEU CORPO, GERALMENTE QUANDO O MÉTODO É GENÉRICO DEMAIS PARA TER UMA IMPLEMENTAÇÃO,
	 * E AUTOMATICAMENTE, SE UMA CLASSE TIVER UM ÚNICO MÉTODO ABSTRATO, A CLASSE SE TORNA ABSTRATA TAMBÉM!!
	 * 
	 * 	 EXEMPLO: 
	 * 	 Um método para calcular a área de uma forma geométrica tendo duas opções, um retângulo e um círculo, a forma de calcular a área das duas formas é diferente,
	 * retângulo - base * altura, cícurlo - pi * raio², dessa forma, o método não consegue realizar os dois calculos juntos, passsando a ser abstrato e deixando com
	 * que as classes que herdam desse método realizem o calculo por si próprio
	 *   
	 */

}
