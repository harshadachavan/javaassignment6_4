package exceptioncutom;
//Define a custom exception class that inherits from Exception class
public class BankATMException extends Exception {
	
	public BankATMException(String message) {
		super(message);
		}

}
