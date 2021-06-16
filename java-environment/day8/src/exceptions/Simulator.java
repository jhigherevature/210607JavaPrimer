package exceptions;

public class Simulator {
	public static void main(String[] args) {
		/*
		 * The '%' is the modulus operator. The Modulus operator
		 * will divide the first operand by the second and return
		 * the remainder (without the quotient)...
		 */
		System.out.println(5 % 2); // 1
		System.out.println(10 % 3); // 1
		System.out.println(10 % 4); // 2
		System.out.println(10 % 6); // 4
		
		try {
			sumOddNumbers(3,4);
		} catch (EvenNumberException e) {
			/*
			 * The 'printStackTrace' method exists on our Exception & 
			 * Error objects as a tool which can display the steps our
			 * program took before reaching some exception/error
			 */
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	/*
	 * When you use the 'throws' declaration, this means you are 'ducking'
	 * the resolution of an exception/error in your program. 'Ducking' is a
	 * way to consolidate where and when you utilize a try/catch block to
	 * resolve problems within your program...
	 */
	public static int sumOddNumbers(int a, int b) throws EvenNumberException  {
		if (a % 2 == 0) {
			throw new EvenNumberException("Input 1 was even");
		}
		
		if (b % 2 == 0) {
			throw new EvenNumberException("Input 2 was even");
		}
		
		return a+b;
	}
}
