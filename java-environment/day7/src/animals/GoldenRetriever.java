package animals;

public class GoldenRetriever extends Dog {
	/*
	 * parameterized constructor
	 */
	public GoldenRetriever (String name, int age) {
		super(name, age, "Golden Retriever");
	}
	
	/*
	 * No-args (no argument) constructor
	 */
	public GoldenRetriever() {
		this("Not named", 0);
	}
	
	/*
	 * When overriding a method from a parent class, you
	 * must match the method signature of the overridden
	 * method exactly...
	 * 
	 * To help with this, Java has an annotation, called
	 * @Override
	 * 
	 * Annotations are additional meta-data (information about
	 * data) that can apply functionality or describe a
	 * particular entity (methods mostly) within a class
	 */
	@Override
	public void bark() {
		System.out.println("Bark Bark");
	}
}
