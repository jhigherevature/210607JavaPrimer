package operators;

public class Unary {
	/*
	 * Use CTRL (or CMD on Mac) + Space to open
	 * the context menu
	 */
	public static void main(String[] args) {
		int post = 10;
		System.out.println(post); // 10
		System.out.println(post++); // 10
		System.out.println(post); // 11
		
		int pre = 10;
		System.out.println(pre); // 10
		System.out.println(++pre); // 11
		System.out.println(pre); // 11
		
		System.out.println(true); // true
		System.out.println(!true); // false
		System.out.println(false); // false
		System.out.println(!false); // true
	}
}
