package exercicios.cotacaoDolar.entidades;

public class ConversaoReal {
	
//	Métodos estáticos criados em outra classe, ainda podem ser enxergados pelo método main e não precisam ser instânciados como objeto na mesma classe.
	
	public static double imposto = 0.06;
	
	public static double conv(double dolar, double quantidade) {
		return (imposto * dolar + dolar) * quantidade;
	}
	
}
