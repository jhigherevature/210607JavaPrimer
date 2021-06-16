package fixtures;

/*
 * The Fixture class acts as a superclass to the various
 * rooms and items within your project, to serve as a 
 * structure for the important information (name, description)
 * of the various objects.
 */
public abstract class Fixture {
	/*
	 * Name of the room i.e. "Foyer", "Kitchen", "Garage"...
	 * OR other item i.e. "Fridge", "Toilet", "Lamp"...
	 */
	protected String name;
	
	// Short description of room/item "A Large Foyer", "A Modern Kitchen"...
	protected String shortDesc;
	
	/*
	 * Long description of room/item "This kitchen has oak cabinets, a stainless steel fridge..."
	 */
	protected String longDesc;
	
	// Parameterized Constructor
	public Fixture(String name, String shortDesc, String longDesc) {
		super();
		this.name = name;
		this.shortDesc = shortDesc;
		this.longDesc = longDesc;
	}

	// Getters and Setters:
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getShortDesc() {
		return shortDesc;
	}

	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}

	public String getLongDesc() {
		return longDesc;
	}

	public void setLongDesc(String longDesc) {
		this.longDesc = longDesc;
	}

	// Overridden toString method
	public String toString() {
		return "Fixture [name=" + name + ", shortDesc=" + shortDesc + ", longDesc=" + longDesc + "]";
	}
}
