package operators;

public class Ternary {
	/*
	 * Ternary operators can act similarly to 
	 * a shorthand if-else statement, however
	 * remember that all operators return a value, 
	 * and as such, we must still adhere to using
	 * the returned value in another statement,
	 * operation or assign the value to a variable.
	 * 
	 * Ternary Syntax:
	 * 	(condition) ? expr-return-if-true : expr-return-if-false
	 */
	public static void main(String[] args) {
		
		int x = true ? 15 : 25;
		int y = false ? 15 : 25;
		
		String result = (x > y) ? "X is greater" : "Y is greater";
		System.out.println(result);
	}
}
