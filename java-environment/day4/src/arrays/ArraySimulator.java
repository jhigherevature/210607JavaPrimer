package arrays;

public class ArraySimulator {
	public static void main(String args[]) {
		/*
		 * The '1' below indicates the amount of 'elements'
		 * the int array can hold.
		 * 
		 * 'elements' are the name of each item within an
		 * array or some other types of collections
		 */
		int[] one = new int[1];		// create an empty array of n size
		
		int[] two = new int[] {1,2,3}; // create an array, and populate the values
		
		/*
		 * create an array and populate values, however, 
		 * this is also known as an anonymous array assignment
		 * 
		 * anonymous array assignment can only be used when you
		 * declare a new variable, NOT when you reassign a variable
		 */
		int[] three = {1,2,3};
		
		int[] four = new int[7];
		four = new int[] {1,2,3};
//		four = {4,5,6};	// error
		
		/*
		 * The length is a property of an array that will
		 * tell you how many elements an array can hold.
		 * 
		 * The index tells you what numerical position an element
		 * exists within, inside of an array.
		 * 
		 * Indexing starts at 0. Because of this, one less than
		 * the length of an array will tell you the last index
		 */
		System.out.println(four.length - 1); 
	}
}
