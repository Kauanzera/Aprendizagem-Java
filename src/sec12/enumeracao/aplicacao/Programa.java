package sec12.enumeracao.aplicacao;

import java.time.LocalDateTime;

import sec12.enumeracao.entidades.Pedido;
import sec12.enumeracao.entidades.enums.StatusPedido;

public class Programa {
	public static void main(String[] args) {
		
		LocalDateTime d1 = LocalDateTime.now();
		
		Pedido p = new Pedido(1080, d1, StatusPedido.AGUARDANDO_PAGAMENTO);
		
		System.out.println(p);
		
		StatusPedido a = StatusPedido.EM_ANDAMENTO;
		System.out.println(a);
		
		String c = "ENTREGUE";		
		StatusPedido b = StatusPedido.valueOf(c);
		System.out.println(b);
		
	}

}
