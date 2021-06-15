package animals;

/*
 * The 'extends' keyword establishes a child/parent relationship
 * The child class 'extends' the parent class
 */
public class Dog extends Animal {
	public String breed;
	
	public Dog(String name, int age) {
		super(name, "Dog", age);
	}
	
	public Dog(String name, int age, String breed) {
		super(name, "Dog", age);
		this.breed = breed;
	}
	
	public void bark() {
		System.out.println("Woof Woof");
	}
	
	public void printFields() {
		System.out.println(this.age);
		System.out.println(this.name);
		System.out.println(this.type);
	}

	@Override
	public void eat() {
		System.out.println("Dogs can eat veggies and meat");
	}
}
