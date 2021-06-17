package game;
	
import fixtures.Room;

/*
 * The RoomManager class will create the entire house 
 * and can be used to manage the rooms individually or
 * provide functionality to navigate through the house
 * in its entirety...
 */
public class RoomManager {
	// Used to determine the first room the player is placed
	private Room startingRoom;

	// Collection of all rooms in the house
	private Room[] house;
	
	/*
	 * Parameterized Constructor. roomCount is used to dictate
	 * the number of rooms of the house we create.
	 */
	public RoomManager(int roomCount) {
		super();
		house = new Room[roomCount];
	}
	
	/*
	 * The init method does ALOT and is called at the 
	 * start of the program...it will:
	 *  -create the various Room Objects
	 *  -establish connected exits to rooms
	 *  -create objects to place within the rooms
	 *  -add all rooms to the collection of rooms for the house
	 */
	public void init() {
		// EX: Creating a Room:
		Room room1 = new Room(
			"Kitchen",
			"Room 1 - Short Description",
			"Room 1 - Long Description");
		this.house[0] = room1;
		
		Room room2 = new Room(
			"Kitchen",
			"Room 2 - Short Description",
			"Room 2 - Long Description");
		this.house[1] = room2;
		
		Room[] room1Exits = new Room[]{room2, null, null, null};
		room1.setExits(room1Exits);
		// etc...
	}
	
	/*
	 * Method used to retrieve a single room based on it's
	 * index...
	 */
	public Room getRoom(int index) {
		// TODO: Add Implementation Details...
		return null;
	}
	
	/*
	 * Method used to retrieve a single room based on it's
	 * name...
	 * 
	 * Look through the entire house (array of Room objects)
	 * Compare the name of each Room Object to the parameter roomName
	 * IF a match is found, return that Object from the house array
	 * OTHERWISE Return null
	 * 
	 */
	public Room getRoom(String roomName) {
		// TODO: Add Implementation Details...
		return null;
	}
	
	// getters and setters
	public Room getStartingRoom() {
		return this.startingRoom;
	}
	
	public void setStartingRoom(Room startingRoom) {
		this.startingRoom = startingRoom;
	}
	
	public Room[] getHouse() {
		return this.house;
	}
	
	public void setHouse(Room[] house) {
		this.house = house;
	}
}
