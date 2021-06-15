package animals;

public class Cat extends Animal {
	public Cat(String name, int age) {
		super(name, "Cat", age);
	}
	
	public void eat() {
		System.out.println("Cats are carnivorous");
	}
}
