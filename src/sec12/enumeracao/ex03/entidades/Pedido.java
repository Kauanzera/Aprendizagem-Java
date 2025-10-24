package sec12.enumeracao.ex03.entidades;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import sec12.enumeracao.ex03.entidades.enums.StatusPedido;

public class Pedido {
	
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	
	private LocalDateTime momento;
	private StatusPedido status;
	
	private List<PedidoItem> itens = new ArrayList<>();
	
	private Cliente cliente;

	public Pedido() {}
	public Pedido(LocalDateTime momento, StatusPedido status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public LocalDateTime getMomento() {
		return momento;
	}
	
	public void setMomento(LocalDateTime momento) {
		this.momento = momento;
	}
	
	public StatusPedido getStatus() {
		return status;
	}
	
	public void setStatus(StatusPedido status) {
		this.status = status;
	}
	
	public List<PedidoItem> getItens() {
		return itens;
	}

	public void addItem(PedidoItem item) {
		itens.add(item);
	}
	
	public void removerItem(PedidoItem item) {
		itens.remove(item);
	}
	
	public Double total() {
		double val = 0;
		
		for (PedidoItem p : itens) {
			val += p.subTotal();
		}
		return val;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("\nPedido Detalhado: \nMomento do Pedido: %s \nStatus do Pedido: %s\n", momento.format(fmt), status));
		sb.append(cliente);
		sb.append("\nNota do(s) Item(s): \n");
		for (PedidoItem i : itens) {
			sb.append(i + "\n");
		}
		sb.append(String.format("Valor Total: %.2f", total()));
		return sb.toString();
	}
	

}
