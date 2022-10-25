package postfix.interpreter;

public class ReferenceError extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ReferenceError(String msg) {
		super(msg);
	}
}
