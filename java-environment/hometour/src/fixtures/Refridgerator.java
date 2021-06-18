package fixtures;

public class Refridgerator extends Fixture implements Interactable {
	
	public Refridgerator(String name, String shortDesc, String longDesc) {
		super(name, shortDesc, longDesc);
	}
	
	public void interact() {
		System.out.println("You open the Fridge to find it empty");
	}
}
