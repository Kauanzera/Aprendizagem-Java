package sec12.enumeracao.entidades;

import java.time.LocalDateTime;

import sec12.enumeracao.entidades.enums.StatusPedido;

public class Pedido {
	
	private int id;
	private LocalDateTime data;
	private StatusPedido status;
	
	public Pedido(int id, LocalDateTime data, StatusPedido status) {
		this.id = id;
		this.data = data;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return String.format("Pedido: \n%d \n%s \n%s \n", getId(), getData(), getStatus());
	}
	
	

}
