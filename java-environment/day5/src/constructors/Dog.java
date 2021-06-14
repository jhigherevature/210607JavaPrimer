package constructors;

public class Dog {
	public String name;
	public String breed;
	public int age;
	public double weight;
	
	/*
	 * When you provide a custom constructor Java will
	 * no longer provide you with a default, no-args,
	 * constructor
	 */
	public Dog (String name, String breed, int age, double weight) {
		this.weight = weight;
		this.breed = breed;
		this.name = name;
		this.age = age;
		System.out.println("This constructor takes 4 parameters");
		System.out.println("We are going to create an object here");
		System.out.println("Add some values together");
		System.out.println("Invoke the DB");
		System.out.println("Send a text to the owner");
	}
	
	/*
	 * The 'this' keyword can be used to invoke another
	 * constructor on the same class
	 * 
	 * or disambiguate between a variable that is shadowing
	 * a variable at an object level
	 */
	public Dog () {
		this("No Name", "No Breed", 5, 10.0);
//		this.name = "No Name";
//		this.breed = "No Breed";
//		this.age = 5;
//		this.weight = 10.0;
		System.out.println("This constructor took NO parameters");
	}
	
	/*
	 * Variable Shadowing : When you create variables in a
	 * lower scope (method scope), if a variable shares a
	 * name with a field on the object (instance scope), then
	 * the newest created variable is referenced first!
	 */
	public Dog(String name, int age) {
		this(name, "No breed provided" , age, 100.1);
		System.out.println("This constructor takes a name and age parameter");
	}
	
	public void bark() {
		System.out.println("You just invoked the Bark Method");
		System.out.println("Woof Woof");
		int sum = 100 + 25;
		System.out.println("This has nothing to do with barking: " + sum);
	}
	
	public void setName (String name) {
		this.name = name;
	}
}
