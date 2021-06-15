package animals;

public class Simulator {
	public static void main(String[] args) {
		Dog d = new Dog("Fido", 7, "No Breed");
		d.bark();
		
		GoldenRetriever gr = new GoldenRetriever("Ruffy", 6);
		gr.bark();
		
		Cat charles = new Cat("Charles", 4);
		
		PetOwner joseph = new PetOwner(charles);
//		c.bark();
		
		Animal anim = new Cat("Carrie", 2);
		
		Animal animal = new GoldenRetriever();
		
		Owl o = new Owl();
		o.fly();
	}
}
