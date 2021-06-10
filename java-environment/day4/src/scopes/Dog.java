package scopes;

public class Dog {
	String name;	// instance variable
	int age;		// instance variable
	
	static int count; // static variable
	
	/*
	 * Here we are providing our own custom constructor
	 * for the Dog Class. This constructor must be used when
	 * we create new dog objects. We are specifically using
	 * this constructor to create objects with different values
	 * for their fields.
	 */
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
		count++;
	}
	
	String methodInfo;
	public void speak() {
		// message exists in method scope
		String message = "my name is: " + this.name + ", I am " + this.age + " year(s) old.";
		System.out.println(message);
		this.methodInfo = message;
		for (int i = 0; i < 5; i++) {
			// i exists in this for-loop's block scope
			System.out.println(i);
		}
//		System.out.println(i); // i no longer exists outside of the for-loop
	}
}
