package methods;

public class Dog {
	public String name;
	
	public void bark() {
		System.out.println("Woof Woof");
	}
	
	public static void stcBark() {
		System.out.println("Bark Bark");
	}
	
	public static void main(String[] args) {
		Dog scooby = new Dog();
		scooby.name = "Scooby Doo";
		scooby.bark();
		stcBark();
		scooby.stcBark();
	}
}
