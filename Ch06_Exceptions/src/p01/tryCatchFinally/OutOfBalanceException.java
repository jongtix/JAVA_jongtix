package p01.tryCatchFinally;

public class OutOfBalanceException extends Exception {
	
	String message;
	
	OutOfBalanceException(String message) {
		this.message = message; 
	}
	
	@Override
	public String getMessage() {
		return message;
	}
}
