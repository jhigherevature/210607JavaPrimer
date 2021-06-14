package strings;

public class StringMethods {
	public static void main(String[] args) {
		/*
		 * Intern - Return the representation of a
		 * String object as if it were in the 
		 * String pool...
		 */
		String word1 = "Revature";
		String word2 = new String("Revature");
		System.out.println(word1 == word2);
		System.out.println(word1 == word2.intern());
		
		/*
		 * equals - Java provides an overridden version of
		 * the equals method for Strings that will compare
		 * the characters within strings, instead of the
		 * memory addresses
		 */
		System.out.println(word1.equals(word2));
		
		/*
		 * equalsIgnoreCase - Same as equals except we will
		 * ignore the upper/lower casing of the letters in the
		 * comparison
		 */
		System.out.println(word1.equalsIgnoreCase(word2));
		
		/*
		 * Split - The split method will return an array of
		 * Strings based on a regular expression (or a string)
		 * that you provide as an argument
		 */
		String sentence = "Hello my name is Joseph!";
		String[] words = sentence.split("e");
		for (String w : words) {
			System.out.println(w);
		}
	}
}
