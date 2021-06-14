package strings;

public class Simulator {
	public static void main(String[] args) {
		/*
		 * String literals are created when you
		 * list a word within double quotes outside
		 * of any methods/constructors, etc...
		 */
		String word1 = "Revature";
		String word2 = new String("Revature");
		String word3 = "Revature";
		String word4 = "Apple";
		
		System.out.println(5 == 5);
		System.out.println(word1 == word2); // not the same
		System.out.println(word1 == word3); // the same
		System.out.println(word1 == word4); // not the same
	}
}
