package animals;

public class Shark extends Animal {
	public Shark(String name, int age) {
		super(name, "Shark", age);
	}
	
	public void eat() {
		System.out.println("snap-gulp");
	}
}



