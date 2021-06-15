package overloadingpref;

public class Simulator {
	
	public static void main(String[] args) {
		method(5,4,5);
	}
	
	public static void method(long l) {
		System.out.println("Long");
	}
	
	public static void method (int i) {
		System.out.println("Int");
	}
	
	public static void method (int... is) {
		System.out.println("Var Args");
	}
	
	public static void method (int a, int b) {
		System.out.println("Two Ints");
	}
}
