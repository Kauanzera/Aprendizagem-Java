package sec13.heranca.aula1.aplicacao;

import sec13.heranca.aula1.entidades.Conta;
import sec13.heranca.aula1.entidades.ContaEmpresarial;
import sec13.heranca.aula1.entidades.ContaPoupanca;

public class Programa {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Conta c = new Conta(1001, "José", 0.0);
		ContaEmpresarial ce = new ContaEmpresarial(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING
		
		Conta c1 = ce;
		Conta c2 = new ContaEmpresarial(1004, "Adolfo", 10.0, 250.0);
		Conta c3 = new ContaPoupanca(1004, "Ana", 0.0, 0.01);
		//Um objeto da subclasse pode ser atribuído na super classe
		
		// DOWNCASTING
		
//		ContaEmpresarial ce1 = c1;	Não é permitido converter uma super classe para uma subclasse
		ContaEmpresarial ce1 = (ContaEmpresarial) c1;	//Só é possível com um casting manual
		ce1.credito(100.0);
		
/*		O compilador não vê problema, mas ao executar, ocorrerá uma exceção por que o obj c3 é do tipo Conta, mas foi instânciado como um obj ContaPoupanca
*		ContaEmpresarial ce2 = (ContaEmpresarial) c3;
*
*/		//Como evitar esse erro		
		//CONDIÇÃO QUE FALHARÁ, POR RETORNAR UMA CONDIÇÃO FALSE
		
		if (c3 instanceof ContaEmpresarial) {			
		//c3 é um obj do tipo conta, mas não é uma instância de ContaEmpresarial, e sim de ContaPoupanca 'new ContaPoupanca()'
			ContaEmpresarial ce2 = (ContaEmpresarial) c3;
			ce2.credito(500.0);
			System.out.println("EMPRÉSTIMO!");
		}
		
		//CONDIÇÃO QUE FUNCIONARÁ, POR RETORNAR UMA CONDIÇÃO TRUE
		if (c3 instanceof ContaPoupanca) {				//c3 é um obj do tipo conta que foi instanciado como ContaPoupanca - 'new ContaPoupanca()'
			ContaPoupanca c4 = (ContaPoupanca) c3; 
			c4.atualizarSaldo();
			System.out.println("ATUALIZADO!");
		}
		
	}

}
