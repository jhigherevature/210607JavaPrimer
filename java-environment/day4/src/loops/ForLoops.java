package loops;

public class ForLoops {
	public static void main(String[] args) {
		/*
		 * For Loop Syntax:
		 * for (initialization; condition; modification) {
		 * 	//associated code
		 * }
		 * 
		 * Initialization - A statement that executes at the start
		 * of our for loop
		 * 
		 * Condition - The driving statement for our for-loop. So long
		 * as this boolean expression is true, our for-loop will
		 * execute. By default, java treats the condition as true.
		 * 
		 * Update/Modification - Statement which executes at the end
		 * of each cycle of our for-loop
		 */
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		int[] numbers = new int[] {123,56,214,765243,6575};
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		/*
		 * Enhanced for-loop can be used with objects that
		 * are 'iterable'. These include arrays, or collections
		 * within the java API that implement the 'iterable' 
		 * interface
		 * 
		 * enhanced for-loop syntax:
		 * for (variable : collection) {
		 * }
		 */
		System.out.println("Enhanced For-loop");
		for (int num : numbers) {
			System.out.println(num);
		}
		
		int x = 0;
		for ( ; ; ) {
			if (x >= 10)
				break;
			
			System.out.println(x);
			x++;
		}
	}
}
