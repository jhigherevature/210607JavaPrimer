package animals;

public class PetOwner {
	/*
	 * Composite relationships establish a relationship
	 * between classes
	 */
	public Animal pet;
	
	public PetOwner(Animal pet) {
		this.pet = pet;
	}
	
	public void feedPet() {
		pet.eat();
	}
}
