package basics;

import other.Data;

public class Primitives {
	public static void main(String[] args) {
		/*
		 * When creating variables in java
		 * we must specficy the datatype for
		 * the variable in question.
		 * 
		 */
		byte b = 127;
		short s = 12345;
		int byteInt = b;
		
		int i = 1000000;
		long l = 10000000000L;
		
		char c = 'c';
		char num = 97;
		System.out.println(num);
		
		float f = 12345.1F;
		double d = 12345.1;
		
		int ugly = 1_____00___0;
		int underscore = 1_000_000;
		
		long big = 10; // implicit casting
		int large = (int)big; // explicit casting
	}
	
	public void example() {
		/*
		 * The 'new' keyword is used
		 * to create objects from a 
		 * class
		 */
		Data d = new Data();
	}
}
