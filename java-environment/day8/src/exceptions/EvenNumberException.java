package exceptions;

/*
 * EvenNumberException is a custom exception we are creating
 * so that communicate to users when an even number is detected
 * through the execution of our program
 */
public class EvenNumberException extends Exception {
	/*
	 * We provide a constructor that takes a string, to leverage
	 * the overloaded constructor of the Exception class. This
	 * allows us to display our own, custom message to a user
	 * when this exception occurs.
	 */
	public EvenNumberException(String message) {
		super(message);
	}
}
