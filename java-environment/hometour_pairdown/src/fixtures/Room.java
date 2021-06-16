package fixtures;

/*
 * The Room class is a representation for the various rooms
 * that will exist in your project. 
 */
public class Room extends Fixture {
	/*
	 * An Array of Room objects can be used to allow Rooms
	 * to know which rooms are "connected" in our house
	 */
	private Room[] exits;
	
	/*
	 * An array of Fixtures objects can be used to provide
	 * interactable or other items within each Room
	 */
	private Fixture[] items;

	public Room(String name, String shortDesc, String longDesc) {
		super(name, shortDesc, longDesc);
	}
	
	public Room[] getExits() {
		return this.exits;
	}
	
	/*
	 * This method can be used to obtain a specific room
	 * based on the direction or possible name...
	 */
	public Room getExit(String direction) { 
		// TODO: Add Implementation Details...
		return null;
	}
	
	// setter for exits
	public void setExits(Room[] exits) {
		this.exits = exits;
	}

	// Overloaded setter method. Allows us to set single exit based on index...
	public void setExits(Room exit, int index) {
		this.exits[index] = exit;
	}
	
	public Fixture[] getItems() {
		return items;
	}
	
	public void setItems(Fixture... items) {
		this.items = items;
	}
}
