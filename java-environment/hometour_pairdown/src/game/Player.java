package game;

import fixtures.Room;

/*
 * The player class represents the user's current
 * position within a house.
 */
public class Player {
	private Room currentRoom;
	
	public Room getCurrentRoom() {
		return currentRoom;
	}
	
	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}
}
