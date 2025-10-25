package sec13.polimorfismo.informativo;

public class Polimorfismo {
	
	/*
	 * POLIMORFISMO: É a possibilidade de váriaveis diferentes com o mesmo tipo, serem manipuladas e apontarem para objetos de tipos diferentes,
	 * assim, se comportando de maneiras diferentes.
	 * 
	 * Exemplo Hipotético: 
	 * 
	 * Conta a = new Conta("Kauan", 21, 900.0);
	 * Conta b = new ContaEmpresarial("Josef", 42, 18000.00, 0.01);
	 * 
	 * a.saque(500.0);	//Realizarpa o saque sem juros, pois NÃO EXISTE juros no método da classe Conta
	 * b.saque(500.0);	//Realizará o saque com juros, pois EXISTE juros no método da classe ContaEmpresarial
	 * 
	 * O COMPILADOR NÃO SABE PARA QUAL TIPO EXPECÍFICO O MÉTODO SAQUE ESTÁ SENDO CHAMADO (SÓ SABE QUE AS VARIÁVEIS SÃO DO TIPO 'CONTA')
	 */

}
