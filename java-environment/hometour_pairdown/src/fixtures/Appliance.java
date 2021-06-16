package fixtures;

/*
 * An Appliance class can be used as a way to create
 * various types of "Appliance" objects. Note how
 * we can implement various interfaces within a class
 * to provide the general functionality, separate to
 * the Fixture class (not all fixtures can be interacted
 * with...)
 */
public class Appliance extends Fixture implements Interactable {

	public Appliance(String name, String shortDesc, String longDesc) {
		super(name, shortDesc, longDesc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void interact() {
		// TODO Auto-generated method stub
	}
}
