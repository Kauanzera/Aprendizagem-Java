package sec13.sobreposicao.aula1.aplicacao;

import sec13.sobreposicao.aula1.entidades.Conta;
import sec13.sobreposicao.aula1.entidades.ContaEmpresarial;
import sec13.sobreposicao.aula1.entidades.ContaPoupanca;

public class Programa {
	public static void main(String[] args) {
		
		Conta c = new Conta(1, "Kauan", 1000.0);
		Conta c2 = new ContaPoupanca(2, "Jonas", 1000.0, 0.01);
		Conta c3 = new ContaEmpresarial(1003, "Carol", 1000.0, 0.01);
		
		c.saque(200.0);
		System.out.printf("1000.0 - 200.0 (-5.0 juros) = %.2f\n", c.getSaldo());	//Com juros porque c é instânciado como Conta
		
		c2.saque(200.0);
		System.out.printf("1000.0 - 200.0 (sem juros) = %.2f\n", c2.getSaldo());		//Sem juros porque c2 é instânciado como ContaPoupanca
		
		//Usando método com Super(), para reaproveitar um método já existente e implementar mais regras nele
		c3.saque(200.0);
		System.out.printf("1000.0 - 200.0 (-7.0 juros) = %.2f\n", c3.getSaldo());		//Utilizando o .saque() da ContaEmpresarial
	}

}
