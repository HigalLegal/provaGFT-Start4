package model.exceptions;

public class NumeroNegativoException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public NumeroNegativoException(String msg) {
		super(msg);
	}
}
