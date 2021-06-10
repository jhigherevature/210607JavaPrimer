package varargs;

public class VarArgsSimulator {

	public static void main(String... args) {
		int[] values = new int[] {5,4,6,8,3,7,9};
		varArgsMethod(8);
		varArgsMethod(9,5,4,6,8,3,7,9);
		varArgsMethod(9,values);
		
//		intArrayMethod(8);
//		intArrayMethod(9,5,4,6,8,3,7,9);
		intArrayMethod(9,values);
		
		String[] words = new String[] {"Hello", "World"};
	}

	public static void varArgsMethod(int a, int... values) {
		System.out.println("A is: " + a);
		System.out.println("Var Args:");
		for (int v : values) {
			System.out.println(v);
		}
	}
	
	/*
	 * Using an array in a method signature has some advantages and
	 * disadvantages:
	 * -An array is less flexible than a varargs, however, we
	 * can include multiple arrays, and the array does not need
	 * to be the last parameter, for example...
	 */
	public static void intArrayMethod(int a, int[] values) {
		System.out.println("A is: " + a);
		System.out.println("Var Args:");
		for (int v : values) {
			System.out.println(v);
		}
	}
}
