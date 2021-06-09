package flowcontrol;

public class IfStatements {
	public static void main(String[] args) {
		int x = -5;
		/*
		 * If statement syntax:
		 * if (boolean expression) {
		 * 		// associated code
		 * } else {
		 *  	// associated code
		 * }
		 */
		if (x > 0) {
			System.out.println("X is positive");
			if (x > 10) {
				System.out.println("X is greater than 10");
			} else {
				System.out.println("X is less than 10");
			}
			
		} else if (x == 0) {
			System.out.println("X is zero");
		} else {
			System.out.println("X is not positive");
		}
		
		System.out.println("End of Program!");
	}
}
