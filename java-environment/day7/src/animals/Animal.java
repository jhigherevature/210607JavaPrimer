package animals;

/*
 * When a class is defined as abstract, you cannot create
 * the class directly, you must create the class using a
 * child class constructor
 */
public abstract class Animal extends Object {
	public String name;
	public String type;
	public int age;
	
	/*
	 * the abstract keyword, when used with methods, allow you
	 * to define the method, but not provide a body. The body
	 * must be implemented in a concrete (non-abstract) subclass.
	 * 
	 * abstract methods can only exist in abstract classes (or interfaces)
	 */
	public abstract void eat();
	
	public void giveInfo() {
		System.out.println("name: " + name);
		System.out.println("type: " + type);
		System.out.println("age: " + age);
	}
	
	/*
	 * When you create a custom constructor, you lose the
	 * default one!
	 */
	public Animal(String name, String type, int age) {
		super();
		this.name = name;
		this.type = type;
		this.age = age;
	}
	
	
	public Animal(String type) {
		this("No name", type, 0);
	}
	
	/*
	 * This is what the default constructor looks like:
	 */
	public Animal() {
		super();
	}
}
