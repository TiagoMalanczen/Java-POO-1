package exceptions;

public class EstoqueInvalidoException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public EstoqueInvalidoException(String msg) {
		super(msg);
	}
}
