package methods;

public class OverloadCalculator {
	/*
	 * Overloading a method can be performed by providing multiple
	 * methods which share the same name, but have different
	 * parameter lists
	 */
	public void method(String word, int id) {
		
	}
	
	public void method (int id, String word) {
		
	}
	
	public double add(double a, double b) {
		return a + b;
	}
	
	public double add(int a, int b) {
		return a + b;
	}
	
	public double add(double a, int b) {
		return a + b;
	}
	
	public double add(int a, double b) {
		return a + b;
	}
	
	public double add(double a, double b, double c) {
		return a + b + c;
	}
	
	public double add(double... inputs) {
		double sum = 0;
		for (double d : inputs) {
			sum += d;
		}
		return sum;
	}
}
