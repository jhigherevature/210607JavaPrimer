package animals;

public class Bat extends Animal implements Flyable, Nocturnal {
	public void fly() {
		System.out.println("I fly at night");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
}
