package animals;

/*
 * The extends keyword is used for Class heirarchy,
 * and the implements keyword is used for interface
 * heirarchy
 */
public class Bird extends Animal implements Flyable {
	public void fly() {
		System.out.println("Birds can fly too!");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
}
