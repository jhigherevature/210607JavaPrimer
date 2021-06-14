package strings;

public class StringTiming {
	/* n will control how many strings we make 
	 * (and how many times we alter string builder/buffer
	 */
	static int n = 350_000;
	
	public static void main(String[] args) {
//		createManyStrings();
//		useStringBuilder();
//		useStringBuffer();
//		String word = "";
//		System.out.println("Before Concat: " + word);
//		word = word.concat("a");
//		System.out.println("After [1] Concat: " + word);
//		word = word.concat("a");
//		System.out.println("After [2] Concat: " + word);
	}
	
	public static void createManyStrings() {
		String s = "";
		long start = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			s = s.concat("a");
		}
		long end = System.currentTimeMillis();
		System.out.println("Strings took: " + (end-start) + "ms"); 
	}
	
	public static void useStringBuilder() {
		StringBuilder sb = new StringBuilder("");
		long start = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			sb.append("a");
		}
		long end = System.currentTimeMillis();
		System.out.println("String Builder took: " + (end-start) + "ms"); 
	}
	
	public static void useStringBuffer() {
		StringBuffer sb = new StringBuffer("");
		long start = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			sb.append("a");
		}
		long end = System.currentTimeMillis();
		System.out.println("String Buffer took: " + (end-start) + "ms"); 
	}
	
}
