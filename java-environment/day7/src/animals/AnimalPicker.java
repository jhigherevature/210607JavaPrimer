package animals;

import java.util.Scanner;

public class AnimalPicker {
	public static void main(String[] args) {
		Animal chosen = null;
		
		Scanner scan = new Scanner(System.in);
		
		String choice = scan.nextLine();
		
		switch (choice) {
		case "C":
			chosen = new Cat("Chuck", 3);
			break;
		case "D":
			chosen = new Dog("Dwayne", 2);
			break;
		case "S":
			chosen = new Shark("Sully", 16);
			break;
		case "B":
			chosen = new Bat();
			break;
		case "Bi":
			chosen = new Bird();
			break;
		}
	
		feedAnimal(chosen);
		chosen.giveInfo();
		
		/*
		 * You can cast a parent reference variable as ANY
		 * child class within the heirarchy at compile time...
		 * 
		 * If the reference variable was NOT created using the
		 * child class, then you will encounter a runtime error
		 */
		if (chosen instanceof Dog)
			((Dog)chosen).bark();
		
		if (chosen instanceof Flyable) {
			((Flyable)chosen).fly();
		}
//		((PetOwner)chosen).feedPet();
	}
	
	/*
	 * Covariance (a.k.a. Covariant typing) is the ability
	 * to reference a reference variable as an instance of
	 * a child object as a parent object and vice-versa
	 */
	public static void feedAnimal(Animal a) {
		a.eat();
	}
}
