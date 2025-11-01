package sec14.excecoes.tryCatch.exercicio.model.execoes;

public final class execaoDominio extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public execaoDominio(String msg) {
		super(msg);
	}
	
}
