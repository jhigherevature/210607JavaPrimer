package flowcontrol;

public class Switch {
	/*
	 * Switch statements are other flow control
	 * statements that can be used to dictate the
	 * actions/operations of our program.
	 * 
	 * Specifically, switch statements can be used if
	 * you know what values a particular variable will
	 * be assigned/have some way to control the input
	 * received (you can reasonably predict the value of
	 * a variable).
	 * 
	 * Switch statement syntax:
	 * switch (variable) {
	 * 		case value_1:
	 * 			associated code;
	 * 			break;
	 * 		case value_2:
	 * 			associated code;
	 * 			break;
	 * }
	 * 
	 * Switch statements use 'fall-through' logic.
	 * This means that, once we find a match for one
	 * of our case statements, we will continue to 
	 * execute code in the proceeding case statements
	 * until we reach the end of the switch statement block
	 * or until we reach a 'break' keyword (or a 'return' 
	 * keyword) 
	 */
	public static void main(String[] args) {
		String letter = "A";
		
		switch (letter) {
		default:
			System.out.println("Too many letters...");
			break;
		case "A":
			System.out.println("A is for Assembly");
		case "B":
			System.out.println("B is for Binary");
			break;
		case "C":
			System.out.println("C is for Compilation");
		}
	}
}
