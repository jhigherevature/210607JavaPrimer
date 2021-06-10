package loops;

public class BreakAndContinue {
	public static void main(String[] args) {
		/*
		 * break and continue will apply to the closest
		 * enclosing loop or switch statement (note: switch 
		 * statements only use the break keyword)
		 */
//		System.out.println("Break Statement:");
//		for (int i = 0; i < 10; i++) {
//			if (i == 5)
//				break; // halts the execution of our loop
//			
//			System.out.println(i);
//		}
//		
//		System.out.println("Continue Statement:");
//		for (int i = 0; i < 10; i++) {
//			if (i == 5)
//				continue; // continue halts the current cycle, and 
//						  // begins at the start of the next
//			
//			System.out.println(i);
//		}		
//		for (char letter = 'A'; letter <= 'D'; letter++) {
//			for (int number = 0; number <= 4; number++) {
//				if (number == 2)
//					continue;
//				
//				System.out.println(letter + ":" + number);
//			}
//		}
		
		/*
		 * labels are custom identifiers you can apply to a loop
		 * to give you more nuanced control over the use of break
		 * and continue statements
		 */
		alphabet: for (char letter = 'A'; letter <= 'D'; letter++) {
			numeric: for (int number = 0; number <= 4; number++) {
				if (number == 2)
					continue alphabet;
				
				System.out.println(letter + ":" + number);
			}
		}
		
		System.out.println("End of Application");
	}
}
