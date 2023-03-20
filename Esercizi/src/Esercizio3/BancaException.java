package Esercizio3;

public class BancaException extends Exception {

	String msg;
	
	public BancaException(String m) {
		super();
		this.msg = m;
	}
	
}
