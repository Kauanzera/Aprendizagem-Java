package sec14.excecoes.exPersonalizadas.boa.model.exceptions;

public final class ExecaoDominio extends RuntimeException /*Exception  -> É obrigatório lançar tratamento para esse tipo de exeção*/{

	private static final long serialVersionUID = 1L;

	public ExecaoDominio (String mensagem) {
		super(mensagem);
	}

}
