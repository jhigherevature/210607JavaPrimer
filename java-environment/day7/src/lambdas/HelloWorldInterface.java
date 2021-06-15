package lambdas;

/*
 * Functional Interfaces are interfaces that only
 * contain a single abstract method. 
 * 
 * The @FunctionalInterface annotation helps define
 * functional interfaces by providing compile time errors
 * when an interface does not contain a single abstract
 * method
 */
@FunctionalInterface
public interface HelloWorldInterface {
	public void sayHello();
}
