package game;

public class Runner {
	/*
	 * We only need one room manager, so we will make it static
	 * The '4' passed to the RoomManager constructor is used
	 * to arbitrarily establish the starting size for the house
	 */
	private static RoomManager manager = new RoomManager(4);
	
	// Boolean used to control when our game is running. We set it to true initially
	private static boolean running = true;
		
	// Main application method
	public static void main(String[] args) {
		// Run the init method to instantiate our house
		manager.init();		
		
		/* Create the player here. 
		 * Note: We could have made the player a static reference 
		 * much like our RoomManager...
		 */
		Player player = new Player();
		
		System.out.println("Here, we can print a message about"
				+ "how to play the game. "
				+ "\nIncluding directions and what commands to use..."
				+ "\nYou can also save this message as a method which prints "
				+ "\nto the console, if you want to be able to print"
				+ "\nthe instructions at any time...");
		
		
		// The player should start in the 'starting room'
		player.setCurrentRoom(manager.getStartingRoom());
		
		/*
		 * The logic for our Game loop can be VERY simple...
		 * All we need to do is:
		 *   -Print the player's current room
		 *   -Ask for more input
		 *   -Parse that input
		 *   
		 * We could also print a list of commands as a reference...
		 */
		while (running) {
			Input.printRoom(player);
			String[] input = Input.collectInput();
			Input.parse(input, player);
		}
		
		/*
		 * Technically, this if statement is redundant...we will only reach
		 * this line, if 'running' ceases to be true...
		 */
		if (!running) {
			System.out.println("Thanks for playing");
		}
	}
	
	/*
	 * Since 'running' is a private field, we need a method to be
	 * able to change it's value. This can be called from other classes
	 * (such as Input) to end our game based on input received
	 */
	public static void endGame() {
		running = false;
	}
}
