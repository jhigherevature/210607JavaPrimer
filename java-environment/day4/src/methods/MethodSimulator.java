package methods;

public class MethodSimulator {
	public static int giveNumber(int a, int b, boolean evaluate) {
		int sum = a + b;
		if (evaluate) {
			return sum - 12;
		} else {
			return sum / 12;
		}
	}
	public static void main(String[] args) {
		/*
		 * Arguments are the values to provide to a method
		 * Parameters are the values you define when creating
		 * a variable
		 */
		giveNumber(5,10,true);
		
		// ask for input...
		System.out.println("Your conversion is: " + anyConversion(100.0, "FtoC"));
	}
	
	// simple conversion
	public static void mToKm(double distance) {
		double km = distance/1000;
		System.out.println(distance + " in meters is: " + km + " in Km." );
	}
	
	public static double anyConversion(double input, String type) {
		double result = 0.0;
		switch (type) {
		case "mToKm":
			result = input/1000;
			break;
		case "FtoC":
			result = input * 5/9 - 32;
			break;
		}
		// our method must return a double in any scenario cases...
		return result;
	}
}
