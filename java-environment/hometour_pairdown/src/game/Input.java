package game;

import java.util.Scanner;

import fixtures.Fixture;
import fixtures.Interactable;
import fixtures.Room;

public class Input {
	/*
	 * This method prints information to the console regarding the 
	 * player's current location...
	 * This method, along with the instructions for how to play may
	 * be better suited for another separate "Menus or Display" class
	 * 
	 * You can also print information about connecting rooms here...
	 */
	public static void printRoom(Player player) {
		// TODO: Add Implementation Details...
	}
	
	/*
	 * The collectInput Method used to gather input from 
	 * the user, and convert it to an array... This array
	 * is then used with the parse method below to
	 * perform actions based on the information received
	 * 
	 * Note: The 'split()' method of String objects can 
	 * be used to provide an array of Strings from a 
	 * single string. [scan.nextLine()]
	 * 
	 * String sentence = "Hello my name is Joseph";
	 * String[] words = sentence.split(" ");
	 * The array 'words' will look like the following:
	 * ["Hello","my","name","is","Joseph"]
	 */
	public static String[] collectInput() {
		// TODO: Add Implementation Details...
		return null;
	}
	
	/*
	 * Method used to examine collected input and perform actions
	 * 
	 * This method specifically looks through the array of
	 * String objects and determines what other functionality to
	 * perform (move the player object's 'currentRoom', invoke
	 * the 'interact' method of an object, etc...) based on
	 * comparisons for the Strings in the String array
	 */
	public static void parse(String[] command, Player player) {
		// TODO: Add Implementation Details...
	}
}
