package operators;

import other.Data;

public class ShortCut {
	public static void main (String[] args) {
		// the '+' with Strings performs String concatenation
//		System.out.println("Hello " + 1 + " World");
//		System.out.println("Concatenate: " + 5 + 5);
//		System.out.println("Concatenate: " + (5 + 5));
//		System.out.println(5+5 + " :Concatenate");
		
//		int x = 5;
//		System.out.println(++x + 5 + " :Concatenate: " + x+5);
		
		/*
		 * Logical & (and shortcircuit &&) will return
		 * 	true, only when both boolean operands are true
		 * 
		 * Logical | (and shortcircuit ||) will return
		 * 	false, only when both boolean operands are false
		 * 
		 */
		if (returnFalse() || calculateAndReturnTrue()) {
//			System.out.println("This will not print");
		} else {
//			System.out.println("This will print");
		}
		
//		if (calculateAndReturnTrue() | returnFalse()) {
//			
//		}
		
		int y = 99;
		y = 100;
		
		int a = y = 60;
		System.out.println(y);
		System.out.println(a);
	}
	
	public static boolean returnFalse() {
		// Log information to a file!
		Data d = new Data();
		// Ask user for input
		System.out.println("This is the return false method");
		return false;
	}
	
	public static boolean calculateAndReturnTrue() {
		System.out.println("This is the calculate and return true method");
		return true;
	}
}
